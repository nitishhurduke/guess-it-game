import java.util.Scanner;
import java.util.Random;
class Game {
	private int pickednumber;
	private int UI; 
	private int guess = 0;
	private int bestScore = 0;
	
	public int getNumber() {
		Random random = new Random();
		pickednumber =random.nextInt(100); 
		return pickednumber;
	}
	public void takeUserInput() {
		Scanner sc = new Scanner(System.in);
		UI = sc.nextInt();
		
	}
	public int getUserInput() {
		return UI;

	}
	public void compare(int userInput,int number) {
		 if(userInput>number && (userInput-number > 25)) {
		    	
		    	System.out.println("your guess is way too Higher.. \n please try again");
		    	guess += 1;
		    	
		    }else if(userInput>number && (userInput-number < 25) && (userInput-number > 15)) {
		    	
		    	System.out.println("your guess is Higher.. \n please try again");
		    	guess += 1;
		    	
		    }else if(userInput>number && (userInput-number < 15)) {
		    	
		    	System.out.println("your guess is little Higher.. \n please try again");
		    	guess += 1;
		    	 
		    }else if(userInput<number && (number-userInput > 25)) {
		    	
		    	System.out.println("your guess is way too Lower.. \n please try again");
		    	guess += 1;
		    	
		    }else if(userInput<number && (number-userInput< 25)&& (number-userInput> 15)) {
		    	
		    	System.out.println("your guess is Lower.. \n please try again");
		    	guess += 1;
		    	
		    }else if(userInput<number && (number-userInput< 15)) {
		    	
		    	System.out.println("your guess is little Lower.. \n please try again");
		    	guess += 1;
		    	
		    }else if(userInput == number) {
		    	guess += 1;
		    	System.out.println("Yeahh!! you have guessed it right, " +number+" it was! \n You took "+guess+" guesses to reach the number");
		    	int totalguesses = guess;
		    	setBestScore(totalguesses);
		    	guess = 0;
		    }
		
	}
	public void setBestScore(int guess1) {
		if(bestScore == 0)
		{
			this.bestScore = guess1;
			System.out.println("New Best Score Set "+this.bestScore+" guesses");
			System.out.println("try to make it in lowest guesses possible.. ");
			System.out.println("Here I have picked another one");
		}else if(this.bestScore > guess)
		
		{
			int lastbestScore = this.bestScore;	
			this.bestScore = guess1;
			System.out.println("Congratulation....you have set A new Best Score '"+this.bestScore+"' guesses last best score was '"+lastbestScore+"' guesses");
			System.out.println("I'm sure you will break this one to");
			System.out.println("Here I have picked another one");
		}else {
			System.out.println("The Best Score is "+this.bestScore+" guesses Try harder this time to beat this best..." );
			System.out.println("I have picked another Number");
		}
		
	}
}

public class GuessIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game num = new Game();
		System.out.println("    *GUESS THE NUMBER* ");
		System.out.println(" #Game Rules : ");
		System.out.println(" -Computer will pick a random number from 1 to 100");
		System.out.println(" -You have to Guess the number in lowest number of guesses possible");
		System.out.println(" -I'll be giving hints :) if you follow them wisely I'm sure you will Master this Game ");
		System.out.println(" All the Best..Here we go..");
		System.out.println("I've picked a number! Start your guess: ");
		
		while(true) {
			int userNumber;
			int pickedNumber = num.getNumber();
			do {
			num.takeUserInput();
			userNumber = num.getUserInput();
			num.compare(userNumber, pickedNumber);	
			}while(pickedNumber != userNumber);
			System.out.println("\nStart your Guess...");
		}
	}
}
