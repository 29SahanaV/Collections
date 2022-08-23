package com.collections;
import java.util.TreeSet;
public class treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts=new TreeSet<String>();    //creating  Treeset of string elementswhich is in Ascending order and unique
		ts.add("CSK");                                //adding set of elements
		ts.add("RCB");
		ts.add("MI");
		ts.add("KKR");                                 
		ts.add("KEP");
		ts.add("RR");
		ts.add("CSK");
		
		//for(String i:ts)                 //to print the TreeSet
		// System.out.println(i);
		
		System.out.println("HashSet"+ts.headSet("N"));  //headset:returns less than specified element
		System.out.println("TailSet"+ts.tailSet("N"));  //tailset:returns greater than specified element
		System.out.println("SubSet"+ts.subSet("D","z"));  //subset:returns between two specific elements
	}
}
