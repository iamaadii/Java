// Create a class game , which alllows user to to play "Guess the number once"

import java.util.Scanner;
import java.util.Random;

public class Game
{
    int number;
    int count = 0;

    Game()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number for setting a range for generating random number : ");
        int b = s.nextInt();

        Random r = new Random();
        number = r.nextInt(b);
    }

    public int userInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int a = sc.nextInt();
        return a;
    }

    void isCorrectNumber()
    {
        int a = userInput();
        if(a == number)
        {
            count++;
            System.out.println("You won after " + count + " attempts ");

        }
        else
        {
            System.out.println("You lost");
            if(a>number)
            {
                System.out.println("Your guess is higher than the number");
            }
            else
            {
                System.out.println("Your guess is lower than the number");
            }
            count++;
            isCorrectNumber();
        }

    }

    public static void main(String[] args)
    {
        Game g = new Game();
        g.isCorrectNumber();
    }
} 