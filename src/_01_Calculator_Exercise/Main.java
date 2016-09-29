package _01_Calculator_Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args){
		
        Calc calc = new Calc();
		double a = 0;
		double b = 0;
		String sign = "";
		double result = 0;
		
		System.out.println("Welcome to My Calculator \r");
		
		//BufferedReader - Reads text from a character-input stream, buffering characters so as to provide for the efficient reading of characters, arrays, and lines
		
		//InputStreamReader - A bridge from byte streams to character streams: It reads bytes and decodes them into characters using a specified charset.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
		
		//"Try" and "catch" are represent the handling of exceptions due to data or coding errors during program execution. 
		//A try block is the block of code in which exceptions occur. A catch block catches and handles try block exceptions.
		
		
		try {
			System.out.println("First number, then press Enter:");
			a = Double.parseDouble(reader.readLine());
			System.out.println("Enter the calculation type desired...");
			System.out.println("+(add) or-(subtract) or *(multiply) or /(divide) or %(percentage), then press Enter:");
			sign = reader.readLine();
			System.out.println("Second number, then press Enter:");
			b = Double.parseDouble(reader.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Switch - Alternate to "if/else". Can be used with byte, short, char, int, enum, String and a few others. 
		//In this case String = sign. Must have "break" at end of case.
		
		switch(sign){
		case "+":
			result = calc.add(a, b);
			System.out.println("");
			System.out.println("Result:");
			System.out.println(result);
			break;
		case "-":
			result = calc.subtract(a,b);
			System.out.println("");
			System.out.println("Result: ");
			System.out.println(result);
			break;
		case "*":
			result = calc.multiply(a, b);
			System.out.println("");
			System.out.println("Result: ");
			System.out.println(result);
			break;
		case "/":
			result = calc.divide(a, b);
			System.out.println("");
			System.out.println("Result: ");
			System.out.println(result);
			break;
		case "%":
			result = calc.percentage(a, b);
			System.out.println("");
			System.out.println("Result: ");
			System.out.println(result + "%");
			break;
		default:
			System.out.println("Wrong sign!");
		
		
		}
		
	}

}
