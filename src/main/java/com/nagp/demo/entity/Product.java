package com.nagp.demo.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Entity
@Table(name = "products")
@Data
public class Product {

    @Id
    private Long productId;

    @NotBlank(message = "name shouldn't be null")
    private String name;

    @NotNull
    @Positive(message = "price should be positive")
    private double price;
}
