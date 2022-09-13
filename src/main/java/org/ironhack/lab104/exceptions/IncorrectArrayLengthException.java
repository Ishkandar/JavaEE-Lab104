package org.ironhack.lab104.exceptions;

public class IncorrectArrayLengthException extends Exception {
	public IncorrectArrayLengthException (String errorMessage, Throwable err) {
		super(errorMessage, err);
	}
}
