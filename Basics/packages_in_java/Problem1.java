package calculator;

class Calculator
{
    void calculate(int a,int b)
    {
        System.out.println("Result : " + (a+b));
    }
}

class ScCalculator
{
    void calculate(int a,int b)
    {
        System.out.println("Result : " + Math.sin(a+b));
    }
}

class HyCalculator
{
    void calculate(int a,int b)
    {
        System.out.println("Result : " + (a+b));
        System.out.println("Result : " + Math.sin(a+b));
    }
}

public class Problem1
{
    public static void main(String[] args)
    {
        Calculator a = new Calculator();
        a.calculate(5, 10);

        ScCalculator b = new ScCalculator();
        b.calculate(7, 5);

        HyCalculator c = new HyCalculator();
        c.calculate(5, 5);

    }
}