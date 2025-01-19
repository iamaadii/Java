// public class ContinueStatements{
//     public static void main(String agrs[] ){

//         int i;
//         for(i=0;i<5;i++)
//         {
//             if(i==3)
//             {
//                 System.out.println("ending the loop");
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }


// public class ContinueStatements{
//     public static void main(String agrs[] ){

//         int i = 0;
//         while(i<5)
//         {
//             System.out.println(i);
//             if(i==3)
//             {
//                 System.out.println("ending loop here");
//                 break; 
//             }
//             i++;
//         }
//     }
// }


public class ContinueStatements{
    public static void main(String agrs[] ){

        int i=0;
        do
        {
            System.out.println(i);
            if(i==3)
            {
                System.out.println("ending loop here");
                break; 
            }
            i++;
        }while(i<5);
    }
}




