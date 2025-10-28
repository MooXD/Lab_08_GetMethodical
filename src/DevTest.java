import java.util.Scanner;

public class DevTest {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("--- Testing getRegExString ---");


        String mNumPattern = "^(M|m)\\d{8}$";
        String studentID = SafeInput.getRegExString(in, "Enter your M-Number (e.g., m12345678)", mNumPattern);

        System.out.println("Your M-Number is: " + studentID);
    }
}