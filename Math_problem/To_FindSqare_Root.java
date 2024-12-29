import java.util.*;

public class To_FindSqare_Root {
    public static void main(String[] args) {
     
    int num=40;
    int after_dec=3;
    int mid;
    
    double res=0.0;
    
    int start=0;
    int end=num;
    
    while(start<=end)
    {
      mid=start+(end-start)/2;
      
      if(mid*mid==num)
        res=res+mid;
      else if(mid*mid>num)
        end=mid-1;
      else
        start=mid+1;
    }
    
    double inr = 0.1;
    
    for(int i=0;i<after_dec;i++)
    {
      while(res*res<=num)
      {
        res=res+inr;
      }
      
      res=res-inr;
      inr=inr/10;
    }
    
    System.out.printf("%.3f",res);
    
  }
}