package com.assign6;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str2="";
		System.out.println("Enter the string: ");
		String str1=sc.nextLine();
		for(int i=str1.length()-1;i>=0;i--) {
			str2+=str1.charAt(i);
		}
		System.out.println(str2);

	}

}
