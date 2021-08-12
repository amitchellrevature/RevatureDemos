package main.java;

import java.sql.*;
import java.util.*;
import java.lang.*;

public class Main {

    public static void main(String[] args) throws SQLException {
        TransactionDAO dao = new TransactionDAO();
        Scanner scanner = new Scanner(System.in);
        home(scanner, dao);
    }

    public static void home(Scanner scanner, TransactionDAO dao) throws SQLException {
        boolean flag = true;
        while (flag){
            System.out.println("Select from the options below:\n" +
                    "1 - Log into a customer account\n" +
                    "2 - Log into an employee account\n" +
                    "3 - Apply for a new account\n" +
                    "4 - Exit");

            int input = scanner.nextInt();

            switch (input) {
                case 1: {
                    System.out.print("Enter First Name: ");
                    String firstName = scanner.next();
                    System.out.print("Enter Last Name: ");
                    String lastName = scanner.next();
                    Transaction transaction = dao.login(firstName, lastName);
                    customer(scanner, transaction, dao);
                    break;
                }
                case 2: {
                    System.out.print("Enter First Name: ");
                    String firstName = scanner.next();
                    System.out.print("Enter Last Name: ");
                    String lastName = scanner.next();
                    if(dao.verify(firstName, lastName))
                        employee(scanner, dao);
                    break;
                }
                case 3: {
                    System.out.print("Enter First Name: ");
                    String firstName = scanner.next();
                    System.out.print("Enter Last Name: ");
                    String lastName = scanner.next();
                    System.out.println("Give an initial deposit");
                    double deposit = scanner.nextDouble();
                    dao.createAccount(firstName, lastName, deposit);
                    break;
                }
                default:
                    System.out.println("Exiting...");
                    flag = false;
            }
        }
    }

    public static void customer (Scanner scanner, Transaction transaction, TransactionDAO dao) throws SQLException {
        boolean flag = true;
        while(flag) {
            System.out.println("Welcome\n" +
                    "Select from the options below:\n" +
                    "1 - View Balance\n" +
                    "2 - Make a deposit\n" +
                    "3 - Make a withdrawal\n" +
                    "4 - Post a transfer to another account\n" +
                    "5 - Accept a transfer\n" +
                    "6 - Exit");

            int input = scanner.nextInt();

            switch (input) {
                case 1: {
                    dao.viewBalance(transaction);
                    break;
                }
                case 2: {
                    System.out.println("Give an amount to deposit: ");
                    double amount = scanner.nextDouble();
                    if (amount > 0)
                        dao.deposit(transaction, amount);
                    else
                        System.out.println("Error, invalid deposit amount");
                    break;
                }
                case 3: {
                    System.out.println("Give an amount to withdraw: ");
                    double amount = scanner.nextDouble();
                    if ((amount > 0) && (amount <= transaction.getBalance()))
                        dao.withdraw(transaction, amount);
                    else
                        System.out.println("Error, invalid withdrawal amount");
                    break;
                }
                case 4: {
                    System.out.println("Give the id of the account you wish to transfer to: ");
                    int id = scanner.nextInt();
                    System.out.println("Give the amount of money you wish to transfer: ");
                    double amount = scanner.nextDouble();
                    dao.postTransfer(transaction, id, amount);
                    break;
                }
                case 5: {
                    int option;
                    double amount = dao.transfer(transaction);
                    while(amount > -1) {
                        System.out.println("Accept this transfer?" +
                                "1 - Yes" +
                                "2 - No" +
                                "3 - Exit");
                        option = scanner.nextInt();
                        if (option == 1){
                            dao.acceptTransfer(transaction, true, amount);
                        } else if (option == 2){
                            dao.acceptTransfer(transaction, false, amount);
                        } else {
                            break;
                        }
                        amount = dao.transfer(transaction);
                    }
                    break;
                }
                default:
                    flag = false;

            }
        }
    }

    public static void employee (Scanner scanner, TransactionDAO dao) throws SQLException {
        boolean flag = true;
        while(flag) {
            System.out.println("Welcome\n" +
                    "Select from the options below:\n" +
                    "1 - Approve or reject an account\n" +
                    "2 - View an account's details\n" +
                    "3 - View transaction logs\n" +
                    "4 - Exit");
            int input = scanner.nextInt();

            switch (input) {
                case 1: {
                    System.out.println("List of unapproved accounts: ");
                    dao.view(false);
                    System.out.println("Select an account ID to approve: ");
                    int id = scanner.nextInt();
                    dao.approve(id);
                    break;
                }
                case 2: {
                    dao.view(true);
                    break;
                }
                default: {
                    flag = false;
                }
            }
        }
    }
}
