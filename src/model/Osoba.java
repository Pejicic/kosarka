package model;

import java.util.*;

public class Osoba {

	private String ime;

	private String prezime;

	private String drzavljanstvo;

	private int godiste;

	public Osoba(String ime, String prz){
		this();
		this.ime = ime;
		this.prezime = prz;
	}
	
	public Osoba(String ime, String prezime, String drzavljanstvo, int godiste) {
		this();
		this.ime = ime;
		this.prezime = prezime;
		this.drzavljanstvo = drzavljanstvo;
		this.godiste = godiste;
	}

	public Osoba() {
		
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getDrzavljanstvo() {
		return drzavljanstvo;
	}

	public void setDrzavljanstvo(String drzavljanstvo) {
		this.drzavljanstvo = drzavljanstvo;
	}

	public int getGodiste() {
		return godiste;
	}

	public void setGodiste(int godiste) {
		this.godiste = godiste;
	}

}
