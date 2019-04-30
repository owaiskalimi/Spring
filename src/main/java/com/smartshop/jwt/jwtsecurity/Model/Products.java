package com.smartshop.jwt.jwtsecurity.Model;

import javax.persistence.*;

@Entity
@Table(name = "Products")
public class Products
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Barcode")
    private Integer Barcode;
    @Column(name="Name")
    private String Name;
    @Column(name="Quantity")
    private Integer Quantity;
    @Column(name="Directions")
    private String Directions;
    @Column(name="Price")
    private Integer Price;

    public Integer getBarcode() {
        return Barcode;
    }

    public void setBarcode(Integer barcode) {
        Barcode = barcode;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }

    public String getDirections() {
        return Directions;
    }

    public void setDirections(String directions) {
        Directions = directions;
    }

    public Integer getPrice() {
        return Price;
    }

    public void setPrice(Integer price) {
        Price = price;
    }
}
