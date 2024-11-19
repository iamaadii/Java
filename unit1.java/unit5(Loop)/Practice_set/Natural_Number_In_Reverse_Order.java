//write a program to print n natural numbers in reverse order

import java.util.Scanner;
public class Natural_Number_In_Reverse_Order{
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.print("enter n : ");
        int n = s.nextInt();

        System.out.println("natural number in reverse order : ");

        for(int i=n;i!=0;i--)
        System.out.println(i);
    }
}