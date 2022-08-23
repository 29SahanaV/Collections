package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<String>();    //creating set of string elements
		hs.add("apple");                                //adding set of elements
		hs.add("grapes");
		hs.add("sapota");
		hs.add("mango");                                 
		hs.add("kiwi");
		hs.add("banana");
		hs.add("orange");
		hs.add("mango");
		
		ArrayList<String> a1=new ArrayList<String>(hs);
		Collections.sort(a1,Collections.reverseOrder());
		
		for(String i:a1)
			System.out.println(i);
		
	}

}
