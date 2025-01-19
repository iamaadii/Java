// Return all the index of the element which u are going to search if it is repeated again and again
// Use can pass list as an argument in the function

import java.util.*;
public class Return_List
{
    public static ArrayList search(int a[],int i,int key,ArrayList<Integer> list)
    {
        if(i==a.length)
            return list;
        if(a[i]==key)
            list.add(i);
        return search(a,i+1,key,list);
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,2,3,4};
        ArrayList<Integer> l1 = new ArrayList<>();
        System.out.println(search(a,0,3,l1));
    }
}