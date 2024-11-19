import java.util.*;
public class Nested_Try_Catch_Block
{
    public static void main(String[] args)
    {
        int a[] = {12,34,56,67};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter index ");
        int index = s.nextInt();
        try{
            System.out.println("Welcome");
            try{
                System.out.println(a[index]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array Index Out of Bounds");
                System.out.println("Exception in level 2");
            }
        }catch(Exception e){
            System.out.println("Exception in level 1");
        }
    }
}