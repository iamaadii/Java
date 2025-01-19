//same class having multiple object

public class Class{
    
    // class student{
    //     String name;
    //     int rollno;
    //     int age;
    // }

    public static void main(String[] args){

        student s1 = new student(); //object creation
        s1.name = "aditya";
        s1.rollno = 23;
        s1.age = 18;
        System.out.println(s1.name);
        System.out.println(s1.rollno);
        System.out.println(s1.age);

        student s2 = new student(); //object creation
        s2.name = "ajay";
        s2.rollno = 25;
        s2.age = 18;
        System.out.println(s2.name);
        System.out.println(s2.rollno);
        System.out.println(s2.age);
    }

     class student{
        String name;
        int rollno;
        int age;
    }
}