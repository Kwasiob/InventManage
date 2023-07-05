package model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Product {

    private ObservableList<Part> associatedParts;
    private int id;
    private String name;
    private double price;
    private int stock;
    private int min;
    private int max;

    public Product(int id, String name, double price, int stock, int min, int max) {
        this.associatedParts = FXCollections.observableArrayList();
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.min = min;
        this.max = max;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return this.stock;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMin() {
        return this.min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMax() {
        return this.max;
    }

    public void addAssociatedPart(Part part) {

        this.associatedParts.add(part);

    }

    public boolean deleteAssociatedPart(Part selectedAssociatedPart) {

        this.associatedParts.remove(selectedAssociatedPart);

        return true;
    }

    public ObservableList<Part> getAllAssociatedParts() {
        return this.associatedParts;
    }
}


