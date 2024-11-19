//without return type

// public class Methods{
//     public static void main(String[] args) {
//         add(10,20);
//     }

//     public static void add(int x, int y){
//         System.out.println("Sum of two numbers is: "+(x+y));
//     }
// }

//with return type

public class Methods{
    public static void main(String[] args) {
        int total = add(10,20);  //arguments are actual values
        System.out.println("Sum of two numbers is: "+ total);
    }

    public static int add(int x, int y){ //parameters are copied values
        return x+y;
    }
}

