package exercise2;

import javax.swing.JOptionPane;

public class LottoDriver
{
	//Implements the Lotto class so that it displays "You win" when user enters the sum of random 31numbers
	//generated by the computer
	public static void main(String[] args)
	{
		for(int i=0; i<5; i++)
			{
				Lotto lotto=new Lotto();
				System.out.println(lotto.getArraySum()); //(For testing purposes only).The console displays the lotto number
				if(lotto.getUserInput()==lotto.getArraySum()) 
				{
					JOptionPane.showMessageDialog(null, " You win!");
					break;
				}	
				else if(i==4)
					JOptionPane.showMessageDialog(null, "The computer wins.");
				else
					continue;		
			}	
	}

}
