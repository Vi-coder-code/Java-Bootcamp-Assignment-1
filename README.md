# ATM System Simulation
This project is a simple ATM System Simulation written in Java. It mimics basic ATM functionalities such as withdrawing cash, depositing money, checking balances, and ensuring secure user authentication using a PIN.
## Features:
## 1. User Authentication: 
The system prompts the user to enter a PIN before proceeding with any transaction. Only valid users can perform operations.
## Withdrawals:
Users can withdraw an amount, provided they have sufficient balance.
The system ensures the ATM has enough cash for the requested withdrawal.
If both conditions are satisfied, the requested amount is deducted from the user's balance and the ATM's balance.
## Deposits:
Users can deposit money into their account, with a maximum deposit limit of ₹50,000.
The deposited amount is added to both the user's account and the ATM balance.
## Balance Inquiry:
Users can check both their account balance and the remaining cash in the ATM.
## Input Validations: 
The system ensures that all entered amounts are positive and that no invalid operations occur.
User-Friendly Menu: A simple menu-driven interface allows users to easily choose between options such as withdrawal, deposit, balance check, or exit.
## Usage Instructions:
### 1.Compile and run the code.
### 2.Enter your 4-digit PIN (default: 1234).
### 3.Choose from the following options:
Withdraw money (Ensure that both your account and the ATM have sufficient funds).
Deposit money (The system limits deposits to ₹50,000).
Check your account balance and the ATM balance.
Exit the application.
# Code Snippet:
System.out.print("Enter your PIN: ");
if (sc.hasNextInt() && sc.nextInt() == pin) {
    // Proceed with the ATM operations
} else {
    System.out.println("Incorrect PIN. Please try again.");
}

## Prerequisites:
Basic understanding of Java and OOP concepts.
Java Development Kit (JDK) installed to compile and run the project.
