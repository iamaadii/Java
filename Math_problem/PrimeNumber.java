/* To check whether number is prime or not */

import java.util.*;
public class PrimeNumber {

    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("enter n : ");
       
        int n=a.nextInt();
      

        // way1
        //   int i;
        //   for(i=2;i<=n-1;i++)
        //   {
        //     if(n%i==0)
        //       break;
        //       // i++;
        //   }
        //   if(i==n)
        //     System.out.println("prime");
        //   else
        //     System.out.println("not prime");
        


        //way2
        int i=2;
        while(i*i<=n)
        {
            if(n%i==0)
            {
                System.out.println("not prime");
                break;
            }
            i++;
        }
        if(i*i>n)
            System.out.println("prime");
   
  }
}

