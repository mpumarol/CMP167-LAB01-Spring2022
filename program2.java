/**
 * 
 * @author Michael Pumarol
 * @version 0.1
 * @description my second program
 * @created 3/15/22
 * 
 **/
import java.util.Scanner;//import scanner class
public class program2 {
	public static void main (String[]args) {
		Scanner input = new Scanner (System.in); 
	int num1, num2, num3;
	System.out.println("Enter first number");
	num1= input.nextInt();
	
	System.out.println("Enter second number");
	num2= input.nextInt();
	
	//calculate
	num3=num1+num2;
	
	//output
	System.out.println("Result = "+num3);
	
	input.close();
	
	
	}
}
