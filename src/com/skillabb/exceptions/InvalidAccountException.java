package com.skillabb.exceptions;

public class InvalidAccountException extends RuntimeException{
	public InvalidAccountException(String message) {
        super(message);
    }

    public void printErrorMessage() {
        System.out.println("Error en la validación de cuenta: " + getMessage());
    }
}
