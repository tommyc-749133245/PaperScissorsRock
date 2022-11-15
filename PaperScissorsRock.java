import javax.swing.JOptionPane;
import java.util.Random;
public class PaperScissorsRock
{

	public static void main(String[] args) 
	{
		//initialize variable;
		String computerStr;
		String playerStr;
		String resultStr ="";
		int result;
		int playerChoice;
		int computer;
		
		do
		{
			Object[] options = {"Paper","Scissors","Rock"};
			playerChoice = JOptionPane.showOptionDialog(null,
			    "Paper? Scissors? Rock? ",
			    "Paper, Scissors, Rock",
			    JOptionPane.YES_NO_CANCEL_OPTION,
			    JOptionPane.QUESTION_MESSAGE,
			    null,
			    options,
			    options[2]);
		
			//Random  draw a choice for computer
			Random randomGen = new Random();
			computer = randomGen.nextInt(3);
		 
			//check and display the choice of computer
			if(computer == 0)
				computerStr ="Computer picks paper";
			else if(computer == 1)
				computerStr = "Computer picks scissors";
			else
				computerStr = "Computer picks rock";
		
			//check and display the choice of player
			if( playerChoice == 0)
				playerStr = "Player picks paper";
			else if( playerChoice == 1)
				playerStr = "Player picks scissors";
			else
				playerStr = "Player picks rock";
		
			//calculate the result
			switch( playerChoice - computer){
			
			case 0:
				resultStr = "Draw!";
                break;
			case 1 :case -2 :
            	resultStr ="Player wins!";
               break;
            case 2 :case -1 :
            	resultStr = "Computer wins!";
               break;
			}
			
			//display the result and ask player continue or not
			Object[] start = {"Yes, please!","No way!"};
			result = JOptionPane.showOptionDialog(null,
				   	computerStr + "\n"
					+ playerStr + "\n"
					+ resultStr +"\n"
					+ "Continue?",
				    "Result",
				    JOptionPane.YES_NO_OPTION,
				    JOptionPane.WARNING_MESSAGE,
				    null,
				    start,
				    start[0]);
		}while(result==0);

	}

}
