/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author zxchia
 */
public class CooperateE extends Customer{
   
    private double custLimit;

    public CooperateE(){
        
    }
    public CooperateE(double custLimit) {
        this.custLimit = custLimit;
    }

    public CooperateE(double custLimit, int num, String custID, String custName, String custPhone, String posCode, String custAddress) {
        super(num, custID, custName, custPhone, posCode, custAddress);
        this.custLimit = custLimit;
    }

    public CooperateE(double custLimit, String custID, String custName, String custPhone, String posCode, String custAddress) {
        super(custID, custName, custPhone, posCode, custAddress);
        this.custLimit = custLimit;
    }

   
    public double getCustLimit() {
        return custLimit;
    }

    public void setCustLimit(double custLimit) {
        this.custLimit = custLimit;
    }

    @Override
    public String toString() {
        return "CooperateE{" + "custLimit=" + custLimit + '}';
    }
   
    
   
}
