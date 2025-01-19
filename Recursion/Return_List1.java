// Return all the index of the element which u are going to search if it is repeated again and again
// Use cannot pass list as an argument in the function

import java.util.*;
public class Return_List1
{
    public static ArrayList search(int a[],int i,int key)
    {
        ArrayList<Integer> list=new ArrayList<>();
        if(i==a.length)
            return list;
        if(a[i]==key)
            list.add(i);
        ArrayList<Integer> frombelow = search(a,i+1,key);
        list.addAll(frombelow);
        return list;
    }

    public static void main(String[] args) {
        int a[]={1,3,3};
        System.out.println(search(a,0,3));
    }
}