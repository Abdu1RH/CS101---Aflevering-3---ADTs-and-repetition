import java.util.Scanner;

public class ExerciseB {
    public static void main(String[] args) {
        /*
B)
Write a method that returns if a user has input a valid CPR number.
A valid CPR number has:
10 Digits.
The first 2 digits are not above 31.
The middle 2 digits are not above 12.
The method returns true if the CPR number is valid, false if it is not.
 */

//B)
        System.out.println("Please enter your CPR number in following format (ddmmyyxxxx)");
        Scanner cprScanner = new Scanner(System.in);
        String cprNumber = cprScanner.nextLine();
        boolean cprValidator = cprValidator(cprNumber);
        System.out.println("Your CPR number is " + cprValidator);
    }
    public static boolean cprValidator(String cprNumber) {
        if (cprNumber.length() != 10) {
            return false;
        }


        int day = Integer.parseInt(cprNumber.substring(0, 2));
        if (day > 31) {
            return false;
        }

        int month = Integer.parseInt(cprNumber.substring(2, 4));
        if (month > 12) {
            return false;
        }

        String lastSixDigits = cprNumber.substring(4);
        if (!lastSixDigits.matches("[0-9]+")) {
            return false;
        }

        return true;

    }
}
