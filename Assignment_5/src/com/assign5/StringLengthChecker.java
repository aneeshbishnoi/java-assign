package com.assign5;

import java.util.Scanner;

public class StringLengthChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        try {
        	if(input.length()>80) {
        		throw new ExceptionLineTooLong();
        	}
        	else {
        		System.out.println("Length of the string:"+input.length());
        	}
        	
        }
        catch(ExceptionLineTooLong e) {
        	System.out.println("Exception :"+e.getMessage());
        }
        finally {
        	sc.close();
        }
		
	}

}
