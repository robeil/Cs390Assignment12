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
    public boolean deposit(double amount) throws IllegalWithDrawException {

            if (amount < 0) {
                throw new IllegalWithDrawException("You can not deposit negative amount");
            }
            balance += amount;

        return true;
    }
        //withdraw method
    public boolean withDraw(double amount) throws IllegalWithDrawException {

            if (balance < 100 || amount + 100 > balance) {
                throw new IllegalWithDrawException("Your balance reach below 100$");
            } else {
                balance -= amount;
                return true;
            }
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
