package com.company.example.animals;

public class Rabbit extends Animal {

    private Double Earlength;
    private String Furcolor;
    private String Favoritefood;


    public Rabbit(String name, String location, char gender, double weight, Double earlength, String furcolor) {
        super(name, location, gender, weight);
        Earlength = earlength;
        Furcolor = furcolor;
    }

    public Double getEarlength() {
        return Earlength;
    }

    public void setEarlength(Double earlength) {
        Earlength = earlength;
    }

    public String getFurcolor() {
        return Furcolor;
    }

    public String getFavoritefood() {
        return Favoritefood;
    }

    public void setFavoritefood(String favoritefood) {
        Favoritefood = favoritefood;
    }
}
