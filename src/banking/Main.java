package banking;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dylan's Banking Starting...");
        createAccount();
    }

    public static void createAccount() {
        int option = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Account Number: ");
        int accountNumber = input.nextInt();
        System.out.println("Enter Account Name: ");
        String accountName = input.next();
        System.out.println("Enter Account Balance: ");
        double accountBalance = input.nextDouble();

        Account account = new Account(accountNumber, accountName, accountBalance);
        System.out.println("Account Created!");
        System.out.println("Account Number: " + account.accountNumber);
        System.out.println("Account Name: " + account.accountName);
        System.out.println("Account Balance: " + account.accountBalance);
        do {
            System.out.println(account.accountName + ", would you like to:");
            System.out.println("1. Deposit (1)");
            System.out.println("2. Withdraw (2)");
            System.out.println("3. Exit (3)");
            option = input.nextInt();
            System.out.println("\n");

            switch (option) {
                case 1:
                    System.out.println("Enter amount to deposit: ");
                    double depositAmount = input.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Account Balance: " + account.accountBalance);
                    break;

                case 2:
                    System.out.println("Enter amount to withdraw: ");
                    double withdrawAmount = input.nextDouble();
                    account.withdraw(withdrawAmount);
                    System.out.println("Account Balance: " + account.accountBalance);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option");
                    break;
            }
        } while (option != 3);
        System.out.println("Thank you for banking with us!");

    }

}
