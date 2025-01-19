public class NullPointerExcep{
    public static void main(String[] args) {
        String s = null;
        try{
            System.out.println(s.length());
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

    }   
}