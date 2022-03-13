package Cs390Assignment12.Prob2;

public class BalanceReachLowException extends  Exception{
    public BalanceReachLowException(){
        super();
    }
    public BalanceReachLowException(String message){
        super("BalanceReachLowException!" + message);
    }
}
