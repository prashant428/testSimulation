package exercise2;
import javax.swing.*;
import java.security.*;


public class Lotto {
	//declaring fields
	private int[] numbers = new int[3];
	private SecureRandom randomNumber=new SecureRandom();
	
	//declaring getters and setters for random array
	public int[] getNumbers() {
		return numbers;
	}
	public void setNumbers(int[] numbers) {
		this.numbers = numbers;;
	}

	//initializing the array of random number less than 10
	public Lotto() {
		numbers[0]=randomNumber.nextInt(8)+1;
		numbers[1]=randomNumber.nextInt(8)+1;
		numbers[2]=randomNumber.nextInt(8)+1;
	}
	
	//Getting and vetting user input so that it is between 3 and 27
	public int getUserInput() 
	{
		String input=JOptionPane.showInputDialog(null, "Enter a number between 3 and 27", null, JOptionPane.INFORMATION_MESSAGE);
		while((Integer.parseInt(input)<3) ||(Integer.parseInt(input)>27))
		{
			JOptionPane.showMessageDialog(null, "Invalid Number. Please enter number betweeen 3 and 27");
			input=JOptionPane.showInputDialog(null, "Enter a number between 3 and 27", null, JOptionPane.INFORMATION_MESSAGE);

		}
		return Integer.parseInt(input);
	}
	
	//Calculating the sum of the computer generated array
	public int getArraySum()
	{
		int sum=0;
		for(int i=0; i<getNumbers().length; i++) 
		{
		 sum+=getNumbers()[i];
		}
		return sum;
	}

}
