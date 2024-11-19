package unit12;
import java.util.*; // it will fetched all the classes present inside util package
import java.util.Scanner; // import Scanner class from util package
public class A
{
    public static void main(String[] args) 
    {
        //Scanner s = new Scanner(System.in);
        java.util.Scanner s = new java.util.Scanner(System.in); // use without importing
        System.out.println("Enter n : ");
        int n = s.nextInt();
        System.out.println(n);
        
    }
}