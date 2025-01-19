import java.util.ArrayList;
public class Array_List{
    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(2);// for fixing size

        //Ways for adding
        l2.add(10);
        l2.add(20);
        l1.add(0,7); // for adding element at particular index
        l1.addAll(l2); // by default it will add list 2 element at last
        l1.addAll(0,l2); // for adding l2 element from a particular index


        // Ways for removing
        l2.clear(); // for removing all elements from a particular list
        l1.remove(0); // for removing element at particular index

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

    }
}

// Arraylist in java doesnot supports addFirst(),addLast(),removeFirst(),removeLast(),getFirst(),getlast()