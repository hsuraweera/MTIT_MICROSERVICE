package com.mtit.microservices.foodservice.utils;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Food {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String foodID;
    private String foodName;

    private String foodStock;
    private String foodCategory;
    protected String foodPrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFoodID(String foodID) {
        return foodID;
    }
    public void setFoodID(String foodID) {
        this.foodID = foodID;
    }
    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodStock() {
        return foodStock;
    }

    public void setFoodStock(String foodStock) {
        this.foodStock = foodStock;
    }

    public String getFoodCategory() {
        return foodCategory;
    }

    public void setFoodCategory(String foodCategory) {
        this.foodCategory = foodCategory;
    }

    public String getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(String foodPrice) {
        this.foodPrice = foodPrice;
    }
}