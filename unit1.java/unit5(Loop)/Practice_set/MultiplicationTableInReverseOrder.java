//wap to print multiplication table of 10 in reverse order

public class MultiplicationTableInReverseOrder{
    public static void main(String[] args) {

        int n=10;

        for(int i=10;i>=1;i--)
        {
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}