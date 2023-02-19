import java.util.Random;

public class ExerciseA {
    public static void main(String[] args) {
/*
A)
Write a method that returns a random number between 1-10.
Call the method 10 times by using a loop
*/

        for (int i = 0; i < 10; i++) {
            int randomNumber = getRandomNumber();
            System.out.println(randomNumber);
        }
    }

    public static int getRandomNumber(){
        Random generateRandomNum = new Random();
        int randomNumber = generateRandomNum.nextInt(10) + 1;
        return randomNumber;
    }
}