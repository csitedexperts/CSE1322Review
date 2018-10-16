package builtin_Arraylist;
import java.util.*;

public class UsingBuiltinArrayList {
     public static void main(String args[]) {

       /* Linked List Declaration */
       ArrayList<String> al = new ArrayList<String>();

       /*add(String Element) is used for adding 
        * the elements to the linked list*/
       al.add("Item1");
       al.add("Item5");
       al.add("Item3");
       al.add("Item6");
       al.add("Item2");

       /*Display Array List Content*/
       System.out.println("ArrayList Content: " +al);

       /*Add First and Last Element*/
       al.add("First Item");
       al.add("Last Item");
       System.out.println("ArrayList Content after addition: " +al);

       /*This is how to get and set Values*/
       Object firstvar = al.get(0);
       System.out.println("First element: " +firstvar);
       al.set(0, "Changed first item");
       Object firstvar2 = al.get(0);
       System.out.println("First element after update by set method: " +firstvar2);

       /*Remove first and last element*/
       al.remove(0);
        System.out.println("ArrayList after deletion of first and last element: " +al);

       /* Add to a Position and remove from a position*/
       al.add(0, "Newly added item");
       al.remove(2);
       System.out.println("Final Content: " +al); 
     }
}