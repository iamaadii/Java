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
            System.out.print("null");
        }
    }

    public static void main(String[] args)
    {
        Doubly d = new Doubly();
        d.addFirst(10);
        d.addFirst(20);
        d.addLast(30);
        d.addLast(40);
        d.display();
    }
}