/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ifundip.appdemo.persistence;

/**
 *
 * @author maspa
 */
public class Product {
    String productName;
    int price;

    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

}
