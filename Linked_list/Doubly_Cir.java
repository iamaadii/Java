class Node3
{
    int data;
    Node3 next;
    Node3 prev;

    Node3(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class Doubly_Cir
{
    Node3 head = null;
    Node3 tail = null;

    void insertFirst(int x)
    {
        Node3 newNode = new Node3(x);
        if(head==null)
        {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }
        else
        {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        }
    }

    void insertLast(int x)
    {
        Node3 newNode = new Node3(x);
        if(head==null)
        {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }
        else
        {
            newNode.prev = tail;
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
            head.prev = tail;
        }
    }

    void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("Cannot delete as it is empty");
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
            head.prev = null;
            tail.next = head;
        }
    }

    void deleteLast()
    {
        if(head==null)
        {
            System.out.println("Cannot delete as it is empty");
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
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
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
            Node3 temp = head;
            do
            {
                System.out.print(temp.data+"->");
                temp = temp.next;
            } while(temp!=head);
            System.out.print("head");
        }
    }

    public static void main(String[] args)
    {
        Doubly_Cir dc = new Doubly_Cir();
        dc.insertFirst(20);
        dc.insertFirst(10);
        dc.insertLast(30);
        dc.insertLast(40);
        dc.insertLast(50);
        //dc.deleteFirst();
        dc.deleteLast();
        dc.display();
    }
}