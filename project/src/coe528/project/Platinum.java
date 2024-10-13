package coe528.project;

public class Platinum extends Customer {
    public static double calculateFinalAmount(double totalCartAmount) {
        if (totalCartAmount < 50) {
            
            return -1; // Error flag
        } else {
            
            return totalCartAmount;
        }
    }

    public Platinum(String status) {
        super(status);
    }

   
}
