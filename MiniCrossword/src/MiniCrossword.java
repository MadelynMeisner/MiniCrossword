import java.util.Scanner;
//System.out.println();
public class MiniCrossword
	{

		public static void main(String[] args)
			{
				//greetPlayer();
				displayBoard();
//				3 classes
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
							//boardMatrix[0][0];
					
						}
				}
			System.out.println(  "    1   2   3   4   5");
			System.out.println( "2 |___|___|___|___|___|");
			System.out.println( "2 |___|___|___|___|___|");
			System.out.println( "2 |___|___|___|___|___|");
			System.out.println( "2 |___|___|___|___|___|");
			System.out.println( "2 |___|___|___|___|___|");
			System.out.println( "2 |___|___|___|___|___|");
		}

	}
