package org.java.shop;

public class Prodotto {
	private String codice;
	private String nome;
	private String marca;
	private float prezzo;
	private float iva;
	
	public Prodotto(String codice, String nome, String marca, float prezzo, float iva) {
		this.codice = codice;
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
	
	
	// VARIO //
	
	public String prezzoBase()  {
		return "Prezzo base: " + getPrezzo();
	}
	
	public String prezzoIva() {
		float formatIva = (getIva() * getPrezzo()) / 100; 
		float totalePrezzoIva = getPrezzo() + formatIva; 
		return "Prezzo comprensivo di iva: " + String.format("%.02f", totalePrezzoIva);
	}
	
	@Override
	public String toString() {
		return 
			"\n-----------------------\n" + 
			"\n - Codice: " + getCodice() + "\n"
			+ " - " 
			+ "Nome: " + getNome() + "\n" 
			+ " - " 
			+ "Marca: " + getMarca() + "\n" 
			+ " - " 
			+ "Prezzo: " + getPrezzo() + "\n" 
			+ " - " 
			+ "Iva: " + getIva() + "\n";
	}
}
