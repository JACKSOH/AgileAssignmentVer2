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
        
    }
    public ConsumerE(String gender) {
        this.gender = gender;
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
    public static int getNextNumber() {
        return nextNumber;
    }

    public static void setNextNumber(int nextNumber) {
        ConsumerE.nextNumber = nextNumber;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return super.toString()+ "ConsumerE{" + "gender=" + gender + '}';
    }
    
   
    
}
