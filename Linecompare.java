package Linecomparison;

import java.util.Scanner;

public class Linecompare {
	
	static Double Length1=0.0d;
	static Double length2=0.0d;
	
	public static void main(String[] args)
	{
		System.out.println("Enter the first line");
		Length1 = lengthcalculation();
		System.out.println("Enter the second line");
		length2 = lengthcalculation();
		linecomparison();
	}
 public static Double lengthcalculation()
 {
	 System.out.println("Welcome to line comparison");
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the value of x1 and x2");
		float x1 = scanner.nextFloat();
		float x2 = scanner.nextFloat();
		System.out.println("enter the value of y1 and y2");
		float y1 = scanner.nextFloat();
		float y2 = scanner.nextFloat();
		double length =Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("length of the line is"+length);
		return length;
 }
public static void linecomparison()
{
	if (Length1.equals(length2))
	{
		System.out.println("Both line are equal");
	}
	else {
		System.out.println("Both line are Notequal");
	}
}
}
