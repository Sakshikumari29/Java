package udemy;

import java.util.Arrays;

public class StringsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="hello";
System.out.println("===== String Methods ====");
	System.out.println("Length : "+ s.length());
	System.out.println("Contains : "+ s.contains("i"));
	System.out.println("isEmpty : "+s.isEmpty());
	System.out.println("toUpperCase : "+ s.toUpperCase());
	System.out.println("startsWith : "+s.startsWith("h"));
	System.out.println("endsWith : "+s.endsWith("p"));
	System.out.println("replace : "+s.replace("e", "a"));
	System.out.println("s.trim(): " + s.trim());						// hello
	System.out.println("s.strip(): " + s.strip());						// hello
	System.out.println("s.substring(0, 3): " + s.substring(0, 3));		//  he
	System.out.println("Arrays.toString(s.getBytes()): " 
					+ Arrays.toString(s.getBytes()));	// [32, 104, 101, 108, 108, 111, 32]
	System.out.println("Arrays.toString(s.toCharArray()): " 
					+ Arrays.toString(s.toCharArray()));	// [ , h, e, l, l, o,  ]
	System.out.println("s.charAt(1): " + s.charAt(1));					// h
	System.out.println("Arrays.toString(s.split(\"e\")): " 
					+ Arrays.toString(s.split("e")));	
	
	
	}

}
