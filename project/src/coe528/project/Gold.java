package coe528.project;
import javafx.scene.control.Alert;

public class Gold extends Customer{
    
    
    public static double calculateFinalAmount(double totalCartAmount) {
        double fee = 10;
        if (totalCartAmount < 50) {
           
            return -1; // Error flag
        } else {
            double finalAmount = totalCartAmount + fee;
          
            return finalAmount;
        }
    }

    public Gold(String status) {
        super(status);
    }

}
