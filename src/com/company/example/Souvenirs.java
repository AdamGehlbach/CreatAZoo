package com.company.example;

public class Souvenirs {

    private String type;
    private int idNumber;

    public Souvenirs(String type, int idNumber) {
        this.type = type;
        this.idNumber = idNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
}
