//if

//public class conditional_statements {
//
//	public static void main(String[] args) {
//    System.out.println("in main function");
//	 if(true)
//		 System.out.println("if block will be executed");
//   }
//}

//if-else

//public class conditional_statements {
//
//	public static void main(String[] args) {
//	 System.out.println("in main function");
//	 if(true)
//		 System.out.println("if block will be executed");
//	 else
//		 System.out.println("else block will be executed");
	 
//	 if(false)
//		 System.out.println("if block will be executed");
//	 else
//		 System.out.println("else block will be executed"); 
//	}
//}

//else-if ladder

import java.util.Scanner;
public class conditional_statements {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.printf("enter any number : ");
		int a = s.nextInt();
		if(a>0)
	        System.out.printf("it is a postitive number");
		else if(a<0)
			System.out.printf("it is a negative number");
		else
			System.out.printf("it is zero");
	}
}




