//static keyword is used to call the method without making object 

public class StaticKeyword{
    
    public static void main(String[] args){
        getjokes();
        StaticKeyword.getjokes();
        StaticKeyword a = new StaticKeyword();
        a.getjokes();
    }

    public static void getjokes()
    {
        System.out.println("any joke");
    }
}