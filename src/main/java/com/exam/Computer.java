package com.exam;

public class Computer {
    String brand="Dell";
    String processor;
    double price;

    public Computer() {
    }

    public Computer(String b) {
        this.brand=b;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
