package com.assign5;

@SuppressWarnings("serial")
public class ExceptionLineTooLong extends Exception {
	public ExceptionLineTooLong() {
		super("The string is too long");
	}

}
