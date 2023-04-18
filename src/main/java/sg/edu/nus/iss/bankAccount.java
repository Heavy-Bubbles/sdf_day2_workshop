package sg.edu.nus.iss;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class bankAccount {
    private final String fullName;
    private String accountNumber;
    private float balance;
    private boolean isClosed;
    private Date accountStartDate;
    private Date accountEndDate;
    private List<String> transactions;
    
    public bankAccount(String fullName, String accountNumber, float balance) {
        this.fullName = fullName;
        this.accountNumber = accountNumber;
        this.balance = 0.0f;

        this.accountStartDate = new Date();
        transactions = new ArrayList<>();
    }

    public String getFullName() {
        return fullName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
 
    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean isClosed) {
        this.isClosed = isClosed;
        
        this.accountEndDate = new Date();
    }

    public Date getAccountStartDate() {
        return accountStartDate;
    }

    public void setAccountStartDate(Date accountStartDate) {
        this.accountStartDate = accountStartDate;
    }

    public Date getAccountEndDate() {
        return accountEndDate;
    }

    public void setAccountEndDate(Date accountEndDate) {
        this.accountEndDate = accountEndDate;
    }

    public List<String> getTransactions(){
        return transactions;
    }
    
    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }
    
    @Override
    public String toString() {
        /*return "bankAccount [fullName=" + fullName + ", accountNumber=" + accountNumber + ", balance=" + balance
                + ", isClosed=" + isClosed + ", accountStartDate=" + accountStartDate + ", accountEndDate="
                + accountEndDate + ", transactions=" + transactions + "]";
    } */

        return "bankAccount [fullName=" + fullName + ", accountNumber=" + accountNumber + ", balance=" + balance
        + ", isClosed=" + isClosed + ", accountStartDate=" + accountStartDate + ", accountEndDate="
        + accountEndDate + "]" ;
}

    public void showAccount() {
        System.out.println("Account fullname : " + fullName);
        System.out.println("Account No. " + accountNumber);
        System.out.println("Balance" + balance);
    }

    public void deposit (float amount) {
        if (isClosed) {
            throw new IllegalArgumentException("Account is closed. You cannot make a deposit to a closed account!");
        }

        if (amount < 0) {
            throw new IllegalArgumentException("You cannot make a negative deposit amount!");
        } else {
            balance = balance + amount;
    
            Date dt = new Date();
            transactions.add("Deposit" + amount + "to account " + accountNumber + " on " + dt.toString());
        }
    }

        public void withdraw (float amount) {
            if (isClosed) {
                throw new IllegalArgumentException("Account is closed. You cannot make a withdrawal from a closed account!");
            }
    
            if (amount < 0) {
                throw new IllegalArgumentException("You cannot make a negative withdrawal amount!");
            } 
            
            if (amount > balance) {
                throw new IllegalArgumentException("You cannot withdraw more than your balance!");
       
            } else {
                balance = balance - amount;
                Date dt = new Date();
                transactions.remove("Withdraw" + amount + "from account " + accountNumber + " on " + dt.toString());

            }


    }

}
    

