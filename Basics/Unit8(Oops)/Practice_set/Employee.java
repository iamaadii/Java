public class Employee
{
    String name;
    int salary;

    public static void main(String[] args)
    {
        Employee e = new Employee();
        e.name = "Aditya";
        e.salary = 22000;
        System.out.println("Emp name : " + e.getName());
        System.out.println("Emp salary : " + e.getSalary());
        e.setName("john");
        System.out.println("Emp name : " + e.getName());
    }

    int getSalary()
    {
        return salary;
    }

    String getName()
    {
        return name;
    }

    void setName(String n)
    {
        name = n;
    }
}