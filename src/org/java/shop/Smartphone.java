package org.java.shop;

public class Smartphone extends Prodotto {
	private String imei;
	private int memoria;
	
	public Smartphone 
		(String codice, String nome, String marca, float prezzo, float iva,
		 String imei, int memoria) {
		
		super(codice, nome, marca, prezzo, iva);
		
		setImei(imei);
		setMemoria(memoria);
	}
	
	
	// GETTER //
	
	public String getImei() {
		return imei;
	}
	
	public int getMemoria() {
		return memoria;
	}
	
	
	// SETTER //
	
	public void setImei(String imei) {
		this.imei = imei;
	}
	
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	
	// VARIO //
	
	@Override
	public String toString() {
		return super.toString() 
			+ " - " 
			+ "Imei: " + getImei() + "\n" 
			+ " - " 
			+ "Memoria :" + getMemoria();
	}
}
