package org.java.shop;

public class Cuffia extends Prodotto{
	private String colore;
	private boolean w_c;
	
	public Cuffia 
		(String codice, String nome, String marca, float prezzo, float iva,
		 String colore, boolean w_c) {
		
		super (codice, nome, marca, prezzo, iva);
		
		setColore(colore);
		setW_c(w_c);
	}
	
	
	// GETTER //
	
	public String getColore() {
		return colore;
	}
	
	public boolean getW_c() {
		return w_c;
	}
	
	
	// SETTER // 
	
	public void setColore(String colore) {
		this.colore = colore;
	}
	
	public void setW_c(boolean w_c) {
		this.w_c = w_c;
	}
}
