interface BasicAnimal
{
    void eat();
    void sleep();
}

class Monkey
{
    void jump()
    {
        System.out.println("jump");
    }
    void bite()
    {
        System.out.println("bite");
    }
}

class Human extends Monkey implements BasicAnimal
{
    public void eat()
    {
        System.out.println("eat");
    }
    public void sleep()
    {
        System.out.println("sleep");
    }
}


public class Q3
{
    public static void main(String[] args)
    {
        Monkey b = new Human();
        b.jump();
        b.bite();
    }
}