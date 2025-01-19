public class ChangingIntegerInMethodName{
    public static void main(String[] args) {
        int x = 10;
        change(x);
        System.out.println("Value of x : " + x);
    }

    public static void change(int a)
    {
        a=98;
    }
}