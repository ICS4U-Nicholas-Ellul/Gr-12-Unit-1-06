/********************************************************************************
 *
 * Created by: Nicholas Ellul
 * Created on: Sept 2016
 * This is a dice roll guessing game. It now uses a function to return the value.
 *
 ********************************************************************************/
 
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

public class DiceGuessingGame{
 	        static Scanner reader = new Scanner(System.in);
        
	public static int RollDie(int maxValue){
		Random rnd = new Random();
		int randomNumber = rnd.nextInt(maxValue) +1;
		return randomNumber;
	}	
	
    public static void main(String[] args) throws IOException { 
    	
    	int userGuess;
    	int sidesOnDie;
    	int guessesMade = 1;
    	int diceNumber;
    
    	System.out.println("How many sides are on your dice?");
    	sidesOnDie = reader.nextInt();
    	
	    System.out.println("The dice rolls. It lands on...?");
	    diceNumber = RollDie(sidesOnDie);
	    
	    while(true){
	        try {
	            userGuess = reader.nextInt();
	            
	           	if(userGuess == diceNumber){
	           		System.out.println("Correct!");
	           		System.out.println("You guessed it in " + guessesMade + " rolls.");
	           		break;
	            }
	            else{
	           		System.out.println("Nope, guess again!");
	           		guessesMade = guessesMade + 1;
	            }
	            
	        } catch(NumberFormatException nfe) {
	            System.err.println("Invalid input!");
	        }
        }
        System.out.println();
        System.out.println("Done.");
    }

}