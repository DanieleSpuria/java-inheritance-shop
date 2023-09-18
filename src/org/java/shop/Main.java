package org.java.shop;

public class Main {
	public static void main(String[] args) {
		
		Prodotto prod = new Prodotto("01", "coso", "deiCosi", 10, 20);
		System.out.println(prod.prezzoIva());
		
		Smartphone sma = new Smartphone(
				"02", "telefono", "di marca", 200, 10, "09575", 250);
		System.out.println(sma.prezzoIva());
	}
}
