package model;

import java.util.*;

public class Korisnik {


	private String korisnickoIme;

	private String lozinka;

	public Osoba osoba;
	
	public Korisnik(){}

	public Korisnik(String korisnickoIme, String lozinka, Osoba osoba) {
		this();
		this.korisnickoIme = korisnickoIme;
		this.lozinka = lozinka;
		this.osoba = osoba;
	}

	public String getKorisnickoIme() {
		return korisnickoIme;
	}

	public void setKorisnickoIme(String korisnickoIme) {
		this.korisnickoIme = korisnickoIme;
	}

	public String getLozinka() {
		return lozinka;
	}

	public void setLozinka(String lozinka) {
		this.lozinka = lozinka;
	}

	public Osoba getOsoba() {
		return osoba;
	}

	public void setOsoba(Osoba osoba) {
		this.osoba = osoba;
	}

}
