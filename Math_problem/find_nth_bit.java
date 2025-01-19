public class find_nth_bit
{
    public static int getBit(int n,int pos)
    {
        int mask = 1 << pos;
        if((n&mask)==0)
            return 0;
        else
            return 1;
    } 

    public static int setBit(int n,int pos)
    {
        int mask = 1 << pos;
        int new_number = n|mask;
        return new_number;
    } 

    public static int resetBit(int n,int pos)
    {
        int mask = ~(1 << pos);
        int new_number = n&mask;
        return new_number;
    }

    public static void main(String[] args) 
    {
        System.out.println(getBit(10,3));
        System.out.println(setBit(10,2));
        System.out.println(resetBit(10,2));
    }
}