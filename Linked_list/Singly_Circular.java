class Node2
{
    int data;
    Node2 next;

    Node2(int data)
    {
        this.data = data;
        this.next = null;
    }
}

public class Singly_Circular
{
    Node2 head = null;
    Node2 tail = null;

    void insertFirst(int x)
    {
        Node2 newNode = new Node2(x);
        if(head==null)
        {
            head = newNode;
            tail = newNode;
            tail.next=head;
        }
        else
        {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }

    void insertLast(int x)
    {
        Node2 newNode = new Node2(x);
        if(head==null)
        {
            head = newNode;
            tail = newNode;
            tail.next = head;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("List is empty cannot delete");
            return;
        }
        else if(head==tail)
        {
            head = null;
            tail = null;
            return;
        }
        else
        {
            head = head.next;
            tail.next = head;
        }
    }

    void deleteLast()
    {
        if(head==null)
        {
            System.out.println("List is empty cannot delete");
            return;
        }
        else if(head==tail)
        {
            head = null;
            tail = null;
            return;
        }
        else
        {
            Node2 p = head.next;
            while(p.next!=tail)
            {
                p = p.next;
            }
            p.next = head;
            tail = p;
        }
    }
    
    void display()
    {
        if(head==null)
        {
            System.out.println("cannot traverse it is empty");
            return;
        }
        else
        {
            Node2 p= head;
            do
            {
                System.out.print(p.data+"->");
                p = p.next;
            }while(p!=head);
            System.out.println("head");
        }
    }

    public static void main(String[] args)
    {
        Singly_Circular sc = new Singly_Circular();
        sc.insertFirst(30);
        sc.insertLast(20);
        sc.insertLast(10);
        // sc.deleteFirst();
        sc.deleteLast();
        sc.display();
    }
}