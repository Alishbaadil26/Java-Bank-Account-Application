package coe528.project;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Customer {
    private String status;

    // Constructor
    public Customer(String status) {
        this.status = status;
    }


    private double calculateTotalCartAmount(boolean shoesSelected, boolean headphonesSelected, boolean laptopSelected,
                                             boolean iphoneSelected, boolean bagSelected) {
        double totalAmount = 0;

        if (shoesSelected) totalAmount += 1000;
        if (headphonesSelected) totalAmount += 50;
        if (laptopSelected) totalAmount += 2000;
        if (iphoneSelected) totalAmount += 1980;
        if (bagSelected) totalAmount += 30;

        return totalAmount;
    }

    private double getFinalAmount(double totalCartAmount) {
        switch (status) {
            case "Gold":
                return Gold.calculateFinalAmount(totalCartAmount);
            case "Silver":
                return Silver.calculateFinalAmount(totalCartAmount);
            default:
                return Platinum.calculateFinalAmount(totalCartAmount);
        }
    }

    private void displayErrorAlert(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void updateBalance(double amount) {
        // Update balance logic
    }

    private double getTotalBalance() {
        // Retrieve total balance logic
        return 0; // Placeholder
    }

    private void updateStatus(String username, double totalBalance) {
        // Update status logic
    }

    // Other methods and attributes of thTemplates.
    }
