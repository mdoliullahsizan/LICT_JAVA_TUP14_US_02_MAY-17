/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineproduct;

/**
 *
 * @author Md. Oliullah Sizan
 */
public class Product implements ProductInterface {
    private double regularPrice;
    
    //Create a new instance of Product
    public Product(double regularPrice) {
        this.regularPrice= regularPrice; 
    }
    
    //Implement the method of the ProductInterface
    public double computeSalePrice() {
        return regularPrice;
    }
    
    public void setRegularPrice(double regularPrice) {
        this.regularPrice= regularPrice;
    }
}
