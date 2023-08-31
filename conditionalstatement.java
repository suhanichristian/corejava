package core;

import java.util.Scanner;

public class conditionalstatement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();
		//1. simple if
		if (a>b) {
			System.out.println("a is greater than b");
		}
		
		//2. if else
		if (a>b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("b is greater than a");
		}
		
		//3. nested if
	
		System.out.println("enetr age = ");
		int age = sc.nextInt();
		if (age > 18) {
			if (age < 60);{
				System.out.println("");
				System.out.println("age is greater than 18 but not less than 60");
			}
		} else {
			System.out.println("age is less than 18");
		}
		//4. else if ladder
		System.out.println("enter marks = ");
		int marks = sc.nextInt();
		if (marks < 35) {
			System.out.println("fail");
		}else if (marks >= 35 && marks <= 50) {
			System.out.println("pass class");
		}else if (marks >= 51 && marks <=70) {
			System.out.println("C class");
		}else if (marks >=71 && marks <=80) {
			System.out.println("B class");
		}else if (marks >=81 && marks <=90) {
			System.out.println("A class");
		}else if (marks >=91 && marks <=100) {
			System.out.println("A+ class");
		}else {
			System.out.println("invalid input");
		}
		// 5. switch case
		System.out.println("enter your choice :");
		int s = sc.nextInt();
		switch (a) {
		case 1:
			     System.out.println("1");
			     break;
		case 2:
			     System.out.println("2");
			     break;
		default:
			     System.out.println("invalid");
		}
	}
}
