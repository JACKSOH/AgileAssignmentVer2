/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author boonk
 */
public class Product {
    private String prodID;
    private double prodPrice;

    public Product() {
    }

    
    public String getProdID() {
        return prodID;
    }

    public void setProdID(String prodID) {
        this.prodID = prodID;
    }

    public double getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(double prodPrice) {
        this.prodPrice = prodPrice;
    }

    public Product(String prodID, double prodPrice) {
        this.prodID = prodID;
        this.prodPrice = prodPrice;
    }

    @Override
    public String toString() {
        return "Product{" + "prodID=" + prodID + ", prodPrice=" + prodPrice + '}';
    }
    
    
    
}
