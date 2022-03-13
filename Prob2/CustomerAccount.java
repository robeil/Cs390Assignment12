package Cs390Assignment12.Prob2;

public class CustomerAccount {

    private String cus_name;
    private String acc_No;
    private double balance;

    public CustomerAccount(){
    }

    public CustomerAccount(String cus_name,String acc_No,double balance){
        this.cus_name = cus_name;
        this.acc_No = acc_No;
        this.balance = balance;
    }

    public String getCus_name() {
        return cus_name;
    }

    public String getAcc_No() {
        return acc_No;
    }

    //deposit method
    public boolean deposit(double amount) {
        boolean does_Deposite = false;

            if (amount < 0) {
                return false;
            }
            balance += amount;
            does_Deposite = true;

        return does_Deposite;
    }
        //withdraw method
    public boolean withDraw(double amount) {
        boolean hasBalance = false;
        try {
            if (balance < 100) {
                throw new BalanceReachLowException("Your balance reach below 100$");
            }
            try {
                if (amount > balance - 99) {
                    hasBalance = false;
                    throw new IllegalWithDrawException("Withdraw amount exceed the balance");
                } else {
                    balance = balance - amount;
                    hasBalance = true;
                }
            } catch (IllegalWithDrawException e) {
                e.printStackTrace();
            }

        } catch (BalanceReachLowException e) {
            e.printStackTrace();
        }
        return hasBalance;
    }
    //getBalance
    public double getBalance(){
        return balance;
    }
    //printing the details
    @Override
    public String toString(){
        return "Customer Account:-Name: " +cus_name + " Account: "+ acc_No + " balance: " + balance +"\n";
    }
}
