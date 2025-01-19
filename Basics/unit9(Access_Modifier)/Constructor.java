class MyEmployee
{
    private int id;
    private String name;

    // public MyEmployee() // for taking no argument
    // {
    //     id = 10;
    //     name = "John";
    // }

    MyEmployee(String name,int id) // for taking some argument;
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

public class Constructor
{
    public static void main(String[] args)
    {
        // Without passing any argument in constructor
        // MyEmployee e =  new MyEmployee();
        // System.out.println("Name : " + e.getName());
        // System.out.println("Id : " + e.getId());


        // BY passing argument in constructor
        MyEmployee e =  new MyEmployee("Aditya",19);
        System.out.println("Name : " + e.getName());
        System.out.println("Id : " + e.getId());

    }
}