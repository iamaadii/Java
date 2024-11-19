import java.util.HashSet;
public class Hash_Set
{
    public static void main(String[] args) 
    {
        HashSet<Integer> hs = new HashSet<>(); // By default its size is to store 16 elements ... we can change it as per requirement 
        hs.add(6);
        hs.add(8);
        hs.add(3);
        hs.add(11);
        hs.add(11);
        System.out.println(hs);
    }
}