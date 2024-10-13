package coe528.project;

/**
 * The Manager class represents a manager within the banking system. 
 * Managers are responsible for adding and deleting customers from the system. 
 * This class is immutable as its state (username and password) cannot be changed after instantiation.
 * 
 * Abstraction Function:
 * - Represents a manager with a unique username and password.
 * 
 * Rep Invariant:
 * - Username and password must not be null.
 * 
 * Effects: 
 * - Initializes a Manager object with the specified username and password.
 * 
 * Modifies:
 * - None.
 * 
 * Requires:
 * - The entered username and password must not be null.
 */
public class Manager extends Person {
    
    /**
     * Constructs a Manager object with the specified username and password.
     * 
     * @param username The username of the manager.
     * @param password The password of the manager.
     */
    public Manager(String username, String password) {
        super(username, password, "manager");
    }
    
    /**
     * Adds a customer to the system.
     * 
     * @param customer The customer to be added.
     * 
     * Effects:
     * - Adds the specified customer to the system.
     * 
     * Modifies:
     * - The customer database.
     * 
     * Requires:
     * - The customer must not be null.
     */
    public void addCustomer(Customer customer) {
        // Add customer logic
    }
    
    /**
     * Deletes a customer from the system.
     * 
     * @param customer The customer to be deleted.
     * 
     * Effects:
     * - Deletes the specified customer from the system.
     * 
     * Modifies:
     * - The customer database.
     * 
     * Requires:
     * - The customer must not be null.
     */
    public void deleteCustomer(Customer customer) {
        // Delete customer logic
    }

    /**
     * Authenticates manager login credentials.
     * 
     * @param enteredUsername The username entered by the manager.
     * @param enteredPassword The password entered by the manager.
     * @return True if the entered credentials match, false otherwise.
     * 
     * Effects:
     * - Authenticates manager login credentials.
     * 
     * Modifies:
     * - None.
     * 
     * Requires:
     * - The entered username and password must not be null.
     */
    public static boolean authenticateManager(String enteredUsername, String enteredPassword) {
        // Simple authentication logic for manager
        return enteredUsername.equals("admin") && enteredPassword.equals("admin");
    }

    /**
     * Returns a string representation of the Manager object.
     * 
     * @return A string containing the username and role of the manager.
     * 
     * Effects:
     * - Returns a string representation of the Manager object.
     * 
     * Modifies:
     * - None.
     * 
     * Requires:
     * - None.
     */
    @Override
    public String toString() {
        return "Manager: Username - " + getUsername() + ", Role - " + getRole();
    }

    /**
     * Checks if the representation invariant holds for the Manager object.
     * 
     * @return True if the representation invariant holds, false otherwise.
     * 
     * Effects:
     * - Checks if the representation invariant holds for the Manager object.
     * 
     * Modifies:
     * - None.
     * 
     * Requires:
     * - None.
     */
    public boolean repOk() {
        return getUsername() != null && getPassword() != null;
    }
}
