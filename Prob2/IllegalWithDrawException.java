package Cs390Assignment12.Prob2;

public class IllegalWithDrawException extends Exception {

    public IllegalWithDrawException(){
        super();
    }
    public IllegalWithDrawException(String message){
        super("IllegalWithDrawException!" + message);
    }
}
