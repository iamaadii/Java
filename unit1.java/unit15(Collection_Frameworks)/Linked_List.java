import java.util.LinkedList;
public class Linked_List
{
    public static void main(String[] args) {

        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();// We can not initialized it

        //Ways for adding
        l2.add(10); // by default it will add at last
        l2.add(20);
        l1.add(0,7); // for adding element at particular index
        l1.addFirst(8); // for adding element at first index
        l1.addLast(9); // for adding element at first index
        l1.addAll(l2); // by default it will add list 2 element at last
        l1.addAll(0,l2); // for adding l2 element from a particular index


        // Ways for removing
        l2.clear(); // for removing all elements from a particular list
        l1.remove(0); // for removing element at particular index
        l1.removeFirst(); // for removing element at first index
        l1.removeLast(); // for removing element at last index


        //for checking element present in list or not
        System.out.println(l1.contains(8)); // Returns true if given element is present otherwise fals

        //for getting index of particular element
        System.out.println(l1.indexOf(9)); // If given element is not present then it will return -1

        // for replacing index i value of list with another element
        l1.set(1,56);


        // Ways for printing
        for(int i=0;i<l1.size();i++)
            System.out.print(l1.get(i)+",");
        
        System.out.println("\n"+"List : "+ l1);

        System.out.println(l1.get(1)); // for printing element of given index
        System.out.println(l1.getFirst()); // for printing first element
        System.out.println(l1.getLast()); // for printing last element

    }
}