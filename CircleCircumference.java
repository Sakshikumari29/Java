package udemy;

import java.util.Scanner;

public class CircleCircumference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.print("Please, enter circle radius: ");

double radius =sc.nextDouble();
double circleCircumference=2*Math.PI*radius;

System.out.println("Circle circumference is: " + circleCircumference);
	}

}
