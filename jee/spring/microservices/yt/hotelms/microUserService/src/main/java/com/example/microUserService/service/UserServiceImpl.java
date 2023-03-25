package com.example.microUserService.service;

import com.example.microUserService.entities.Hotel;
import com.example.microUserService.entities.Rating;
import com.example.microUserService.entities.User;
import com.example.microUserService.exception.UserNotFoundException;
import com.example.microUserService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserRepository repository;
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public User saveUser(User user) {
        String randomUserId = UUID.randomUUID().toString();
        user.setUserId(randomUserId);
        User added = repository.save(user);
        return added;
    }

    @Override
    public List<User> getAllUser() {
        List<User> users= repository.findAll();
        return users;
    }

    @Override
    public User findById(String id) {
        User user= repository.findById(id).orElseThrow(() -> new UserNotFoundException("user not found for id " + id));
        //String ratingsUrl="http://localhost:8080/ratings/users/"+user.getUserId();
        String ratingsUrl="http://RATING-SERVICE/ratings/users/"+user.getUserId();
        Rating[] ratingsOfUser = restTemplate.getForObject(ratingsUrl, Rating[].class);

        List<Rating> ratings = Arrays.asList(ratingsOfUser);
       // List<Rating> ratingsWithHotel=new ArrayList<>();
        for(Rating rating:ratings){
            //api calls to hotel service to get the hotel
            //set the hotel to the rating
            //String url="http://localhost:8085/hotels/findbyid/"+rating.getHotelId();
            String url="http://HOTEL-SERVICE/hotels/findbyid/"+rating.getHotelId();
            Hotel hotel = restTemplate.getForObject(url, Hotel.class);
            rating.setHotel(hotel);
        }
        user.setRatings(ratings);
        return user;
    }
}
