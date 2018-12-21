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
public class CooperateOrder extends Order{
    private CooperateE cooperate;

    
    public CooperateOrder() {
    }
    
    
    public CooperateE getCooperate() {
        return cooperate;
    }

    public void setCooperate(CooperateE cooperate) {
        this.cooperate = cooperate;
    }

    public CooperateOrder(CooperateE cooperate) {
        this.cooperate = cooperate;
    }

    public CooperateOrder(CooperateE cooperate, String orderID, String orderStatus, String orderType, double totalAmount) {
        super(orderID, orderStatus, orderType, totalAmount);
        this.cooperate = cooperate;
    }

    @Override
    public String toString() {
        return "CooperateOrder{" + "cooperate=" + cooperate + '}';
    }
    
    
    
}
