public class Linear_Search
{

    public static boolean search(int a[],int key,int i)
    {
        if(i==a.length)
            return false;
        else if(a[i]==key)
            return true;
        else
            return search(a,key,i+1);
    }

    public static void main(String[] args)
    {
        int a[]={12,75,39,75};
        System.out.println(search(a,79,0));
    }
}