package com.collections;
import java.util.ArrayList;

public class userDefined {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book b1=new book(50,"hard first java",1234);    //book b1 and b2 are two objects with some values
		book b2=new book(30,"anguluar first java",1235);
		
		ArrayList<book> a1=new ArrayList<book>();    //in arraylist pass b1 and b2 objects
		a1.add(b1);                                  //creating arraylist in that book
		a1.add(b2);
		
		for(book i:a1)                                   //to print book details
			System.out.println(i.bookNum+"is" +i.bookName+"and the price is:"+i.price);
	}
}

class book{
	int price;
	String bookName;
	int bookNum;
	public book(int price,String bookName,int bookNum)
	{
		this.price=price;
		this.bookName=bookName;
		this.bookNum=bookNum;
	}
}