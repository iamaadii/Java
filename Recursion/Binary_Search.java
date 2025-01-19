public class Binary_Search
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

    public static void main(String args[])
    {
        int[] a = {1, 2, 3, 4, 5};
        int index=binarySearch(a,5,0,4);
        System.out.println("Index is "+index);
    }

}
