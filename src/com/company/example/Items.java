package com.company.example;

public class Items {

    private double price;
    private String itemName;
    private int quanity;
    private String dateReceived;


    public Items(double price, String itemName, int quanity, String dateReceived) {
        this.price = price;
        this.itemName = itemName;
        this.quanity = quanity;
        this.dateReceived = dateReceived;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    public String getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(String dateReceived) {
        this.dateReceived = dateReceived;
    }
}
