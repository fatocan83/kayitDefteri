package com.cs.model;

public class Kayit {

	// Generate Getter and Setters...
	private int id;
	private String adi;
	private String soyadi;
	private String kanGrubu;
	private String cepTel;
	private String adres;

	public Kayit() {
		super();
	}

	public Kayit(int id, String adi, String soyadi, String kanGrubu, String cepTel, String adres) {
		super();
		this.id = id;
		this.adi = adi;
		this.soyadi = soyadi;
		this.kanGrubu = kanGrubu;
		this.cepTel = cepTel;
		this.adres = adres;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public String getKanGrubu() {
		return kanGrubu;
	}

	public void setKanGrubu(String kanGrubu) {
		this.kanGrubu = kanGrubu;
	}

	public String getCepTel() {
		return cepTel;
	}

	public void setCepTel(String cepTel) {
		this.cepTel = cepTel;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

}
