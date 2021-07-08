import java.util.Scanner;

import java.util.Random;

public class GuessingGameApp {

    public static void main(String[] args) {
        Random rand = new Random();
        int upperbound = 10;
        int secretNumber = rand.nextInt(upperbound);
        Scanner input = new Scanner(System.in);
        int guess = 0;
        for(int i = 0; i < 3; i++) {
            System.out.println("Guess a number between 1 and 10!");
            String message = input.nextLine();
            guess = Integer.parseInt(message);

            if(guess == secretNumber) {
                System.out.println("Huzzah! You have won the game!");
                return;
            }   else if (guess == 0) {
                System.out.println("Did you not read my instructions?? *Sigh* Here they are one more time...Guess a number between 1 and 10!");
            }   else if (guess == -1) {
                return;
            }   else if (i < 2) {
                    if(guess < secretNumber && i < 2) {
                        System.out.println("Here's a hint: the number is higher!");
                    }   else if (guess > secretNumber && i < 2) {
                        System.out.println("Here's a hint: the number is lower!");
                    }
            }   else {
                System.out.println("Womp womp...you loooooose! Good day!");
            }
        }
    }
}
