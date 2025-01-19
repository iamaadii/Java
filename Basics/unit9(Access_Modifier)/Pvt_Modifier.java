class Employee
{
    private String name;
    private int id;

    void setName(String n)
    {
        name = n;
    }

    String getName()
    {
        return name;
    }

    void setId(int i)
    {
        id =i;
    }

    int getId()
    {
        return id;
    }

}

public class Pvt_Modifier
{
    public static void main(String[] args)
    {
        Employee emp = new Employee(); // Object creation or we can say instantiation of class Employee

        // emp.name = "Aditya";
        // emp.id = 245; --> both lines gives an error due to private access modifier

        emp.setName("Aditya");
        emp.setId(29);
        System.out.println("Employee name :  " + emp.getName() );
        System.out.println("Employee id : " + emp.getId() );
    }
}