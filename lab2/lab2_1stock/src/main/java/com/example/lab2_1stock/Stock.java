package com.example.lab2_1stock;

public class Stock {
    private String label;
    private Integer quantity;
    Stock(String label,Integer quantity){
        this.label=label;
        this.quantity=quantity;
    }
    String getLabel(){
        return label;
    }
    Integer getQuantity(){
        return quantity;
    }
    void setLabel(String s){
        this.label=s;
    }
    void setQuantity(Integer i){
        this.quantity=i;
    }
}

