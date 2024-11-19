abstract class Parent
{
    Parent()
    {
        System.out.println("Constructor of parent class");
    }

    void sayHello()
    {
        System.out.println("Hello");
    }

    abstract void greet();
    public abstract void greet1();
}

class Child1 extends Parent // Making a class with the help of abstract class also known as concrete class
{
    @Override
    void greet()
    {
        System.out.println("Good morning");
    }   

    @Override
    public void greet1()
    {
        System.out.println("Good afternoon");
    }

}

abstract class Child2 extends Parent // creating a abstract class with the help of another abstract class
{
    void th()
    {
        System.out.println("I am good");
    }
}

public class Abstract
{
    public static void main(String[] args)
    {
        //Parent p = new Parent(); // We can not create a object of abstract class but we can create refrence of it
        Child1 c1 = new Child1();
        c1.sayHello();
        c1.greet();
        c1.greet1();
        //Child2 c2 = new Child2(); // We can not create a object of abstract class
    }
}