/**
 * 
 * @author Michael Pumarol
 * @version 0.1
 * @description my first program
 * @created 3/15/22
 * 
 **/
import java.util.Scanner;
public class Program1 {
	
	public static void main( String[] args) {
		
		Scanner input =new Scanner (System.in);// creating the scanner object
		
		System.out.println("This is my first program!");
		System.out.println("Ok, please enter your name:");
		
		String name = input.next();
		String message = "hello "+ name + ", it's so nice to meet you! ";
		System.out.println(message);
		
		input.close();
	}
		
		//string message = ;
		
		//system.out.println(message)

	
	}

