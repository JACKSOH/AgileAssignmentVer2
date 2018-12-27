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
public class ConsumerE extends Customer{
private static int nextNumber = 1000;
    private int num;
    private String gender;

    public ConsumerE(){
        this.num=nextNumber++;
    }
    public ConsumerE(String gender) {
        this.gender = gender;
        this.num=nextNumber++;
    }

    public ConsumerE(String gender, int num, String custID, String custName, String custPhone, String posCode, String custAddress) {
        super(num, custID, custName, custPhone, posCode, custAddress);
        this.gender = gender;
        this.num=nextNumber++;
    }

    public ConsumerE(String gender, String custID, String custName, String custPhone, String posCode, String custAddress) {
        super(custID, custName, custPhone, posCode, custAddress);
        this.gender = gender;
        this.num=nextNumber++;
    }
    
   
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "ConsumerE{" + "gender=" + gender + '}';
    }
    
   
    
}
