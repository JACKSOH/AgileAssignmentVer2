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
public class Delivery {
    private Order order;
    private String deliveryID;
    private String deliveryManName;
    private String deliveryDate;
    private String deliveredTime;
    private String posCode;
    private String address;

    public Delivery(String deliveryID) {
        this.deliveryID = deliveryID;
    }

    public Delivery(String deliveryID, String deliveryManName, String deliveredTime, String posCode) {
        this.deliveryID = deliveryID;
        this.deliveryManName = deliveryManName;
        this.deliveredTime = deliveredTime;
        this.posCode = posCode;
    }


    


    public String getDeliveredTime() {
        return deliveredTime;
    }

    public void setDeliveredTime(String deliveredTime) {
        this.deliveredTime = deliveredTime;
    }

    
    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }


    public Delivery() {
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getDeliveryID() {
        return deliveryID;
    }

    public void setDeliveryID(String deliveryID) {
        this.deliveryID = deliveryID;
    }

    public String getDeliveryManName() {
        return deliveryManName;
    }

    public void setDeliveryManName(String deliveryManName) {
        this.deliveryManName = deliveryManName;
    }

    public String getPosCode() {
        return posCode;
    }

    public void setPosCode(String posCode) {
        this.posCode = posCode;
    }

   

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Delivery{" + "order=" + order + ", deliveryID=" + deliveryID + ", deliveryManName=" + deliveryManName + ", deliveryDate=" + deliveryDate + ", deliveredTime=" + deliveredTime + ", posCode=" + posCode + ", address=" + address + '}';
    }

    
    
}
