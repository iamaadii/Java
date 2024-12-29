class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

public class Singly
{
    Node head = null;
    static int size = 0;

    void addFirst(int x)
    {
        Node newNode = new Node(x);
        if(head==null)
        {
            head = newNode;
            return;
        }
        else
        {
            newNode.next = head;
            head = newNode;
        }
    }

    void addLast(int x)
    {
        Node newNode = new Node(x);
        if(head==null)
        {
            head = newNode;
            return;
        }
        else
        {
            Node p = head;
            while(p.next!=null)
            {
                p = p.next;
            }
            p.next = newNode;
        }
    }

    void insertAtIndex(int x,int index)
    {
        if(index==0)
        {
            addFirst(x);
            return;
        }
        else
        {
            Node newNode = new Node(x);
            Node p = head;
            for(int i=1;i<index;i++)
            {
                p = p.next;
            }
            newNode.next = p.next;
            p.next = newNode;
        }
    }
    
    void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("Cannot delete list is empty");
            return;
        }
        else
        {
            Node p = head;
            head = head.next;
            p = null;
        }
    }

    void deleteLast()
    {
        if(head==null)
        {
            System.out.println("Cannot delete list is empty");
            return; 
        }
        else if(head.next==null)
        {
            head = null;
            return;
        }
        else
        {
            Node p = head;
            while(p.next.next != null)
            {
                p = p.next;
            }
            p.next = null;
        }
    }

    void deleteAtIndex(int index)
    {
        if(index==0)
        {
            deleteFirst();
            return;
        }
        else
        {
            Node p = head;
            Node q = head.next;
            for(int i=1;i<index;i++)
            {
                p = p.next;
                q = q.next;
            }
            p.next = q.next;
            q = null;
        }
    }

    void search(int val)
    {
        Node p = head;
        while(p!=null)
        {
            if(p.data == val)
            {
                System.out.println("Element found");
                return;
            }
            p = p.next;
        }
        System.out.println("Element not found");
    }

    void reverse()
    {
        Node prev = null;
        Node current = head;
        Node next = null;
        while(current != null)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        } 
        head = prev;
        print();
    }

    void print()
    {
        Node p = head;
        if(p==null)
        {
            System.out.println("Cannot traverse list is empty");
            return;
        }
        else
        {
            while(p!=null)
            {
                System.out.print(p.data+"->");
                size++;
                p = p.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) 
    {
        Singly s = new Singly();
        // s.addFirst(20);
        // s.addFirst(10);
        s.addLast(10);
        s.addLast(20);
        s.addLast(30);
        // s.deleteFirst();
        //s.deleteLast();
        //s.insertAtIndex(40,3);
        //s.deleteAtIndex(2);
        // s.search(10);
        // System.out.println("size : " + size);
        //s.reverse();
        s.print();
    }
}