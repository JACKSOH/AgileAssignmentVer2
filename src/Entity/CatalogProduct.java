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
public class CatalogProduct extends Product{
    
   
    
    private String prodName;
    private String prodType;
    private String prodStatus;
    private String prodDescription;
    
    private int prodQuantity;

    public CatalogProduct(){
        super();
    }

    public CatalogProduct(String prodName, String prodType, String prodStatus, String prodDescription, int prodQuantity) {
        this.prodName = prodName;
        this.prodType = prodType;
        this.prodStatus = prodStatus;
        this.prodDescription = prodDescription;
        this.prodQuantity = prodQuantity;
    }

    public CatalogProduct(String prodName, String prodType, String prodStatus, String prodDescription, int prodQuantity, String prodID, double prodPrice) {
        super(prodID, prodPrice);
        this.prodName = prodName;
        this.prodType = prodType;
        this.prodStatus = prodStatus;
        this.prodDescription = prodDescription;
        this.prodQuantity = prodQuantity;
    }
    
    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdType() {
        return prodType;
    }

    public void setProdType(String prodType) {
        this.prodType = prodType;
    }

    public String getProdStatus() {
        return prodStatus;
    }

    public void setProdStatus(String prodStatus) {
        this.prodStatus = prodStatus;
    }

    public String getProdDescription() {
        return prodDescription;
    }

    public void setProdDescription(String prodDescription) {
        this.prodDescription = prodDescription;
    }


    public int getProdQuantity() {
        return prodQuantity;
    }

    public void setProdQuantity(int prodQuantity) {
        this.prodQuantity = prodQuantity;
    }

    @Override
    public String toString() {
        return "CatalogProduct{" + "prodName=" + prodName + ", prodType=" + prodType + ", prodStatus=" + prodStatus + ", prodDescription=" + prodDescription + ", prodQuantity=" + prodQuantity + '}';
    }

    

    
    
    
   

    
}
