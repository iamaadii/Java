//for taking integer as a input
import java.util.Scanner;
public class takinginput {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter a : ");
		int a = s.nextInt();
		System.out.println("enter b : ");
		int b = s.nextInt();
		
		//addition
		System.out.println("sum : " +  (a+b));
		
		//substraction
		System.out.println("subs : " +  (a-b));
		
		//multiplication
		System.out.println("product : " +  a*b);
		
		//division
		if(b!=0)
		{
		float num1 = a;
		float num2 = b;
		System.out.println("div : " + num1/num2);
		}
		else
		System.out.println("cannot divide by zero");
		
		//module
		if(b!=0)
		System.out.println("remainder : " +  a%b);
		else
		System.out.println("cannot divide by zero");
	}
}

//for taking float as a input

//import java.util.Scanner;
//public class takinginput {
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("enter a : ");
//		float a = s.nextFloat();
//		System.out.println("enter b : ");
//		float b = s.nextFloat();
//		
//		System.out.println("sum : " +  (a+ b));
//	}
//}



//for taking string as a input

//import java.util.Scanner;
//public class takinginput {
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("enter string : ");
////		String a = s.next();
////		System.out.println(a);
//		
//		String a = s.nextLine(); //for taking whole line
//		System.out.println(a);		
//		
//	}
//}


//for checking user entered integer type of value

//import java.util.Scanner;
//public class takinginput {
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("enter a : ");
//		System.out.println(s.hasNextInt());
//	}
//}

