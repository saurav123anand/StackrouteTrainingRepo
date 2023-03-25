package com.example.shoppingms.service;

import com.example.shoppingms.entity.ShoppingItem;
import com.example.shoppingms.exception.ShoppingItemNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@Validated
public interface IShoppingItemService {
    ShoppingItem add(@Valid ShoppingItem shoppingItem);
    ShoppingItem changeAmount(String id,@Min(1) double amount) throws ShoppingItemNotFoundException;
    ShoppingItem findById(String id) throws ShoppingItemNotFoundException;
    void delete(String id) throws ShoppingItemNotFoundException;
    List<ShoppingItem> findAll();
}
