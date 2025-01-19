import java.lang.Math;
public class bin_octa_to_dec
{

    public static double bin_to_dec(String s)
    {
        double dec = 0;
        int len = s.length()-1;
        for(int i=len;i>=0;i--)
        {
            dec = dec+ (Math.pow(2,(len-i)))*(s.charAt(i)-'0');
        }
        return dec;
    }

    public static double oct_to_dec(String s)
    {
        double dec = 0;
        int len = s.length()-1;
        for(int i=len;i>=0;i--)
        {
            dec = dec+ (Math.pow(8,(len-i)))*(s.charAt(i)-'0');
        }
        return dec;
    }


    public static void main(String[] args) 
    {
        String bin = "1010";
        System.out.println("Binary to Decimal: " + bin_to_dec(bin));

        String oct = "21";
        System.out.println("Octal to Decimal: " + oct_to_dec(oct));
    }

}