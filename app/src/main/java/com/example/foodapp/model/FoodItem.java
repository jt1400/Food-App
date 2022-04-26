package com.example.foodapp.model;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;

import com.example.foodapp.serializer.ImageOperations;

import java.time.LocalDate;
import java.util.Date;

public class FoodItem {
    private String foodName;
    private int weight; //in gram
    private FoodType type;
    private LocalDate expiryDate;
    private String encodedImage;

    enum FoodType {
        DAIRY,
        VEGETABLE,
        MEAT,
        OTHER
    }

    public FoodItem(String name){
        foodName = name;
        weight = 0;
        type = FoodType.OTHER;
        expiryDate = LocalDate.now();
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public FoodType getType() {
        return type;
    }

    public void setType(FoodType type) {
        this.type = type;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void setEncodedImage(String encodedImage) {
        this.encodedImage = encodedImage;
    }

    //Use this to quickly return an image bitmap
    public Bitmap getImageBitmap() {
        if (encodedImage == null) {
            return null;
        }
        else{
            return ImageOperations.decodeBitmap(encodedImage);
        }
    }
}
