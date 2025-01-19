// Implement a library using a java class Library

import java.util.Scanner;
public class Library
{
    String[] book = new String[100]; 
    int no_of_books = 0;
    //Scanner sc = new Scanner(System.in);
    
    void addBook(String bookname)
    {
        book[no_of_books] = bookname;
        no_of_books++;
        System.out.println("Book added");
    }

    void issueBook(String bookname)
    {
        for(int i=0;i<book.length;i++)
        {
            if(book[i].equals(bookname))
            {
                System.out.println("Book issued");
                book[i] = null;
                return;
            }
        }
        System.out.println("Book not available");
        
    }

    void returnBook(String bookname)
    {
        addBook(bookname);
    }

    void availableBook()
    {
        System.out.println("Available books : ");
        for(String b : book)
        {
            if(b!=null)
            {
                System.out.println(b);
            }
        }
    }

    public static void main(String[] args)
    {
        Library lib = new Library();
        lib.addBook("C");
        lib.addBook("C++");
        lib.addBook("Java");
        lib.addBook("Python");
        lib.availableBook();
        lib.issueBook("C++");
        lib.availableBook();
        lib.returnBook("C++");
        lib.availableBook();

    }
}