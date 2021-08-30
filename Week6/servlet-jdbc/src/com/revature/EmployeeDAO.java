package com.revature;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDAO {
    Connection connection = null;

    public EmployeeDAO() {
        try {
            this.connection = ConnectionFactory.getConnection();
        } catch (SQLException var2) {
            var2.printStackTrace();
        }

    }

    public void createAccount(String firstName, String lastName, double balance) throws SQLException {
        String sql = "select count(*) from account";
        Statement statement = this.connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        resultSet.next();
        int id = 1 + resultSet.getInt(1);
        sql = "insert into account (id, firstName, lastName, balance, approved) values (?, ?, ?, ?, 0)";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        preparedStatement.setString(2, firstName);
        preparedStatement.setString(3, lastName);
        preparedStatement.setDouble(4, balance);
        int count = preparedStatement.executeUpdate();
        if (count > 0) {
            System.out.println("Account created");
        } else {
            System.out.println("Error, account not created");
        }

    }

    public Employee login(String firstName, String lastName) throws SQLException {
        String sql = "select * from account where firstName = '" + firstName + "' and lastName = '" + lastName + "' and approved = 1";
        Statement statement = this.connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        Employee transaction = new Employee();
        if (resultSet.next()) {
            transaction = new Employee(resultSet.getInt(1), resultSet.getString(1), resultSet.getString(3), resultSet.getDouble(4));
        } else {
            System.out.println("No such account was found");
        }

        return transaction;
    }

    public void deposit(Employee transaction, double amount) throws SQLException {
        if (amount < 0.0D) {
            System.out.println("Error, invalid amount for deposit");
        } else {
            String sql = "update account set balance = ? where id = ?";
            PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
            preparedStatement.setDouble(1, transaction.getBalance() + amount);
            preparedStatement.setInt(2, transaction.getId());
            int count = preparedStatement.executeUpdate();
            if (count > 0) {
                System.out.println("Deposit successful");
                transaction.setBalance(transaction.getBalance() + amount);
            } else {
                System.out.println("Error, deposit not executed");
            }

        }
    }

    public void viewBalance(Employee transaction) {
        System.out.println("Current Balance: " + transaction.getBalance());
    }

    public double transfer(Employee transaction) throws SQLException {
        String sql = "select * from transfers where recipient = " + transaction.getId();
        Statement statement = this.connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        if (resultSet.next()) {
            System.out.println("---------------------------------\nFrom Account ID: " + resultSet.getInt(2) + "\nAmount: " + resultSet.getDouble(3) + "\n---------------------------------\n");
            return resultSet.getDouble(3);
        } else {
            return -1.0D;
        }
    }

    public void acceptTransfer(Employee transaction, boolean accept, double amount) throws SQLException {
        if (accept) {
            String sql = "update account set approved = 1 where id = ?";
            Statement statement = this.connection.createStatement();
            statement.executeQuery(sql);
        }

    }

    public void postTransfer(Employee transaction, int recipient, double amount) throws SQLException {
        String sql = "insert into transfers (recipient, sender, amount) values (?, ?, ?)";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setInt(1, recipient);
        preparedStatement.setInt(2, transaction.getId());
        preparedStatement.setDouble(3, amount);
        int count = preparedStatement.executeUpdate();
        if (count > 0) {
            System.out.println("Transfer posted");
        } else {
            System.out.println("Error, transfer not posted");
        }

    }

    public boolean verify(String firstName, String lastName) throws SQLException {
        String sql = "select * from account where firstName = '" + firstName + "' and lastName = '" + lastName + "'";
        Statement statement = this.connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        if (resultSet.next()) {
            System.out.println("Login successful");
            return true;
        } else {
            System.out.println("No such account was found");
            return false;
        }
    }

    public void approve(int id) throws SQLException {
        String sql = "update account set approved = 1 where id = ?";
        PreparedStatement preparedStatement = this.connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        int count = preparedStatement.executeUpdate();
        if (count > 0) {
            System.out.println("Account approved");
        } else {
            System.out.println("Error, account not approved");
        }

    }

    public void view(boolean flag) throws SQLException {
        String sql = "select * from account where approved = " + flag;
        Statement statement = this.connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while(resultSet.next()) {
            System.out.println("---------------------------------\nAccount ID: " + resultSet.getInt(1) + "\nName: " + resultSet.getString(2) + " " + resultSet.getString(3) + "\nBalance: " + resultSet.getDouble(4) + "\n---------------------------------\n");
        }

    }
}
