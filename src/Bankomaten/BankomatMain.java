package Bankomaten;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nick Danielsson
 * Date 2020-09-30
 * Time 14:07
 * Project ObjektoJava
 */
public class BankomatMain {
    public static void main(String[] args) {
        Staff staff1 = new Staff("Erik","750323",39000);
        Customer c1 = new Customer("Nick","871018");

        Account acc1 = new Account(1.0,10000);
        c1.addAccountToList(acc1);

        Loan loan1 = new Loan(1.5,100_000,staff1,"Privatlån");
        Loan loan2 = new Loan(2.1,500_000,staff1,"Billån");
        c1.addLoanToList(loan1);
        c1.addLoanToList(loan2);

        loan1.getLoanApprovedBy();
        c1.getLoan();
        staff1.getSalary();

    }
}
