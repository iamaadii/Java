// Multi-level inheritance

class Parent
{
    Parent()
    {
        System.out.println("I am a parent class constructor");
    }

    Parent(int a)
    {
        System.out.println("Overloaded constructor of parent class with value of a as : " + a);
    }

}

class Child extends Parent
{
    Child()
    {
        //super(10); // for calling constructor of parent class
        System.out.println("I am a child class constructor");
    }

    Child(int a,int b)
    {
        super(a); 
        System.out.println("overloaded constructor of child class with value b as : " + b);
    }
}

class ChildOfChild extends Child
{
    ChildOfChild()
    {
        System.out.println("I am a child of child class constructor");
    }

    ChildOfChild(int a,int b,int c)
    {
        super(a,b); 
        System.out.println("overloaded constructor of child of child class with value c as : " + c);
    }
}


public class Constructor_In_Inheritance
{
    public static void main(String[] args)
    {
        //Child c = new Child(5,10);
        ChildOfChild cd = new ChildOfChild(5,10,15);
        
    }
}
