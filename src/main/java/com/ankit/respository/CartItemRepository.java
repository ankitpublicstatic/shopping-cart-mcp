package com.ankit.respository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.ankit.entity.CartItem;

public interface CartItemRepository extends MongoRepository<CartItem, String> {

    CartItem findByProductId(String productId);
    void deleteByProductId(String productId);
}
