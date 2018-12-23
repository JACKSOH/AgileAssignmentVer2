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
public class Customer {
    
    
    private static int nextNumber = 1000;
    private int num;
    private String custID;
    private String custName;
    private String custPhone;
    private String posCode;
     private String custAddress;

    public Customer() {
    }

    public Customer(int num, String custID, String custName, String custPhone, String posCode, String custAddress) {
        this.num = num;
        this.custID = custID;
        this.custName = custName;
        this.custPhone = custPhone;
        this.posCode = posCode;
        this.custAddress = custAddress;
    }

    public Customer(String custID, String custName, String custPhone, String posCode, String custAddress) {
        this.custID = custID;
        this.custName = custName;
        this.custPhone = custPhone;
        this.posCode = posCode;
        this.custAddress = custAddress;
    }

    
    public String getPosCode() {
        return posCode;
    }

    public void setPosCode(String posCode) {
        this.posCode = posCode;
    }

     
    

     
    public static int getNextNumber() {
        return nextNumber;
    }

    public static void setNextNumber(int nextNumber) {
        Customer.nextNumber = nextNumber;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    @Override
    public String toString() {
        return "Customer{" + "num=" + num + ", custID=" + custID + ", custName=" + custName + ", custPhone=" + custPhone + ", custAddress=" + custAddress + '}';
    }
     
     
     
     
     
}
