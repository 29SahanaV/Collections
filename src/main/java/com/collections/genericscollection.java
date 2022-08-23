package com.collections;
import java.util.*;
public class genericscollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li=new ArrayList<Integer>();    //GENERICS based on the data types
		li.add(5);
		li.add(4);
		li.add(8);
		li.add(12000);
		int c=Integer.parseInt(li.get(2).toString());   //get method to print the specific element
		System.out.println(c);
	}

}
