
import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);//create a scanner
        Random Random_number = new Random();//create a random number

        int correctGuess = Random_number.nextInt(10);//create a random number 1-10 and store it as a variable

        int numberOfTries = 0;//start the number of tries as 0 and store it
        int userGuess;//declare the userGuess variable
        boolean win = false;//declare the win variable as false so that the while loop can start

        while(!win) {//so while the variable win is false, the game continues to loop. Once win is true, then break out of the loop

            System.out.print("Guess a number between 1 and 10: ");
            userGuess = scanner.nextInt();//store the user's guess with a scanner as the userGuess variable
            numberOfTries++;//add 1 to the numberOfTries variable everytime the user guesses a number

            if(correctGuess==userGuess) {//if the user guesses the correct number then the while loop is broken- then the print statements at the bottom print
                win = true;
            }
            else if(userGuess<correctGuess) {//else if the user's guess is too low, then print this message
                System.out.println("your guess is too low, keep trying");

            }
            else if(userGuess>correctGuess) {//else if the user's guess is too high, then print this other message
                System.out.println("your guess is too high");

            }
        }
        System.out.println("You win! The number was "+correctGuess+" and it took you "+numberOfTries+" tries");
    }
}