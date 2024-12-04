package view;

import controller.CustomerController;
import model.Customer;

import java.util.List;
import java.util.Scanner;

public class CustomerView {
    private final CustomerController controller;
    private final Scanner scanner;

    public CustomerView() {
        controller = new CustomerController();
        scanner = new Scanner(System.in);
    }

    private void displayMenu() {
        System.out.println("\n=== Customer Management ===");
        System.out.println("1. View All Customers");
        System.out.println("2. Add Customer");
        System.out.println("3. Update Customer");
        System.out.println("4. Delete Customer");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
    }

    private void displayAllCustomers() {
        List<Customer> customers = controller.getAllCustomers();
        System.out.printf("%-5s %-20s %-30s %-15s %-25s %-20s%n", "ID", "Name", "Address", "Phone", "Email", "Purchase History");
        System.out.println("---------------------------------------------------------------------------------------------------------");
        for (Customer customer : customers) {
            System.out.printf("%-5d %-20s %-30s %-15s %-25s %-20s%n",
                    customer.getId(),
                    customer.getName(),
                    customer.getAddress(),
                    customer.getPhone(),
                    customer.getEmail(),
                    customer.getPurchaseHistory());
        }
    }

    private void addCustomer() {
        System.out.println("\n=== Add Customer ===");
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Address: ");
        String address = scanner.nextLine();
        System.out.print("Enter Phone: ");
        String phone = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Purchase History: ");
        String purchaseHistory = scanner.nextLine();

        Customer customer = new Customer(0, name, address, phone, email, purchaseHistory); // ID sẽ được tạo tự động
        controller.addCustomer(customer);
        System.out.println("Customer added successfully!");
    }

    private void updateCustomer() {
        System.out.println("\n=== Update Customer ===");
        System.out.print("Enter Customer ID to Update: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Customer existingCustomer = controller.getCustomerById(id);
        if (existingCustomer == null) {
            System.out.println("Customer not found!");
            return;
        }

        System.out.print("Enter New Name (Leave blank to keep current: " + existingCustomer.getName() + "): ");
        String name = scanner.nextLine();
        System.out.print("Enter New Address (Leave blank to keep current: " + existingCustomer.getAddress() + "): ");
        String address = scanner.nextLine();
        System.out.print("Enter New Phone (Leave blank to keep current: " + existingCustomer.getPhone() + "): ");
        String phone = scanner.nextLine();
        System.out.print("Enter New Email (Leave blank to keep current: " + existingCustomer.getEmail() + "): ");
        String email = scanner.nextLine();
        System.out.print("Enter New Purchase History (Leave blank to keep current: " + existingCustomer.getPurchaseHistory() + "): ");
        String purchaseHistory = scanner.nextLine();

        // Update fields only if input is provided
        if (!name.isEmpty()) existingCustomer.setName(name);
        if (!address.isEmpty()) existingCustomer.setAddress(address);
        if (!phone.isEmpty()) existingCustomer.setPhone(phone);
        if (!email.isEmpty()) existingCustomer.setEmail(email);
        if (!purchaseHistory.isEmpty()) existingCustomer.setPurchaseHistory(purchaseHistory);

        controller.updateCustomer(existingCustomer);
        System.out.println("Customer updated successfully!");
    }

    private void deleteCustomer() {
        System.out.println("\n=== Delete Customer ===");
        System.out.print("Enter Customer ID to Delete: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        boolean success = controller.deleteCustomer(id);
        if (success) {
            System.out.println("Customer deleted successfully!");
        } else {
            System.out.println("Customer not found!");
        }
    }

    public void run() {
        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    displayAllCustomers();
                    break;
                case 2:
                    addCustomer();
                    break;
                case 3:
                    updateCustomer();
                    break;
                case 4:
                    deleteCustomer();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.run();
    }
}
