
package random_guessing;

import java.util.*;
/**
 * Write a program the generates a random number between 0 and 100 and asks the 
 * user to guess it.the user can have at maximum 10 trials.if the number is guessed, 
 * the user should be asked if she/he wants to play again.if the number is not 
 * guessed and 10 trials were used, the user is not lucky, the program should 
 * terminate with a proper message.
 */
public class Random_guessing {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Guess for a number between 1 and 100!");

        Random rand = new Random();

        int randNumber = rand.nextInt(11); //set the random number to be between 0 and 100

        int guess = kb.nextInt();

        String playagain = "Y"; //set Y as an indicator to play again once the player guess right

        while (playagain.equalsIgnoreCase("Y")) {

            do {
                //if the user puts something other than an integer it will print an error message
                if (guess < 1 || guess > 10) {
                    System.out.println("Not a valide number, please try again!");
                    guess = kb.nextInt();
                    //set a message to inform the user that he guessed to high
                } else if (guess > randNumber) {
                    System.out.println("To high, try again!");
                    guess = kb.nextInt();
                    //set a message to inform the user the he guessed to low    
                } else if (guess < randNumber) {
                    System.out.println("To low, try again!");
                    guess = kb.nextInt();
                }
                //set a message to the user to inform that he guessed right
            } while (guess != randNumber);
            System.out.println("Congratulations, you guessed right!!");
            System.out.println("Would you like to play again?");
            kb.nextLine();
            playagain = kb.nextLine();
            System.out.println("Guess for a number between 1 and 100!");
            randNumber = rand.nextInt(11);
        }

    }
}
