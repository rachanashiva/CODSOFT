package atm;

import java.util.Scanner;

public class Main { // Ensure the class name matches the file name

    static double balance = 1000.00; // initial balance
    
    public static void main(String[] args) { // Ensure this is the entry point
        Scanner scanner = new Scanner(System.in);
        int userChoice;
        
        System.out.println("Welcome to the ATM Interface!");
        
        do {
            // Displaying menu
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Please select an option : ");
            
            userChoice = scanner.nextInt();
         // Check if the input is within the valid range
            if (userChoice < 1 || userChoice > 4) {
                System.out.println("Invalid option. Please try again.");
            } else {
            switch (userChoice) {
                case 1:
                    // Display current balance
                    System.out.println("Your current balance is: $" + balance);
                    break;
                    
                case 2:
                    // Deposit money
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("You have successfully deposited: $" + depositAmount);
                    } else {
                        System.out.println("Deposit amount must be greater than 0.");
                    }
                    break;
                    
                case 3:
                    // Withdraw money
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.println("You have successfully withdrawn: $" + withdrawAmount);
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient balance for this withdrawal.");
                    } else {
                        System.out.println("Withdrawal amount must be greater than 0.");
                    }
                    break;
                    
                case 4:
                    // Exit the ATM
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                    
                default:
                    System.out.println("Invalid option. Please try again.");
           
            }
            }
        } while (userChoice != 4);
        
        scanner.close();
    }
}
