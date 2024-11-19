public class FunctionBar{

    public static void main(String[] args) {

        // Atleast one argument is required

        //System.out.println("sum : "+add());  // shows an error
        System.out.println("sum : "+add(2));
    }

    static int add(int a,int...arr)
    {
        int sum = a;
        for(int i : arr)
        {
            sum = sum + i;
        }
        return sum;
    }
}