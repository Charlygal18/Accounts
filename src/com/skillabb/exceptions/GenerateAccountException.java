package com.skillabb.exceptions;

public class GenerateAccountException extends RuntimeException{
	public GenerateAccountException(String message) {
        super(message);
    }

    public void printErrorMessage() {
        System.out.println("Error en la generación de cuentas: " + getMessage());
    }
}
