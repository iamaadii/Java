public class To_Check_Array_Sorted_Or_Not
{
    public static boolean sorted(int a[],int i)
    {
        if(i==a.length-1)
            return true;
        else if(a[i]<a[i+1])
            return sorted(a,i+1);
        else
            return false;
    }
    
	public static void main(String[] args) {
		
		int a[] = {1,8,9,14};
		boolean b = sorted(a,0);
		if(b==true)
		    System.out.print("sorted");
		else
		    System.out.print("unsorted");
		
	}
}