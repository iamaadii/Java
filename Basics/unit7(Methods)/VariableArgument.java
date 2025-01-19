public class VariableArgument {
    
    public static void main(String[] args) {
        System.out.println("sum : " + add());
        System.out.println("sum : " + add(1));
        System.out.println("sum : " + add(1, 2));
        System.out.println("sum : " + add(1, 2, 3));
    }
    
    public static int add(int... arr) {
        // Available as int[] arr;
        
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
