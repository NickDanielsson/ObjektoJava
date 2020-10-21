package Bankomaten;

/**
 * Created by Nick Danielsson
 * Date 2020-09-30
 * Time 13:58
 * Project ObjektoJava
 */
public class Loan {

    private String loanName;
    private double interest;
    private double amount;
    Staff staff;

    public Loan (){}

    public Loan(double interest, double amount, Staff staff, String loanName) {
        this.interest = interest;
        this.amount = amount;
        this.staff = staff;
        this.loanName = loanName;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public void getLoanApprovedBy (){
        System.out.println("Lånet beviljades av: " + staff.getName());
    }
}
