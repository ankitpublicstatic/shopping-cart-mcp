package com.ankit.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "cart_items")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {

  @Id
  private String id;

  private String productId;
  private String productName;
  private double price;
  private int quantity;

}
