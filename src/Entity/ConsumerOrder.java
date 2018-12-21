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
public class ConsumerOrder extends Order{
    private ConsumerE cosnumer;

    public ConsumerE getCosnumer() {
        return cosnumer;
    }

    public void setCosnumer(ConsumerE cosnumer) {
        this.cosnumer = cosnumer;
    }

    public ConsumerOrder() {
    }

    public ConsumerOrder(ConsumerE cosnumer) {
        this.cosnumer = cosnumer;
    }

    public ConsumerOrder(ConsumerE cosnumer, String orderID, String orderStatus, String orderType, double totalAmount) {
        super(orderID, orderStatus, orderType, totalAmount);
        this.cosnumer = cosnumer;
    }

    @Override
    public String toString() {
        return "ConsumerOrder{" + "cosnumer=" + cosnumer + '}';
    }

    
    
    
}
