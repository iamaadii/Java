class Employeee
{
    private int id;
    private String name;

    public Employeee() 
    {
        id = 10;
        name = "John";
    }

    Employeee(String name,int id) 
    {
        this.id = id;
        this.name = name;
    }

    String getName()
    {
        return name;
    } 

    int getId()
    {
        return id;
    }

}

public class Constructor_Overloading
{
    public static void main(String[] args)
    {
        Employeee e1 =  new Employeee();
        System.out.println("Name : " + e1.getName());
        System.out.println("Id : " + e1.getId());
        
        Employeee e2 = new Employeee("Aditya",45);
        System.out.println("Name : " + e2.getName());
        System.out.println("Id : " + e2.getId());
    }
}