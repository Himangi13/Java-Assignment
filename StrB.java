package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class StrB {
	public static void main(String[] args) {
	String hi = "Hi, ";
	String mom = "mom.";
	System.out.println(hi.concat(mom));
	System.out.println("********************************************");
	String s1="software";
    String s2="swear oft";
    s1= s1.replace(" ","");
	s2=s2.replace(" ", "");
	char[] ch=s1.toCharArray();
	char[] ch1=s2.toCharArray();
	Arrays.sort(ch);
	Arrays.sort(ch1);
	boolean result =Arrays.equals(ch,ch1);
	if(result) {
	System.out.println(s1+ " and "+s2+ " are anagrams");
	}
	else {
		System.out.println(s1+"and"+s2+ "are not anagrams");
		
	}
	System.out.println("********************************************");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First name:");
	String fname=sc.nextLine();
	System.out.println("Enter Last name:");
	String lname=sc.nextLine();
	System.out.println(fname + " "+ lname.charAt(0));
	sc.close();
	
	

}
}
