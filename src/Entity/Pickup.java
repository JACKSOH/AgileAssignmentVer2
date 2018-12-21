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
public class Pickup {
    
    private Order order;
    
    private String pickupID;
    private String pickupDate;
    private String pickupTime;
    private String pickupPriority;
    private String pickupStatus;

    public Pickup(Order order, String pickupID, String pickupDate, String pickupTime, String pickupPriority, String pickupStatus) {
        this.order = order;
        this.pickupID = pickupID;
        this.pickupDate = pickupDate;
        this.pickupTime = pickupTime;
        this.pickupPriority = pickupPriority;
        this.pickupStatus = pickupStatus;
    }

    public String getPickupStatus() {
        return pickupStatus;
    }

    public void setPickupStatus(String pickupStatus) {
        this.pickupStatus = pickupStatus;
    }
    public Pickup() {
    }
  

    

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

   

    public String getPickupID() {
        return pickupID;
    }

    public void setPickupID(String pickupID) {
        this.pickupID = pickupID;
    }

    public String getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(String pickupDate) {
        this.pickupDate = pickupDate;
    }

    public String getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(String pickupTime) {
        this.pickupTime = pickupTime;
    }

    public String getPickupPriority() {
        return pickupPriority;
    }

    public void setPickupPriority(String pickupPriority) {
        this.pickupPriority = pickupPriority;
    }
   
}
