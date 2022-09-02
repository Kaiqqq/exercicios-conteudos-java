package Entities;

public class Account {

    private int number;
    private String name;
    private double balance;

    public Account (int number, String name, double initialValue) {
        this.number = number;
        this.name =  name;
        deposit(initialValue);
    }

    public Account (int number, String name) {
        this.number = number;
        this.name =  name;
    }

    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }
    public int getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void withdrawValue(double amount) {
        balance -= amount + 5.0;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public String toString() {
        return "Account " + number + ", Holder: " + name + ", Balance: $ " + String.format("%.2f", balance);
    }
}
