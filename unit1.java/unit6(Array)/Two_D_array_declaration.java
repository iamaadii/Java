public class Two_D_array_declaration{
    public static void main(String[] args) {

        int a[][] = new int[2][2]; // declarartion + memory allocation
        a[0][0] = 23;
        a[0][1] = 45;
        a[1][0] = 67;
        a[1][1] = 89;

        System.out.println(a[0][1]);
        System.out.println("size : " + a.length);

        for(int i=0;i<2;i++)
        {
            for(int j = 0;j<2;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

}