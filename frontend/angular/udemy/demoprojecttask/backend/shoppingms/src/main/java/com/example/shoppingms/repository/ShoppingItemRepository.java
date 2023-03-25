package com.example.shoppingms.repository;

import com.example.shoppingms.entity.ShoppingItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoppingItemRepository extends JpaRepository<ShoppingItem,String> {
}
