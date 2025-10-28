
import java.util.Scanner;


public class Reggie {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);


        String ssn = "";
        String mNumber = "";
        String menuChoice = "";


        ssn = SafeInput.getRegExString(in,
                "Please enter your SSN (NNN-NN-NNNN)",
                "^\\d{3}-\\d{2}-\\d{4}$");

        mNumber = SafeInput.getRegExString(in,
                "Please enter your UC M Number (M#####)",
                "^(M|m)\\d{5}$");


        menuChoice = SafeInput.getRegExString(in,
                "Enter your menu choice (O, S, V, or Q)",
                "^[OoSsVvQq]$");


        System.out.println("\n--- Success! ---");
        System.out.println("Your valid SSN is: " + ssn);
        System.out.println("Your valid M Number is: " + mNumber);
        System.out.println("Your valid menu choice is: " + menuChoice);
    }
}