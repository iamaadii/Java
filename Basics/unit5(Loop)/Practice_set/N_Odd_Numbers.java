//write a program to print first n odd numbers where n is a user input

import java.util.Scanner;
public class N_Odd_Numbers{
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.print("enter n : ");
        int n = s.nextInt();

        System.out.println("first n odd numbers are : ");

        for(int i=0;i<n;i++)
        System.out.println(2*i+1);
    }
}