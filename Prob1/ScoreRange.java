package Cs390Assignment12.Prob1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScoreRange {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any number between: 0 to 100");
        int userGiven = 0;
        try {
            userGiven = input.nextInt();
            if(userGiven < 0 || userGiven > 100){
                throw new UnsupportedOperationException();
            }
        } catch (InputMismatchException e1) {
            e1.printStackTrace();
        }

        System.out.println("You entered: "+ userGiven);
    }
}
