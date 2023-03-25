package com.example.shoppingms.service;

import com.example.shoppingms.entity.ShoppingItem;
import com.example.shoppingms.exception.ShoppingItemNotFoundException;
import com.example.shoppingms.repository.ShoppingItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class ShoppingItemServiceImpl implements IShoppingItemService{
    @Autowired
    private ShoppingItemRepository repository;

    private Random random=new Random();

    public String generateId(){
        StringBuilder builder=new StringBuilder();
        for(int i=0;i<10;i++){
            int randomNum=random.nextInt(9);
            builder.append(randomNum);
        }
        String generateId=builder.toString();
        return generateId;
    }


    @Override
    public ShoppingItem add(ShoppingItem shoppingItem) {
        shoppingItem.setId(generateId());
        ShoppingItem added=repository.save(shoppingItem);
        return added;
    }

    @Override
    public ShoppingItem changeAmount(String id, double amount) throws ShoppingItemNotFoundException {
        ShoppingItem shoppingItem=findById(id);
        shoppingItem.setAmount(amount);
        ShoppingItem updated=repository.save(shoppingItem);
        return updated;
    }

    @Override
    public ShoppingItem findById(String id) throws ShoppingItemNotFoundException {
        Optional<ShoppingItem> found=repository.findById(id);
        if(!found.isPresent()){
            throw new ShoppingItemNotFoundException("shopping item not found for id "+id);
        }
        return found.get();
    }

    @Override
    public void delete(String id) throws ShoppingItemNotFoundException {
       ShoppingItem shoppingItem=findById(id);
       repository.delete(shoppingItem);
    }

    @Override
    public List<ShoppingItem> findAll() {
        return repository.findAll();
    }
}
