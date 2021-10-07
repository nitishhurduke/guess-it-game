/*
 * Create a class Game,which allows user to palay "Guess the Number"
 * game shoild have following methods 
 * 1. Constructor to generate random number
 * 2. takeUserInput() to take a user input of number 
 * 3. isCorrectNumber() to detect whter the number entered by user is true
 * Use properties such as noOfGuesses(),etc to get this task done.
 */
import java.lang.Math;
import java.util.Scanner;

	
	
 public class GameIsOn {
	 
	 static int userInput,guess =0 ;
	static int pickedNumber;
	 
	 static int settingNumber() {
			int min = 1;
			int max = 100;
			int number =(int) (Math.random()*(max-min+1)+min);
			return number;
		}
	 static int getUserInput() {
			Scanner input = new Scanner (System.in);
			System.out.println("Enter your Guess : ");
			userInput = input.nextInt();	
			return userInput;
	    }
	 
	 static void compareUserInput(){
		 if(userInput>pickedNumber && (userInput-pickedNumber > 25)) {
		    	
		    	System.out.println("your guess is way too Higher.. \n please try again");
		    	guess += 1;
		    	 getUserInput();
				 compareUserInput();
		    }else if(userInput>pickedNumber && (userInput-pickedNumber < 25) && (userInput-pickedNumber > 15)) {
		    	
		    	System.out.println("your guess is Higher.. \n please try again");
		    	guess += 1;
		    	 getUserInput();
				   compareUserInput();
		    }else if(userInput>pickedNumber && (userInput-pickedNumber < 15)) {
		    	
		    	System.out.println("your guess is little Higher.. \n please try again");
		    	guess += 1;
		    	 getUserInput();
				   compareUserInput();
		    }else if(userInput<pickedNumber && (pickedNumber-userInput > 25)) {
		    	
		    	System.out.println("your guess is way too Lower.. \n please try again");
		    	guess += 1;
		    	 getUserInput();
				   compareUserInput();
		    }else if(userInput<pickedNumber && (pickedNumber-userInput< 25)&& (pickedNumber-userInput> 15)) {
		    	
		    	System.out.println("your guess is Lower.. \n please try again");
		    	guess += 1;
		    	 getUserInput();
				 compareUserInput();
		    }else if(userInput<pickedNumber && (pickedNumber-userInput< 15)) {
		    	
		    	System.out.println("your guess is little Lower.. \n please try again");
		    	guess += 1;
		    	 getUserInput();
				   compareUserInput();
		    }else if(userInput == pickedNumber) {
		    	guess += 1;
		    	System.out.println("Congratulations!! you have guessed it right, " +pickedNumber+" it was! \n You took "+guess+" guesses to reach the number");
		    	
		    }
	 }
	public static void main(String[] args) {
		
		System.out.println("Lets, Start the Game.. I have picked a number ");
	    
	    pickedNumber = settingNumber();   	 
	    getUserInput();
	   compareUserInput();
		   
	}	
}

