package org.java.shop;

public class Televisore extends Prodotto{
	private String dimensioni;
	private boolean smart;
	
	public Televisore
		(String codice, String nome, String marca, float prezzo, float iva,
		 String dimensioni, boolean smart) {
		
		super(codice, nome, marca, prezzo, iva);
		
		setDimensioni(dimensioni);
		setSmart(smart);
	}
	
	
	// GETTER //
	
	public String getDimensioni() {
		return dimensioni;
	}
	
	public boolean getSmart() {
		return smart;
	}
	
	
	// SETTER //
	
	public void setDimensioni(String dimensioni) {
		this.dimensioni = dimensioni;
	}
	
	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	
	
	@Override
	public String toString() {
		return super.toString() 
			+ " - " 
			+ "Dimensioni: " + getDimensioni() + "\n" 
			+ " - " 
			+ "Smart :" + getSmart();
	}
}
