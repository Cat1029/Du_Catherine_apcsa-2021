//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		String response = "y";
		
		//add in a do while loop after you get the basics up and running
		while(response.equals("y")) {
			String player = "";
		
			out.print("\nRock-Paper-Scissors - choose your hand [R,P,S] :: ");
			
			//read in the player value
			player = keyboard.nextLine();
		
			RockPaperScissors game = new RockPaperScissors(player);		
			out.println(game);
			
			out.print("Do you want to play again?");
			response = keyboard.nextLine();
			
		}
	}
}



