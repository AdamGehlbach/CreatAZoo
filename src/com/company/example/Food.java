package com.company.example;

public class Food {
    private String category;
    private int expirationDate;
    private boolean isRefigrated;


    public Food(String category, int expirationDate, boolean isRefigrated) {
        this.category = category;
        this.expirationDate = expirationDate;
        this.isRefigrated = isRefigrated;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isRefigrated() {
        return isRefigrated;
    }

    public void setRefigrated(boolean refigrated) {
        isRefigrated = refigrated;
    }
}
