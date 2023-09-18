package org.java.shop;

import java.util.Scanner;

public class Carrello {
	public static void main(String[] args) {
		
		Scanner   scan = new Scanner(System.in);
		
		Smartphone sma = null;
		Televisore tel = null;
		Cuffia     cuf = null;
		
		String  codice = "";
		String    nome = "";
		String   marca = "";
		float   prezzo = 0;
		float      iva = 0;
		
		System.out.println("Cosa vuoi aggiungere nel carrello? (smartphone, televisore, cuffia)");
		String richiesta = scan.nextLine().toLowerCase();
		
		switch (richiesta) {
			case "smartphone":
				System.out.print("Codice: ");
				codice = scan.nextLine();
				System.out.print("Nome: ");
				nome = scan.nextLine();
				System.out.print("Marca: ");
				marca = scan.nextLine();
				System.out.print("Prezzo: ");
				prezzo = scan.nextFloat();
				System.out.print("Iva: ");
				iva = scan.nextFloat();
				scan.nextLine();
				
				System.out.print("Imei: ");
				String imei = scan.nextLine();
				System.out.print("Memoria: ");
				int memoria = scan.nextInt();
				
				sma = new Smartphone(codice, nome, marca, prezzo, iva, imei, memoria);
			break;
	
			case "televisore":
				System.out.print("Codice: ");
				codice = scan.nextLine();
				System.out.print("Nome: ");
				nome = scan.nextLine();
				System.out.print("Marca: ");
				marca = scan.nextLine();
				System.out.print("Prezzo: ");
				prezzo = scan.nextFloat();
				System.out.print("Iva: ");
				iva = scan.nextFloat();
				scan.nextLine();
				
				System.out.print("Dimensione: ");
				String dimensione = scan.nextLine();
				System.out.print("Smart (true o false) :");
				boolean  smart = scan.nextBoolean();
				
				tel = new Televisore(codice, nome, marca, prezzo, iva, dimensione, smart);
			break;
				
			case "cuffia":
				System.out.print("Codice: ");
				codice = scan.nextLine();
				System.out.print("Nome: ");
				nome = scan.nextLine();
				System.out.print("Marca: ");
				marca = scan.nextLine();
				System.out.print("Prezzo: ");
				prezzo = scan.nextFloat();
				System.out.print("Iva: ");
				iva = scan.nextFloat();
				scan.nextLine();
				
				System.out.print("Colore: ");
				String colore = scan.nextLine();
				System.out.print("Wireless o cablato (true o false) :");
				boolean  w_c = scan.nextBoolean();
				
				cuf = new Cuffia(codice, nome, marca, prezzo, iva, colore, w_c);
			break;
		}
		
		scan.close();
		
		if (sma != null) System.out.println(sma);
		if (tel != null) System.out.println(tel);
		if (cuf != null) System.out.println(cuf);
	}
}
