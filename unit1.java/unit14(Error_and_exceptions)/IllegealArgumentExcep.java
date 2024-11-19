public class IllegealArgumentExcep
{
    void add(int a,int b)
    {
        System.out.println("Sum : " + (a+b));
    }
    public static void main(String[] args)
    {
        try{
            IllegealArgumentExcep obj = new IllegealArgumentExcep();
            obj.add("ccb",20);
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}