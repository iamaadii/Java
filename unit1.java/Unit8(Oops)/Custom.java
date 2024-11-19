class Employee
{
    String name;
    int id;
    double salary;

    public void printDetails()
    {
        System.out.println("Emp name : " + name);
        System.out.println("Emp id : " + id);
    }

    double getsSalary()
    {
        return salary;
    }
}

public class Custom
{
    public static void main(String[] args)
    {
        System.out.println("This is our custom class");
        Employee emp = new Employee(); // Object creation or we can say instantiation of class Employee

        emp.name = "Aditya";
        emp.id = 245;
        emp.salary = 23400.0;
        System.out.println("Employee name :  " + emp.name );
        System.out.println("Employee id : " + emp.id );
        System.out.println("Employee salary : " + emp.salary );

        emp.printDetails();
        System.out.println("Emp salary : " + emp.getsSalary());
    }
}