import java.util.Scanner;

public class SafeInput {

    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;
    }

    public static int getInt(Scanner pipe, String prompt) {

        int validNumber = 0;
        boolean gotGoodInput = false;

        do {
            System.out.print("\n" + prompt + ": ");

            if (pipe.hasNextInt()) {
                validNumber = pipe.nextInt();
                pipe.nextLine();
                gotGoodInput = true;
            } else {
                String trash = pipe.nextLine();
                System.out.println("Invalid input. You entered: '" + trash + "'. Please enter a whole number.");
            }

        } while (!gotGoodInput);

        return validNumber;
    }

    public static double getDouble(Scanner pipe, String prompt) {

        double validDouble = 0.0;
        boolean gotGoodInput = false;

        do {
            System.out.print("\n" + prompt + ": ");

            if (pipe.hasNextDouble()) {
                validDouble = pipe.nextDouble();
                pipe.nextLine();
                gotGoodInput = true;
            } else {
                String trash = pipe.nextLine();
                System.out.println("Invalid input. You entered: '" + trash + "'. Please enter a number.");
            }

        } while (!gotGoodInput);

        return validDouble;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {

        int rangedNum = 0;
        boolean gotGoodInput = false;

        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");

            if (pipe.hasNextInt()) {
                rangedNum = pipe.nextInt();
                pipe.nextLine();

                if (rangedNum >= low && rangedNum <= high) {
                    gotGoodInput = true;
                } else {
                    System.out.println("Invalid input. The number " + rangedNum + " is not in the range [" + low + " - " + high + "].");
                }

            } else {
                String trash = pipe.nextLine();
                System.out.println("Invalid input. You entered: '" + trash + "'. Please enter a whole number.");
            }

        } while (!gotGoodInput);

        return rangedNum;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {

        double rangedDouble = 0.0;
        boolean gotGoodInput = false;

        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");

            if (pipe.hasNextDouble()) {
                rangedDouble = pipe.nextDouble();
                pipe.nextLine();

                if (rangedDouble >= low && rangedDouble <= high) {
                    gotGoodInput = true;
                } else {
                    System.out.println("Invalid input. The number " + rangedDouble + " is not in the range [" + low + " - " + high + "].");
                }

            } else {
                String trash = pipe.nextLine();
                System.out.println("Invalid input. You entered: '" + trash + "'. Please enter a number.");
            }

        } while (!gotGoodInput);

        return rangedDouble;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {

        boolean retVal = false;
        boolean gotGoodInput = false;
        String response = "";

        do {
            System.out.print("\n" + prompt + " [Y/N]: ");
            response = pipe.nextLine();

            if (response.equalsIgnoreCase("y")) {
                retVal = true;
                gotGoodInput = true;
            } else if (response.equalsIgnoreCase("n")) {
                retVal = false;
                gotGoodInput = true;
            } else {
                System.out.println("Invalid input. Please enter 'Y' or 'N'.");
            }

        } while (!gotGoodInput);

        return retVal;
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {

        String retVal = "";
        boolean gotGoodInput = false;

        do {
            System.out.print("\n" + prompt + ": ");
            retVal = pipe.nextLine();

            if (retVal.matches(regEx)) {
                gotGoodInput = true;
            } else {
                System.out.println("Invalid input: '" + retVal + "'. Does not match the pattern.");
            }

        } while (!gotGoodInput);

        return retVal;
    }

    public static void prettyHeader(String msg)
    {
        int totalWidth = 60;

        for(int i = 0; i < totalWidth; i++)
        {
            System.out.print("*");
        }
        System.out.println();

        int starCount = 6;
        int msgLen = msg.length();

        int paddingSpace = totalWidth - starCount - msgLen;

        int leftPadding = paddingSpace / 2;

        int rightPadding = paddingSpace - leftPadding;

        System.out.print("***");

        for(int i = 0; i < leftPadding; i++)
        {
            System.out.print(" ");
        }

        System.out.print(msg);

        for(int i = 0; i < rightPadding; i++)
        {
            System.out.print(" ");
        }

        System.out.println("***");

        for(int i = 0; i < totalWidth; i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }

}