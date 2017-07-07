package model;

import java.util.*;

/** @pdOid 5bdba4c8-9919-4eb1-b705-0736da602921 */
public class TimskaStatistika {
	/** @pdOid b94e12fc-6606-4662-8522-085f81368fd7 */
	private VrstaIL izgubljenaLopta;
	/** @pdOid f60191b2-4dbc-41d1-a144-9dcbd917cf0c */
	private int brIzgubljenih;

	public TimskaStatistika() {
	}

	public TimskaStatistika(VrstaIL izgubljenaLopta, int brIzgubljenih) {
		this();
		this.izgubljenaLopta = izgubljenaLopta;
		this.brIzgubljenih = brIzgubljenih;
	}

	public VrstaIL getIzgubljenaLopta() {
		return izgubljenaLopta;
	}

	public void setIzgubljenaLopta(VrstaIL izgubljenaLopta) {
		this.izgubljenaLopta = izgubljenaLopta;
	}

	public int getBrIzgubljenih() {
		return brIzgubljenih;
	}

	public void setBrIzgubljenih(int brIzgubljenih) {
		this.brIzgubljenih = brIzgubljenih;
	}

}