import java.util.*;

public class Lcm_And_Hcf {
  
  public static int gcd(int a,int b)
  {
    
    int r;
    if(a==0)
      return b;
    else if(b==0)
      return a;
    else
    {
      r=a%b;
      return gcd(b,r);
    }
    
  }
  
  public static void main(String[] args) 
  {
    int a=18;
    int b=4;
      
    int res=gcd(a,b);
    System.out.println("gcd/HCF : "+res);
    
    int f=a/res;
    int g = b/res;
    
    int lcm = f*g*res;
    
    System.out.println("LCM : "+lcm);
    
    
  }
  
}