package calculator;

import java.util.Scanner;

public class Calculator{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ch,a,b,res;
		
		System.out.println("Please enter any two numbers :");
		a=sc.nextInt();
		b=sc.nextInt();
		do {
			System.out.println("Choose any one option from thr following:");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.EXIT");
			System.out.println("Enter your choice :");
			ch=sc.nextInt();
		
		
			switch(ch)
			{
			case 1:
				res=a+b;
				System.out.println("sum =" + res);
				break;
			case 2:
				res=a-b;
				System.out.println("difference =" + res);
				break;
			case 3:
				res=a*b;
				System.out.println("product =" + res);
				break;
			case 4:
				res=a/b;
				System.out.println("quotient =" + res);
				break;
			case 5:
				System.out.println("EXIT");
				break;
			default:
				System.out.println("Please enter correct option...");
			}	
		}
		while(ch != 5);
	}
}