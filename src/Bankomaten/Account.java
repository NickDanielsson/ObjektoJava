package Bankomaten;

/**
 * Created by Nick Danielsson
 * Date 2020-09-30
 * Time 13:54
 * Project ObjektoJava
 */
public class Account {

    private double interest;
    private double balance;

    public Account () {}

    public Account(double interest, double balance) {
        this.interest = interest;
        this.balance = balance;
    }
    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
