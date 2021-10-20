package exercise3;
import java.lang.Math.*;

public class MethodOverload {
//Produces a table of cosines of a series of angles with parameters of starting value, increment,
//and number of rows
	public static void displayCosineTable(double startValue, double increment, int rows)
    {
        System.out.println("\n angle     cosine of angle");
        for (int i = 1; i <= rows; i++)
        {
            System.out.printf("%f    %f%n", startValue, (Math.cos(startValue)));
            startValue += increment;
        }
    }
//Produces a table of cosines of a series of angles with parameters of starting value and increment//Produces a table of cosines of a series of angles with parameters of starting value, increment,
	//and number of rows
	public static void displayCosineTable(double startValue, double increment) {
			int rows=5;
		  System.out.println("\n angle     cosine of angle");
	        for (int i = 1; i <= rows; i++)
	        {
	            System.out.printf("%f    %f%n", startValue, (Math.cos(startValue)));
	            startValue += increment;
	        }
	}
	
	//Produces a table of cosines of a series of angles with the parameter of starting value only

	public static void displayCosineTable(double startValue) {
			int rows=5;
			double increment=0.1;
		  System.out.println("\n angle     cosine of angle");
	        for (int i = 1; i <= rows; i++)
	        {
	            System.out.printf("%f    %f%n", startValue, (Math.cos(startValue)));
	            startValue += increment;
	        }
	}
}
