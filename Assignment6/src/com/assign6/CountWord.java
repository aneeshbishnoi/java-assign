package com.assign6;

import java.util.Scanner;

public class CountWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string.");
		String str=sc.nextLine();
		str=str.trim();
		String [] arr=str.split(" ");
		
		int len=arr.length;
		int count=0;
		for(int i=0;i<len;i++) {
			count+=1;
			System.out.println("word at "+i+" " +arr[i]);
			
		}
		System.out.println("Number of words in string:"+count);
		
		
	}

}
