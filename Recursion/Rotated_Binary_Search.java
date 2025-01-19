public class Rotated_Binary_Search
{
    public static int search(int[] nums, int target) 
    {
        int low=0;
        int high = nums.length-1;
        return Result(nums,low,high,target);
    }
    
    public static int Result(int a[],int l,int h,int key)
    {
        if(l>h)
            return -1;
        
        int mid = l+(h-l)/2;
        
        if(key==a[mid])
            return mid;
        
        if(a[l]<=a[mid])
        {
            if(key>=a[l] && key<=a[mid])
                return Result(a,l,mid-1,key);
            else
                return Result(a,mid+1,h,key);
        }
        else if(key>=a[mid] && key<=a[h])
        {
            return Result(a,mid+1,h,key);
        }
        else
            return Result(a,l,mid-1,key);
    }

    public static void main(String[] args)
    {
        int a[] = {4,5,6,7,0,1,2};
        System.out.println(search(a,6));
    }
    
}