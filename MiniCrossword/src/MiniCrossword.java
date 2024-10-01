import java.util.ArrayList;
import java.util.Scanner;
//System.out.println();
public class MiniCrossword
	{
// blah blah blah
		public static void main(String[] args)
			{
				//greetPlayer();
				//displayBoard();
				playerGuess();
//			3 classes
//				- this one
//				- all questions
//				- getters setters etc
//				methods
//				 intructions, greet, make sure each guess is how many letters 
//				 enter which would print grid and questions , display
//				method for player guess
//				the board is out with questions 
//				player says question number 1a ex and types the word,
//				 if its right it fills in the board if its wrong it says 
//				 try again, or try differetn questioh 
//				method for 
////				 

			}
		public static void greetPlayer()
		{
			Scanner userInput = new Scanner (System.in);
			System.out.println("Hello! Lets play a crossword!! The board is 5 x 5, which means each word should be five letters. To type your answer write the question number (ex. 1A) followed by your answer in all caps. Lets start, press enter to begin.  ");
			String playerGuess = userInput.nextLine();
		}
		public static void displayBoard()
		{
			String[][] boardMatrix = new String[5][5];
			for (int row = 0; row < boardMatrix.length; row++)
				{
					for(int col = 0; col < boardMatrix.length; col ++)
						{				
						}
				}
			System.out.println(  "    1     2   3   4   5");
			System.out.println( "1 |_"+boardMatrix[0][0]+"_|_"+boardMatrix[0][1]+"_|_"+boardMatrix[0][2]+"_|_"+boardMatrix[0][3]+"_|_"+boardMatrix[0][4]+"_|");
			System.out.println( "2 |_"+boardMatrix[1][0]+"_|_"+boardMatrix[1][1]+"_|_"+boardMatrix[1][2]+"_|_"+boardMatrix[1][3]+"_|_"+boardMatrix[1][4]+"_|");
			System.out.println( "3 |_"+boardMatrix[2][0]+"_|_"+boardMatrix[2][1]+"_|_"+boardMatrix[2][2]+"_|_"+boardMatrix[2][3]+"_|_"+boardMatrix[2][4]+"_|");
			System.out.println( "4 |_"+boardMatrix[3][0]+"_|_"+boardMatrix[3][1]+"_|_"+boardMatrix[3][2]+"_|_"+boardMatrix[3][3]+"_|_"+boardMatrix[3][4]+"_|");
			System.out.println( "5 |_"+boardMatrix[4][0]+"_|_"+boardMatrix[4][1]+"_|_"+boardMatrix[4][2]+"_|_"+boardMatrix[4][3]+"_|_"+boardMatrix[4][4]+"_|");
			
		}
		public static void playerGuess()
		{
			if(playerGuess.equals(Data.crossword.get(3).getAnswer()))
			      {
			        System.out.println("Great! thats the answer, 200 points will be added to your current score of " + playerScore + "!"); 
			        System.out.println();
			        System.out.println();
			       
			      }

			      else if(!playerGuess.equals(Data.crossword.get(3).getAnswer()))
			         {
			           System.out.println("nope! the correct answer was " + Data.crossword.get(3).getAnswer() + ". No points will be added to your current score of " + playerScore +".");
			           System.out.println();
			         }
			      
			          values[0][5] = "  ";
			    }    
		}
	}
