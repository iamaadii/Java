//question 2

//import java.util.Scanner;
//public class practice_set {
//
//	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		System.out.println("enter subject 1 marks : ");
//		int marks1 = s.nextInt();
//		System.out.println("enter subject 2 marks : ");
//		int marks2 = s.nextInt();
//		System.out.println("enter subject 3 marks : ");
//		int marks3 = s.nextInt();
//		
//		float avg = (marks1+marks2+marks3)/3.0f;
//		System.out.println("percentage : "+avg);
//		
//		if(marks1>=33 && marks2>=33 && marks3>=33 && avg>=40.0)
//			System.out.println("pass");
//		else
//			System.out.println("fail");
//	}
//}

//question 3

//import java.util.Scanner;
//public class practice_set {
//
//	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		System.out.print("enter your income in lakhs : ");
//		float income = s.nextFloat();
//		float tax;
//		if(income>=2.5f && income<=5.0f)
//		{
//			tax=(income*5)/100;
//			System.out.println("tax amount : "+tax);
//		}
//		else if(income>5.0f&&income<=10.0f)
//		{
//			tax=(income*20)/100;
//			System.out.println("tax amount : "+tax);
//		}	
//		else if(income>10.0f)
//		{
//			tax=(income*30)/100;
//			System.out.println("tax amount : "+tax);
//		}
//		else
//		{
//			tax = 0;
//			System.out.println("tax amount : "+tax);
//		}
//	}
//}

//question 4 (using enhance switch case)

//import java.util.Scanner;
//public class practice_set {
//
//	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		System.out.println("enter day : ");
//		int day = s.nextInt();
//		switch(day)
//		{
//		case 1->System.out.println("sunday");
//		case 2->System.out.println("monday");
//		case 3->System.out.println("tuesday");
//		case 4->System.out.println("wednesday");
//		case 5->System.out.println("thursday");
//		case 6->System.out.println("friday");
//		case 7->System.out.println("saturday");
//		default->System.out.println("not a valid day");			    
//		}		
//	}
//}

//question 5

//import java.util.Scanner;
//public class practice_set {
//
//	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		System.out.println("enter year : ");
//		long year = s.nextLong();
//		if((year%400==0) || (year%4==0) && (year%100!=0))
//			System.out.println("it is a leap year");
//		else
//			System.out.println("not a leap year");
//	}
//} 

//question 6

import java.util.Random;
import java.util.Scanner;
public class practice_set {

	public static void main(String[] args) {
		Random r=new Random();

		Scanner s= new Scanner(System.in);
		System.out.print("enter no of rounds : ");
		int rounds=s.nextInt();

		System.out.print("enter 0 for rock\n");
		System.out.print("enter 1 for paper\n");
		System.out.print("enter 2 for scissor\n");

		int win =0,loss=0;

		for(int i=0;i<rounds;i++)
		{
			int random = r.nextInt(3);
			System.out.print("enter number : ");
			int n=s.nextInt();
			if(random==n)
			System.out.println("draw");

			else if(random==0&&n==1 || random==1&&n==2 || random==2&&n==0)
			{
			System.out.println("you won");
			++win;	
			}
			
			else
			{
			System.out.println("you lost");	
			++loss;
			}

		}

		if(loss==win)
		System.out.println("series draw");

		else if(win>loss)
		System.out.println("you won the seies");

		else
		System.out.println("you lost the series");
	}
} 


//import java.util.Scanner;
//public class practice_set {
//
//	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		System.out.print("enter website : ");
//		String website = s.next();
//		if(website.endsWith(".com"))
//			System.out.println("commercial website");
//		else if(website.endsWith(".org"))
//			System.out.println("organisation website");
//		else if(website.endsWith(".in"))
//			System.out.println("indian website");
//		else
//			System.out.println("other website");
//	}
//}


//matrimonial site

//import java.util.Scanner;
//public class practice_set {
//
//	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		System.out.println("enter your age : ");
//		int age = s.nextInt();
//		if(age>=18 && age<=30)
//			System.out.println("your match is found");
//		else if(age>30 && age<=45)
//			System.out.println("hard..!But you have still HOPE :)");
//		else if(age>45)
//			System.out.println("better luck for next life");
//		else
//			System.out.println("first grow and then come");
//
//	}
//
//}

//checking students results

//package unit4;
//import java.util.Scanner;
//public class practice_set {
//
//	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		System.out.println("enter your cgpa : ");
//		double cgpa = s.nextDouble();
//		if(cgpa>=8.0 && cgpa<=10.0)
//			System.out.println("topper");
//		else if(cgpa>=5.0 && cgpa<8.0)
//			System.out.println("average");
//		else if(cgpa>=4.0 && cgpa<5.0)
//			System.out.println("only pass");
//		else
//			System.out.println("fail");
//	}
//}


