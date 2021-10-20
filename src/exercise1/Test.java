package exercise1;
import javax.swing.*;
import java.security.SecureRandom;
public class Test {
	
	private String[] questions = new String[5]; 
	private int[] answers= {2,3,1,4,3}; // Initializes an array of correct answer for each of the five questions
	int numRightAnswers; //number of correct answers

	//Initializes the array of questions
	public Test() {
		questions[0]="Which of the following is a reference type? \n 1. int \n 2. Scanner \n 3. char \n 4. long";
		questions[1]= "Which of the following is a primitive type? \n 1. String \n 2. Scanner \n 3. double \n 4.Object ";
		questions[2]="What is the symbol for floating point number? \n 1. %f \n 2. %d \n 3. %a \n 4. None of the above";
		questions[3]="What does %n represent? \n 1. Any number \n 2. Null value \n 3. Nothing in particular \n 4. New line";
		questions[4]="What is true of a constructor? \n 1. They can return values \n 2. There can only be one per class \n 3. They can initialize values \n 4. All of the above ";
	}

	//Displays the question and four options for an answer
	public int simulateQuestion(int i) {
		Object[] options = {1,2,3,4}; //The numbers represent four answer options to be displayed in the dialog box.
		int answer=JOptionPane.showOptionDialog(null, questions[i], "Click on the correct answer", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
		return answer+1;
	}
	
	//Checks the answer against the predefined array of valid answers
	//increments the number of correct answers
	public boolean checkAnswer(int question, int answer) {
		boolean isRight=false;
		if(answer==answers[question]) 
		{
			isRight=true;
			numRightAnswers++;
		}
		return isRight;
	}
	
	//Randomly generates an appropriate message depending
	//on whether the answer is right or wrong
	public String generateMessage(boolean isRight) {
		String response="";
		SecureRandom randomNumber = new SecureRandom();
		int random = randomNumber.nextInt(4); //Generates an integer between 0-3, and associates the integer to a message
		if(isRight) {
			switch(random) {
			case 0:
				response= "Very Good!";
				break;
			case 1:
				response= "Excellent!";
				break;
			case 2:
				response= "Well Done!";
				break;
			case 3:
				response= "Great! Keep it up";
				break;
			}
		}
		else {
			switch(random) {
			case 0:
				response= "Try again";
				break;
			case 1:
				response= "No. Don't give up!";
				break;
			case 2:
				response= "Wrong Answer. Take another chance.";
				break;
			case 3:
				response= "No. Please do the next one";
				break;
			}
		}
		
		return response;
		
	}
	
	//Calls the methods to display the questions, to check the answer
	//against the predefined array of valid answers, and displays the appropriate messages
	//including the number and percentage of right answers
	public void inputAnswer() {
		for(int i=0; i<5; i++) {
			JOptionPane.showMessageDialog(null,generateMessage(checkAnswer(i, simulateQuestion(i))));
		}
		
		JOptionPane.showMessageDialog(null, "number of correct answers: " + numRightAnswers + "/5");
		JOptionPane.showMessageDialog(null, "Percentage of correct answers:" + numRightAnswers*100/5 + "%");
	}

}
