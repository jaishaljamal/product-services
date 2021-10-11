package com.products.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue
    private int id;
    @NotBlank(message = "Please enter the name of the product")
    private String name;
    @NotBlank(message = "Please enter the quantity")
    private String quantity;
    @NotBlank(message = "Please enter the price")
    private String price;
}