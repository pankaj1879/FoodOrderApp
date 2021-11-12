package com.example.foodorderapp.Models;

public class OrdersModel {

    int ordeImage;
    String soldItemName , price , orderNumber ;

    public OrdersModel(int ordeImage, String soldItemName, String price, String orderNumber) {
        this.ordeImage = ordeImage;
        this.soldItemName = soldItemName;
        this.price = price;
        this.orderNumber = orderNumber;
    }

    public int getOrdeImage() {
        return ordeImage;
    }

    public void setOrdeImage(int ordeImage) {
        this.ordeImage = ordeImage;
    }

    public String getSoldItemName() {
        return soldItemName;
    }

    public void setSoldItemName(String soldItemName) {
        this.soldItemName = soldItemName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
}
