package Bankomaten;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nick Danielsson
 * Date 2020-09-30
 * Time 13:13
 * Project ObjektoJava
 */
public class Customer extends Person{
   protected List<Loan> loan = new LinkedList<>();
   protected List<Account> account = new LinkedList<>();

   public Customer () {}

    public Customer(String name, String idNr) {
        super(name, idNr);
       // this.loan = loan;
       // this.account = account;
    }


    public List<Loan> getLoan() {
        return loan;
    }

    public void setLoan(List<Loan> loan) {
        this.loan = loan;
    }

    public List<Account> getAccount() {
        return account;
    }

    public void setAccount(List<Account> account) {
        this.account = account;
    }

    public void addAccountToList(Account x){
       account.add(x);
    }

    public void addLoanToList (Loan x){
       loan.add(x);
    }
}
