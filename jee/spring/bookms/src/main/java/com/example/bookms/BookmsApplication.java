package com.example.bookms;

import com.example.bookms.entity.*;
import com.example.bookms.repository.CategoryRepository;
import com.example.bookms.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BookmsApplication implements CommandLineRunner {
	@Autowired
	private StudentRepository repository;
	@Autowired
	private CategoryRepository categoryRepository;
	public static void main(String[] args) {
		SpringApplication.run(BookmsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Student student=new Student();
//		student.setStudentId(13);
//		student.setStudentName("saurav");
//		student.setAbout("i'm software engineer");
//
//		Laptop laptop=new Laptop();
//		laptop.setLaptopId(14);
//		laptop.setBrand("DELL");
//		laptop.setModelNumber("12563");
//		laptop.setStudent(student);
//		student.setLaptop(laptop);
//
//		Student save=repository.save(student);

		// reading
//		Student student=repository.findById(13).get();
//		System.out.println(student.getLaptop().getLaptopId()+" "+student.getLaptop().getModelNumber());


		//ONE TO MANY
//		Student student=new Student();
//		student.setStudentId(13);
//		student.setStudentName("saurav");
//		student.setAbout("i'm software engineer");
//
//		Address address1=new Address();
//		address1.setAddressId(1);
//		address1.setStreet("234/456");
//		address1.setCity("Kolkata");
//		address1.setCountry("India");
//		address1.setStudent(student);
//
//		Address address2=new Address();
//		address2.setAddressId(2);
//		address2.setStreet("456/896");
//		address2.setCity("Mumbai");
//		address2.setCountry("India");
//		address2.setStudent(student);
//
//		List<Address> addressList=new ArrayList<>();
//		addressList.add(address1);
//		addressList.add(address2);
//
//		student.setAddressList(addressList);
//
//		Student added=repository.save(student);

		//MANY TO MANY
		Product product1=new Product();
		product1.setProductId(1);
		product1.setProductName("Iphone 14 pro max");

		Product product2=new Product();
		product2.setProductId(2);
		product2.setProductName("samsung s22 ultra");

		Product product3=new Product();
		product3.setProductId(3);
		product3.setProductName("poco m3");

		Category category1=new Category();
		category1.setCategoryId(10);
		category1.setTittle("Electronics");

		Category category2=new Category();
		category2.setCategoryId(11);
		category2.setTittle("Mobile Phone");

		List<Product> category1Products = category1.getProducts();
		category1Products.add(product1);
		category1Products.add(product2);
		category1Products.add(product3);

		List<Product> category2Products = category2.getProducts();
		category2Products.add(product1);
		category1Products.add(product2);

		categoryRepository.save(category1);
		categoryRepository.save(category2);




	}
}
