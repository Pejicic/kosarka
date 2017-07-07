package model;

import java.util.*;

/** @pdOid 4cf1b389-708a-4313-8866-5604beb7eb20 */
public class Mesto {
	/** @pdOid 443fcb48-2751-477b-85b6-16ab16c128f9 */
	private String nazivMesta;
	/** @pdOid 54b87912-67eb-4bf8-88c2-5b5be1a160af */
	private String pttBroj;

	public Mesto() {
	}

	public Mesto(String nazivMesta, String pttBroj) {
		this();
		this.nazivMesta = nazivMesta;
		this.pttBroj = pttBroj;
	}

	public String getNazivMesta() {
		return nazivMesta;
	}

	public void setNazivMesta(String nazivMesta) {
		this.nazivMesta = nazivMesta;
	}

	public String getPttBroj() {
		return pttBroj;
	}

	public void setPttBroj(String pttBroj) {
		this.pttBroj = pttBroj;
	}

}