package com.login;
import java.util.*;
import java.lang.Number;
public class test {

	public test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Vector	
System.out.println("**Vector**");
Vector v = new Vector ();
System.out.println(v.capacity());
for(int i =0;i<10;i++){
	v.addElement(i);
	
}
System.out.println(v.capacity());
v.addElement('A');
System.out.println(v.capacity());
System.out.println(v);


//Stack
System.out.println("**Stack**");
Stack s= new Stack();
s.push('A');
s.push('B');
s.push('C');
System.out.println(s);
System.out.println(s.search('A'));
System.out.println(s.search('Z'));

//Enumeration 
System.out.println("**Enumeration**");
Enumeration e= v.elements();
while(e.hasMoreElements()){
	try{
	Integer I =Integer.parseInt(e.nextElement().toString());
	if(I%2==0){
	System.out.println(I);
	}
	}
	catch(NumberFormatException ex){
		
	
}
}

//Iterator
System.out.println("**Iterator**");
ArrayList al= new ArrayList();
for(int i=0;i<=10;i++){
	al.add(i);
	
}
System.out.println(al);
Iterator itx= al.iterator();
try{
while(itx.hasNext()){
	Integer I=(Integer)itx.next();
	System.out.println(I);
}

	}
	catch(NumberFormatException ex){
		
	}
	}
	
	
	
	private static void If(boolean b) {
		// TODO Auto-generated method stub
		
	}


}
