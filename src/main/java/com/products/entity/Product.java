package com.products.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int product_id;
    @NotBlank(message = "Please enter the name of the product")
    private String product_name;
    @NotBlank(message = "Please enter the price")
    private String product_price;
    @NotBlank(message = "Please enter the rating")
    private String product_rating;
}
