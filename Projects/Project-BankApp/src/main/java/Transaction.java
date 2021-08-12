package main.java;

public class Transaction {
    private int id;
    private double balance;
    private String firstName, lastName;

    public Transaction(){
    }

    public Transaction(int id, String firstName, String lastName, double balance) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() { return firstName; }

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public String getLastName() { return lastName; }

    public void setLastName(String lastName) {this.lastName = lastName;}

    public double getBalance() {
        return balance;
    }

    public void setBalance(int name) {
        this.balance = balance;
    }


}
