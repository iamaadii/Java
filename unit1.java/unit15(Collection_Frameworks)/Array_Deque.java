// It is bit like a queues with a one difference that is in Deque we can do both insertion and deletion from both the ends.
// It is also known as a Double Ended Queue.

import java.util.ArrayDeque;
public class Array_Deque
{
    public static void main(String[] args) {

        ArrayDeque<Integer> l1 = new ArrayDeque<>(); // Initial capacity to store 16 elements.. we can also initialsed it

        //Ways for adding
        l1.add(10);
        l1.add(20);
        l1.addFirst(8); // for adding element at first index
        l1.addLast(9); // for adding element at first index


        // Ways for removing
        l1.removeFirst(); // for removing element at first index
        l1.removeLast(); // for removing element at last index


        //for checking element present in list or not
        System.out.println(l1.contains(8)); // Returns true if given element is present otherwise fals


        //Ways for printing
        System.out.println("\n"+"List : "+ l1);
        
        System.out.println(l1.getFirst()); // for printing first element
        System.out.println(l1.getLast()); // for printing last element

    }
}



/* we can also use these function in place of:

Throws exception in some cases                   Not throw any exception
addFirst()                      =                    offerFirst()
addLast()                       =                    offerLast()
removeFirst()                   =                    pollFirst()
removeLast()                    =                    pollLast()
getFirst()                      =                    peekFirst()
getLast()                       =                    peekLast()

*/