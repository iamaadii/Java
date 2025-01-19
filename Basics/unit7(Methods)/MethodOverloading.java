//two or methods can have same name but different parameters such methods known as method overloading

public class MethodOverloading{
    public static void main(String[] args) {
        add(3,4);
        add(3,4,5);
    }

    public static void add(int a , int b){
        System.out.println("Sum of two numbers is : "+(a+b));
    }

    public static void add(int a , int b,int c){
        System.out.println("Sum of three numbers is : "+(a+b+c));
    }
}