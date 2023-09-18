package org.java.shop;

public class Prodotto {
	private String codice;
	private String nome;
	private String marca;
	private float prezzo;
	private float iva;
	
	public Prodotto(String codice, String nome, String marca, float prezzo, float iva) {
		setNome(nome);
		setMarca(marca);
		setPrezzo(prezzo);
		setIva(iva);
	}
	
	
	// GETTER //
	
	public String getCodice() {
		return codice;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public float getPrezzo() {
		return prezzo;
	}
	
	public float getIva() {
		return iva;
	}
	
	
	// SETTER //
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	
	public void setIva(float iva) {
		this.iva = iva;
	}
	
	
	// PREZZI //
	
	public float prezzoIva() {
		float totalePrezzoIva = getPrezzo() + getIva(); 
		return totalePrezzoIva;
	}
}
