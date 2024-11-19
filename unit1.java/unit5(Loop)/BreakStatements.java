public class BreakStatements{
    public static void main(String agrs[] ){

        for(int i=0;i<5;i++)
        {
            System.out.println(i);
            if(i==3)
            {
                System.out.println("loop ends here");
                break;
            }
        }
        System.out.println("program flow transfer here");
    }
}


// public class BreakStatements{
//     public static void main(String agrs[] ){

//         int i=0;
//         while(i<5)
//         {
//             System.out.println(i);
//             if(i==3)
//             {
//                 System.out.println("loop ends here");
//                 break; 
//             }
//             i++;
//         }
//         System.out.println("program flow transfer here");
//     }
// }


// public class BreakStatements{
//     public static void main(String agrs[] ){

//         int i=0;
//         do
//         {
//             System.out.println(i);
//             if(i==3)
//             {
//                 System.out.println("loop ends here");
//                 break; 
//             }
//             i++;
//         }while(i<5);
//         System.out.println("program flow transfer here");
//     }
// }




