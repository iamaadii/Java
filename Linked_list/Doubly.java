class Node1
{
    int data;
    Node1 next;
    Node1 prev;

    Node1(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class Doubly
{
    Node1 head = null;

    void addFirst(int x)
    {
        Node1 newNode = new Node1(x);
        if(head==null)
        {
            head = newNode;
            return;
        }
        else
        {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    } 

    void addLast(int x)
    {
        Node1 newNode = new Node1(x);
        if(head==null)
        {
            head = newNode;
            return;
        }
        else
        {
            Node1 p = head;
            while(p.next!=null)
            {
                p = p.next;
            }
            p.next = newNode;
            newNode.prev = p;
        }
    }

    void deleteFirst()
    {
        if(head==null)
        {
            System.out.println("List is empty cannot delete");
            return;
        }
        else if(head.next==null)
        {
            head = null;
            return;
        }
        else
        {
            head = head.next;
            head.prev = null;
        }
    }

    void deleteLast()
    {
        if(head==null)
        {
            System.out.println("List is empty cannot delete");
            return;
        }
        else if(head.next==null)
        {
            head = null;
            return;
        }
        else
        {
            Node1 p = head.next;
            while(p.next!=null)
            {
                p = p.next;
            }
            p.prev.next=null;
        }
    }

    void reverse()
    {
        Node1 p = head;
        Node1 q = null;
        while(p!=null)
        {
            q = p;
            p = p.next;
        }
        while(q!=null)
        {
            System.out.print(q.data+"->");
            q = q.prev;
        }
        System.out.println("start");
    }


    void display()
    {
        Node1 p = head;
        if(p==null)
        {
            System.out.println("Cannot travese as it is empty");
            return;
        }
        else
        {
            while(p!=null)
            {
                System.out.print(p.data+"->");
                p = p.next;
            }
            System.out.print("end");
        }
    }

    public static void main(String[] args)
    {
        Doubly d = new Doubly();
        d.addFirst(10);
        d.addLast(20);
        d.addLast(30);
        d.addLast(40);
        // d.deleteFirst();
        //d.deleteLast();
        d.display();
        System.out.print("\n");
        d.reverse();
    }
}