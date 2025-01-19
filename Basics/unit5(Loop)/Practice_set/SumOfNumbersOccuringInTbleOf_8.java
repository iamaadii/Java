//wap to calculate the sum of numbers occuring in table of 8 

public class SumOfNumbersOccuringInTbleOf_8{
    public static void main(String[] args) {

        int n = 8;
        int sum = 0;
        for(int i=1;i<=10;i++)
        {
           int num = n*i;
           sum = sum + num;
        }
        System.out.println("sum : "+sum);
    }
}