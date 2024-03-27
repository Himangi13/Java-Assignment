package assignments;

import java.util.Arrays;

public class StrA {
	public static void main(String[] args) {
	StringBuffer sb1 = new StringBuffer("Able was I ere I saw Elba.");
	System.out.println(sb1.capacity());
	System.out.println(sb1.length());
	String hannah = "Did Hannah see bees? Hannah did.";
	System.out.println(hannah.length());
	System.out.println(hannah.charAt(12));
	System.out.println(hannah.substring(15,16));
	System.out.println(hannah.indexOf("b"));
	StringBuffer sb2=new StringBuffer("Was it a car or a cat I saw?");
	String str=sb2.substring(9, 12);
	System.out.println(str);
	String original = "software";

	StringBuffer result = new StringBuffer("hi");

	int index = original.indexOf('a');

	/*1*/ result.setCharAt(0, original.charAt(0));

	/*2*/ result.setCharAt(1, original.charAt(original.length()-1));

	/*3*/ result.insert(1, original.charAt(4));

	/*4*/ result.append(original.substring(1,4));

	/*5*/ result.insert(3, (original.substring(index, index+2) + " "));

	System.out.println(result);
	
	
    
    
	}
	
	

}
