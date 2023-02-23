package com.ejercicioFunciones;

/**
 * Para este ejercicio tendréis que crear una función
 * que reciba un precio y devuelva el precio con el IVA 
 * incluido.
 */

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Total a pagar con iva: "+calculaVenta(100));
	}
	
	
	
	// metodo calcular precio y impuesto
	static double calculaVenta(double precio) {
		double iva = precio * 0.5;
		double total = precio + iva;
		return total;
	}
	
	
	

}
