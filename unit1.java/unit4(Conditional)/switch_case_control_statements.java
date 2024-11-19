//import java.util.Scanner;
//public class switch_case_control_statements {
//
//	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		System.out.println("enter day : ");
//		int day = s.nextInt();
//		switch(day)
//		{
//		case 1 :
//			 System.out.println("sunday");
//			 break;
//		case 2 :
//		     System.out.println("monday");
//		     break;
//		case 3 :
//		     System.out.println("tuesday");
//		     break;
//		case 4 :
//		    System.out.println("wednesday");
//		    break; 
//		case 5 :
//		    System.out.println("thursday");
//		    break;  
//		case 6 :
//		    System.out.println("friday");
//		    break;		    
//		case 7 :
//		    System.out.println("saturday");
//		    break;
//		default : 
//			System.out.println("not a valid day");
//			    
//		}
//		
//	}
//
//}


//import java.util.Scanner;
//public class switch_case_control_statements {
//
//	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		System.out.println("enter any character : ");
//		char a = s.next().charAt(0);
//		switch(a)
//		{
//		case 's' :
//			 System.out.println("sunday");
//			 break;
//		case 'm' :
//		     System.out.println("monday");
//		     break;
//		case 't' :
//		     System.out.println("tuesday");
//		     break;
//		case 'w' :
//		    System.out.println("wednesday");
//		    break; 
//		default : 
//			System.out.println("not a valid day");
//			    
//		}
//		
//	}
//
//}

import java.util.Scanner;
public class switch_case_control_statements {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter day name : ");
		String a = s.next();
		switch(a)
		{
		case "sunday" :
			 System.out.println("day 1");
			 break;
		case "monday" :
		     System.out.println("day 2");
		     break;
		case "tuesday" :
		     System.out.println("day 3");
		     break;
		case "wednesday" :
		    System.out.println("day 4");
		    break; 
		case "thursday" :
		    System.out.println("day 5");
		    break;  
		case "friday" :
		    System.out.println("day 6");
		    break;		    
		case "saturday" :
		    System.out.println("day 7");
		    break;
		default : 
			System.out.println("not a valid day");
			    
		}
		
	}

}

