public class ChangingArrayInMethodName{
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        change(a);
        System.out.println(a[0]);
    }

    public static void change(int arr[])
    {
        arr[0] = 47;
    }
}