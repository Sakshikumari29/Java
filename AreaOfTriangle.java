package udemy;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		System.out.print("Please, enter A side of a triangle: ");
		int a=sc.nextInt();
		
		System.out.print("Please, enter B side of a triangle: ");
		int b=sc.nextInt();
		
		System.out.print("Please, enter C side of a triangle: ");
		int c=sc.nextInt();
		
		double s=(a+b+c)/2;
		
		double triangleArea=(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
		
		System.out.println("Triangle area is: " + triangleArea);
		
	}

}
