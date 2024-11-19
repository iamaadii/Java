//sum of n numbers using while loop

import java.util.Scanner;
public class SumOf_N_Numbers{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter n : ");
        int n = s.nextInt();

        int i=0;
        int sum=0;
        while(i<=n)
        {
            int even = 2*i;
            sum = sum + even;
            i++;
        }
        System.out.println("sum of n numbers is : " + sum);
    }
}
