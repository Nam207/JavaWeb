/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author nam
 */
public class product {
    private int id;
    private String name;
    private String image;
    private BigDecimal price;
    private int size;
    private int amount;
    private String description;
    private String title;
    private String color;
    private boolean gender;
    private int catID;

    public product(int id, String name, String image, BigDecimal price, int size, int amount, String description, String title, String color, boolean gender, int catID) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
        this.size = size;
        this.amount = amount;
        this.description = description;
        this.title = title;
        this.color = color;
        this.gender = gender;
        this.catID = catID;
    }

    public int getCatID() {
        return catID;
    }

    public void setCatID(int catID) {
        this.catID = catID;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "product{" + "id=" + id + ", name=" + name + ", image=" + image + ", price=" + price + ", size=" + size + ", amount=" + amount + ", description=" + description + ", title=" + title + ", color=" + color + ", gender=" + gender + ", catID=" + catID + '}';
    }

    
}
