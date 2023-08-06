import java.util.Scanner;

// This advanced number game makes you guess a number between 1 and 50 but give you hints if the actual number is higher or lower.
public class Main {

    //creating a method to generate a random number between 1 and 50.
    public static int generateRandomNumber(){
        return (int) ((Math.random() * (100 - 1)) + 1);
    }

    public static void main(String[] args){
        System.out.println("Hey, you get 5 chances to guess a number between 1 and 100. " +
                "\nAfter each guess the computer will give you a hint if you need to guess higher or lower." +
                "\nThe computer just picked a random number!");
        int randomNumber = generateRandomNumber();
        //System.out.println(randomNumber);


        for(int i = 0; i <5; i++){
            int timesGuessed = 0;

            Scanner guess = new Scanner(System.in);
            System.out.println("What is your guess?");

            int number = guess.nextInt();
            System.out.println("You guessed number: " + number);

                if(number == randomNumber) {
                    System.out.println("Whoop whoop!! You guessed the number correctly. The number the computer picked was indeed " + randomNumber);
                    System.exit(0);

                } else if (number > randomNumber && i <4) {
                    System.out.println("Whoops, that's the wrong number. pick a SMALLER number!");

                } else if (number < randomNumber && i <4) {
                    System.out.println("Whoops, that's the wrong number. pick a LARGER number!");
                }


        }
        System.out.println("Ooh NO that's the wrong number and you runned out of guesses. you failed :( \n" +
                "the right number was: " + randomNumber);
    }
}