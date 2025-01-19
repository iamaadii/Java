//Searching by taking care of both ascending and descending order that


public class Searching
{
    public static int binarySearch(int[] array, int target,int low,int high)
    {
        if(low>high)
            return -1;

        int mid = low+(high-low)/2;
        if(array[mid]==target)
            return mid;
        else if(array[mid]<target)
            return binarySearch(array,target,mid+1,high);
        else
            return binarySearch(array,target,low,mid-1);
    }

    public static int binarySearch1(int[] array, int target,int low,int high)
    {
        if(low>high)
            return -1;

        int mid = low+(high-low)/2;
        if(array[mid]==target)
            return mid;
        else if(array[mid]>target)
            return binarySearch1(array,target,mid+1,high);
        else
            return binarySearch1(array,target,low,mid-1);
    }

    public static void main(String args[])
    {
        int[] a = {1,2,3,4,5};
        int low = 0;
        int high= a.length-1;

        int key=5;

        if(a[low]<a[high])
        {
            int index=binarySearch(a,key,low,high);
            System.out.println("Index is "+index);
        }
        else
        {
            int index=binarySearch1(a,key,low,high);
            System.out.println("Index is "+index);
        }
    }



}