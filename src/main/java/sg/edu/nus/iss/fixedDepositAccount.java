package sg.edu.nus.iss;



public class fixedDepositAccount extends bankAccount{


    private float interest;
    private Integer duration;



    public fixedDepositAccount(String fullName, String accountNumber, float balance) {
        super(fullName, accountNumber, balance);
    }

    public fixedDepositAccount(String fullName, String accountNumber, float balance, float interest) {
        super(fullName, accountNumber, balance);
        this.interest = interest;
    }

    public fixedDepositAccount(String fullName, String string, float balance, float interest, Integer duration) {
        super(fullName, string, balance);
        this.interest = interest;
        this.duration = duration;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Override
    public void withdraw(float amount){
        System.out.println("No deposit operation allowed!");
    }

    @Override
    public void deposit(float amount) {
        System.out.println("No deposit operation allowed!");
    }
    
    public float getBalance () {
        return super.getBalance() * (100 + interest)/ 100;
    }

}
    

