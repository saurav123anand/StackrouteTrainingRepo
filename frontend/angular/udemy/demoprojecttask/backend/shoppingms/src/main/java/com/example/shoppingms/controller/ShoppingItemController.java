package com.example.shoppingms.controller;

import com.example.shoppingms.entity.ShoppingItem;
import com.example.shoppingms.service.IShoppingItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/shoppingitem")
public class ShoppingItemController {
    @Autowired
    private IShoppingItemService service;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/add")
    public ShoppingItem add(@RequestBody ShoppingItem requestData){
        ShoppingItem response=service.add(requestData);
        return response;
    }
    @GetMapping("/findbyid/{id}")
    public ShoppingItem findById(@PathVariable String id) throws Exception{
        ShoppingItem response=service.findById(id);
        return response;
    }
    @GetMapping("/findall")
    public List<ShoppingItem> findAll(){
        List<ShoppingItem> response=service.findAll();
        return response;
    }
    @PutMapping("/update/amount/{id}")
    public ShoppingItem changeAmount(@PathVariable String id,@RequestBody ShoppingItem requestData) throws Exception{
        ShoppingItem response=service.changeAmount(id,requestData.getAmount());
        return response;
    }
    @DeleteMapping("/deletebyid/{id}")
    public void delete(@PathVariable String id) throws Exception{
        service.delete(id);
    }
}
