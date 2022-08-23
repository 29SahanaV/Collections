package com.collections;
import java.util.*;

public class collectionpack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List li=new ArrayList();
		li.add(5);                  //adding the elements of any datatype in arraylist
		li.add(6);                   //int,string,boolean...etc...
		li.add("sahana");
		li.add(true);
		//Iterator it=li.iterator();   //printing all the elements
	//	while(it.hasNext())    
		//	System.out.println(it.next());
		
	//	System.out.println(li.get(2));    //get method to print specific element
		
		int c=Integer.parseInt(li.get(1).toString());   //to convert 0 th & 1st element into Interger
		System.out.println(c);                    //string can be converted by GENERICS into integer
	}

}
