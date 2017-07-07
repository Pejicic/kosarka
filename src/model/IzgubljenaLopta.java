package model;

import java.util.*;

/** @pdOid 0ef2ee5e-9c98-40bf-a649-0e57776ab959 */
public class IzgubljenaLopta {
	/** @pdOid 9c785835-9529-481b-a822-0b497ea6d674 */
	private VrstaIL izgubljenaLopta;
	/** @pdOid 9f4ac5ee-5512-47b7-a9d7-fe4982895ba4 */
	private int broj;

	public IzgubljenaLopta(){}
	public IzgubljenaLopta(VrstaIL izgubljenaLopta, int broj) {
		this();
		this.izgubljenaLopta = izgubljenaLopta;
		this.broj = broj;
	}

	public VrstaIL getIzgubljenaLopta() {
		return izgubljenaLopta;
	}

	public void setIzgubljenaLopta(VrstaIL izgubljenaLopta) {
		this.izgubljenaLopta = izgubljenaLopta;
	}

	public int getBroj() {
		return broj;
	}

	public void setBroj(int broj) {
		this.broj = broj;
	}

}