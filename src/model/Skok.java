package model;

import java.util.*;

/** @pdOid 4ef2a7e0-5e2b-40da-ba71-ca11007d530a */
public class Skok {
	/** @pdOid fdb0ad96-215a-4c7c-b610-aee4df2caee0 */
	private VrstaSkoka skok;
	/** @pdOid d8692521-8e1c-47fc-a414-09d9e1229c41 */
	private int brSkokova;

	public Skok() {
	}

	public Skok(VrstaSkoka skok, int brSkokova) {
		this();
		this.skok = skok;
		this.brSkokova = brSkokova;
	}

	public VrstaSkoka getSkok() {
		return skok;
	}

	public void setSkok(VrstaSkoka skok) {
		this.skok = skok;
	}

	public int getBrSkokova() {
		return brSkokova;
	}

	public void setBrSkokova(int brSkokova) {
		this.brSkokova = brSkokova;
	}

}