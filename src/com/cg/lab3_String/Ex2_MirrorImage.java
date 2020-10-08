package com.cg.lab3_String;
import java.util.Scanner;

public class Ex2_MirrorImage {

	public static String getImage(String s1) {
		StringBuffer sb = new StringBuffer(s1);
		sb.reverse();

		return s1+"|"+sb;
		
	}
	public static void main(String args[]) {
		Scanner s= new Scanner(System.in);
		String sc= s.next();
		System.out.println(getImage(sc));
	}
}