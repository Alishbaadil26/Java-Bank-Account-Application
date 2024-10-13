package coe528.project;
import javafx.scene.control.Alert;

public class Silver extends Customer {
    public static double calculateFinalAmount(double totalCartAmount) {
        double fee = 20;
        if (totalCartAmount < 50) {
            
            return -1; // Error flag
        } else {
            double finalAmount = totalCartAmount + fee;
          
            return finalAmount;
        }
    }

    public Silver(String status) {
        super(status);
    }

  
}
