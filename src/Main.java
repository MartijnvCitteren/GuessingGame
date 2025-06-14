import java.util.Scanner;

// This advanced number game makes you guess a number between 1 and 100 and gives
// you hints if the actual number is higher or lower.
public class Main {

    // creating a method to generate a random number between 1 and 100.
    public static int generateRandomNumber() {
        // Math.random() returns a value between 0.0 (inclusive) and 1.0 (exclusive).
        // Multiplying by 100 and adding 1 results in a range of 1 to 100 inclusive.
        return 1 + (int) (Math.random() * 100);
    }

    public static void main(String[] args){
        System.out.println("Hey, you get 5 chances to guess a number between 1 and 100. " +
                "\nAfter each guess the computer will give you a hint if you need to guess higher or lower." +
                "\nThe computer just picked a random number!");
        int randomNumber = generateRandomNumber();
        //System.out.println(randomNumber);


        Scanner guess = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("What is your guess?");

            int number = guess.nextInt();
            System.out.println("You guessed number: " + number);

                if (number == randomNumber) {
                    System.out.println("Whoop whoop!! You guessed the number correctly. The number the computer picked was indeed " + randomNumber);
                    System.exit(0);

                } else if (number > randomNumber && i < 4) {
                    System.out.println("Whoops, that's the wrong number. pick a SMALLER number!");

                } else if (number < randomNumber && i < 4) {
                    System.out.println("Whoops, that's the wrong number. pick a LARGER number!");
                }


        }
        guess.close();
        System.out.println("Ooh NO that's the wrong number and you runned out of guesses. you failed :( \n" +
                "the right number was: " + randomNumber);
    }
}