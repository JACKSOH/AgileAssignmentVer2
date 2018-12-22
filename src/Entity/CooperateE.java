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
    private static int nextNumber = 1000;
    private int num;
    private double custLimit;

    public CooperateE(){
        
    }
    public CooperateE(double custLimit) {
        this.custLimit = custLimit;
    }

    public CooperateE(double custLimit, String custID, String custName, String custPhone, String posCode, String custAddress) {
        super(custID, custName, custPhone, posCode, custAddress);
        this.custLimit = custLimit;
        this.num=nextNumber++;
    }

   
    public double getCustLimit() {
        return custLimit;
    }

    public void setCustLimit(double custLimit) {
        this.custLimit = custLimit;
    }
    public static int getNextNumber() {
        return nextNumber;
    }

    public static void setNextNumber(int nextNumber) {
       CooperateE.nextNumber = nextNumber;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return super.toString()+ "CooperateE{" + "custLimit=" + custLimit + '}';
    }
   
    
   
}
