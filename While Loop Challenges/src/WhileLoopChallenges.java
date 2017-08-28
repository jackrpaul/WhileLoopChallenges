import java.util.Scanner;
public class WhileLoopChallenges
	{
		static int randomNumber, userGuess;
		static boolean challengeTwoContinues, challengeThreeContinues;
		public static void main(String[] args)
			{
			challengeTwoContinues = true;
			challengeThreeContinues = true;
			randomNumber = (int) (Math.random()*25 + 1);
			challenge1();
			do
				{
					challenge2();
				}
			while (challengeTwoContinues);
			do
				{
					challenge3();
				}
			while (challengeThreeContinues);
			}

		private static void challenge1()
			{
			int number = 5;
			while (number > 0)
				{
				System.out.println(number);
				number--;
				}	
			}

		private static void challenge2()
			{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Give me a letter.");
			String letter = userInput.nextLine();
			if (letter.equals("q"))
				{
				challengeTwoContinues = false;
				System.out.println("You disappoint me.");
				}
			}

		private static void challenge3()
			{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Guess a number between 1 and 25.");
			userGuess = userInput.nextInt();
			if(userGuess == randomNumber)
				{
				System.out.println("You got it! Congratulations!");
				challengeThreeContinues = false;
				}
			else if (userGuess > randomNumber)
				{
				System.out.println("Too high! Guess again.");
				}
			else if (userGuess < randomNumber)
				{
				System.out.println("Too low! Guess again.");
				}
			}
		
	}
