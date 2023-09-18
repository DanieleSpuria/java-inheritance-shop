package org.java.shop;

public class Main {
	public static void main(String[] args) {
		
		Prodotto prod = new Prodotto("01", "coso", "deiCosi", 10, 20);
		System.out.println(prod.prezzoIva());
		
	}
}
