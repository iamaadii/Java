public class ArrayIndexOutOfBoundsExcep{
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;
        try {
            System.out.println("from try block");
            System.out.println(a[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("exception got handled");
                //System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
            }
    }
}