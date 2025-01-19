//write a program to calculate percentage of a given student in cbse board exam.his marks from 5 subjects must be taken as a input from keyboard

//import java.util.Scanner;
//public class practiceset {
//
//	public static void main(String[] args) {
//		System.out.println("enter student 1");
//		Scanner  s = new Scanner(System.in);
//		System.out.println("enter physics marks : ");
//		int a = s.nextInt();
//		System.out.println("enter chemistry marks : ");
//		int b = s.nextInt();
//		System.out.println("enter maths marks : ");
//		int c = s.nextInt();
//		System.out.println("enter english marks : ");
//		int d = s.nextInt();
//		System.out.println("enter hindi marks : ");
//		int e = s.nextInt();
//		
//		float total = (a+b+c+d+e);
//		System.out.println("percentage = " + total/5)		
//	}
//}

//write a program to calculate cgpa using marks of three subjects out of 100

//import java.util.Scanner;
//public class practiceset {
//
//	public static void main(String[] args) {
//		System.out.println("enter student 1");
//		Scanner  s = new Scanner(System.in);
//		System.out.println("enter physics marks : ");
//		int a = s.nextInt();
//		System.out.println("enter chemistry marks : ");
//		int b = s.nextInt();
//		System.out.println("enter maths marks : ");
//		int c = s.nextInt();
//		
//		float total = (a+b+c);
//		System.out.println("cgpa = " + total/30);		
//	}
//}

//WAP which asks user name  and print like this "hello name have a good day"

//import java.util.Scanner;
//public class practiceset {
//
//	public static void main(String[] args) {
//		Scanner  s = new Scanner(System.in);
//		System.out.println("enter name : ");
//		String a = s.nextLine();
//		System.out.println("Hello " + a + " have a good day");		
//	}
//}

//WAP to convert kilometers into miles

import java.util.Scanner;
public class practiceset {

	public static void main(String[] args) {
		Scanner  s = new Scanner(System.in);
		System.out.println("enter km : ");
		float a = s.nextFloat();
		float m = a / 1.609f;
		System.out.println("miles : "+m);		
	}
}

