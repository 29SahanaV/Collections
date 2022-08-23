package com.collections;
import java.util.Collections;
import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l1=new LinkedList<String>();    //creating linked list of string elements
		l1.add("apple");
		l1.add("grapes");
		l1.add("sapota");
		l1.add("mango");                                 
		l1.add("kiwi");
		l1.add("banana");
		l1.add("orange");
		l1.add("mango");
		
		l1.removeLastOccurrence("mango");                //removing last occuring element in the linked list
		l1.removeFirstOccurrence("apple");               //removing first occuring element in the linked list
		
		System.out.println(l1.contains("grapes"));       //searching for the element in the list
		
		l1.removeLast();                               //removing the last element of the list
		
		l1.removeFirst();                             //removing the first element of the list
		
		Collections.sort(l1,Collections.reverseOrder());                           //sorting the elements in Ascending order in alphabetic order
		                                                                         //reversing  Ascending order list of array
		for(String i:l1)
			System.out.println(i);
			
	}

}
