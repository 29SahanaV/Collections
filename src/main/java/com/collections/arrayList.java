package com.collections;
import java.util.*;
public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1=new ArrayList<String>();    //generics string data type
		a1.add("mango");                                  //adding sting elements
		a1.add("kiwi");
		a1.add("banana");
		a1.add("orange");
		a1.add("mango");
		
		ArrayList<String> a12=new ArrayList<String>();    ///second array list
		a12.add("apple");
		a12.add("grapes");
		a12.add("sapota");
		
		a1.addAll(a12);                         //concat(): adding the elements of both the arraylist
		
		System.out.println(a1.get(2));           //printing the specific array element 
		
		a1.set(4, "dragon");                    //updating or inserting 
		                                          //to change the 4 th element with dragon
		
		Collections.sort(a1,Collections.reverseOrder());                     //Ascending order->arranging the array elements in alphabetical 
		                                                          //reversing the order of array list
		a1.remove("kiwi");                 //removing the particular element from the list of array
		Iterator it=a1.iterator();         //iterating all the elements
		while(it.hasNext())
			System.out.println("hello"+it.next());
	}

}
