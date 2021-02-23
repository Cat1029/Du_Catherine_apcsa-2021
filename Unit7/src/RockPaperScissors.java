//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
		setPlayers("");
	}

	public RockPaperScissors(String player)
	{
		setPlayers(player);
	}

	public void setPlayers(String player)
	{
		playChoice = player;
		double random = Math.random() * 2;
		if(random == 0) {
			compChoice = "R";
		}
		else if (random == 1) {
			compChoice = "P";
		}
		else {
			compChoice = "S";
		}
	}

	public String determineWinner()
	{
		String winner="";
		
		if(playChoice.equals(compChoice)) {
			winner = "Draw Game";
			return winner;
		}
		//if player is rock
		if(playChoice.equals("R")) {
			if(compChoice.equals("P")) {
				winner = "Computer wins <<Papper Covers Rock>>";
				return winner;
			}
			else if(compChoice.equals("S")) {
				winner = "Player wins <<Rock Breaks Scissors>>";
				return winner;
			}
		}
		//if player is paper
		if(playChoice.equals("P")) {
			if(compChoice.equals("R")) {
				winner = "Player wins <<Papper Covers Rock>>";
				return winner;
			}
			else if(compChoice.equals("S")) {
				winner = "Computer wins <<Scissors Cuts Paper>>";
				return winner;
			}
		}
		//if player is scissors
		if(playChoice.equals("S")) {
			if(compChoice.equals("R")) {
				winner = "Computer wins <<Rock Breaks Scissors>>";
				return winner;
			}
			else if(compChoice.equals("P")) {
				winner = "Player wins <<Scissors Cuts Paper>>";
				return winner;
			}
		}

		return winner;
	}

	public String toString()
	{
		String output = "player had " + playChoice +"\n" +
						"computer had "  + compChoice + "\n" +
						"!" + determineWinner() + "!";
		return output;
	}
}