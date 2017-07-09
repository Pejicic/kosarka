package model;

import java.util.*;

/** @pdOid 0e57f300-af14-4876-9e69-b3828444e1f5 */
public class Utakmica {
	/** @pdOid ff59f990-a7b6-43f7-a8a1-450766d9b00f */
	private String datum;
	/** @pdOid 684f08a7-7f96-471c-b2b1-6eec8bd905a7 */
	private String vremePocetka;
	/** @pdOid 589eb545-b75e-4d64-9142-3a36bb5b752d */
	private int cetvrtina;

	/** @pdRoleInfo migr=no name=Delegat assc=association4 mult=1..1 */
	public Delegat delegat;
	/** @pdRoleInfo migr=no name=StanjeUtakmice assc=association10 mult=1..1 */
	public StanjeUtakmice aktivno;
	/**
	 * @pdRoleInfo migr=no name=StatistikaUtakmice assc=association23 mult=1..1
	 */
	public StatistikaUtakmice statistikaUtakmice;
	/** @pdRoleInfo migr=no name=Sudija assc=association3 mult=3 side=A */
	public ArrayList<Sudija> sudija;
	/** @pdRoleInfo migr=no name=Klub assc=association5 mult=1..1 side=A */
	public Klub gosti;
	public Klub domacin;
	/** @pdRoleInfo migr=no name=Hala assc=association9 mult=1..1 side=A */
	public Hala hala;

	public Utakmica() {
	}

	public Utakmica(String datum, String vremePocetka, Delegat del, ArrayList<Sudija> sudija, Klub gosti, Klub domacin, Hala hala ){
		this();
		this.datum = datum;
		this.vremePocetka = vremePocetka;
		this.delegat = del;
		this.sudija = sudija;
		this.gosti = gosti;
		this.hala = hala;
		this.domacin = domacin;
	}
	
	public Utakmica(String datum, String vremePocetka, int cetvrtina, Delegat delegat, StanjeUtakmice aktivno,
			StatistikaUtakmice statistikaUtakmice, ArrayList<Sudija> sudija, Klub gosti, Klub domacin, Hala hala) {
		this();
		this.datum = datum;
		this.vremePocetka = vremePocetka;
		this.cetvrtina = cetvrtina;
		this.delegat = delegat;
		this.aktivno = aktivno;
		this.statistikaUtakmice = statistikaUtakmice;
		this.sudija = sudija;
		this.gosti = gosti;
		this.hala = hala;
		this.domacin = domacin;
	}

	public String getDatum() {
		return datum;
	}
	
	

	public Klub getDomacin() {
		return domacin;
	}

	public void setDomacin(Klub domacin) {
		this.domacin = domacin;
	}

	public void setDatum(String datum) {
		this.datum = datum;
	}

	public String getVremePocetka() {
		return vremePocetka;
	}

	public void setVremePocetka(String vremePocetka) {
		this.vremePocetka = vremePocetka;
	}

	public int getCetvrtina() {
		return cetvrtina;
	}

	public void setCetvrtina(int cetvrtina) {
		this.cetvrtina = cetvrtina;
	}

	public Delegat getDelegat() {
		return delegat;
	}

	public void setDelegat(Delegat delegat) {
		this.delegat = delegat;
	}

	public StanjeUtakmice getAktivno() {
		return aktivno;
	}

	public void setAktivno(StanjeUtakmice aktivno) {
		this.aktivno = aktivno;
	}

	public StatistikaUtakmice getStatistikaUtakmice() {
		return statistikaUtakmice;
	}

	public void setStatistikaUtakmice(StatistikaUtakmice statistikaUtakmice) {
		this.statistikaUtakmice = statistikaUtakmice;
	}

	public ArrayList<Sudija> getSudija() {
		return sudija;
	}

	public void setSudija(ArrayList<Sudija> sudija) {
		this.sudija = sudija;
	}

	public Klub getGosti() {
		return gosti;
	}

	public void setGosti(Klub gosti) {
		this.gosti = gosti;
	}

	public Hala getHala() {
		return hala;
	}

	public void setHala(Hala hala) {
		this.hala = hala;
	}

	/**
	 * @param s
	 * @pdOid afc97111-7483-4e8f-a3ad-2c5692da919b
	 */
	public void promeniStanje(StanjeUtakmice s) {
		// TODO: implement
	}

	/** @pdOid 3811bb6b-7880-4270-ac2f-6513d3c1e2a3 */
	public void unosStatistike() {
		// TODO: implement
	}

	/** @pdOid 07729648-0080-4c1e-afa9-292483007e09 */
	public void prikaziRezultat() {
		// TODO: implement
	}

	/** @pdOid 0c706e8a-e971-44cb-96f3-a48e95a47289 */
	public void odabirZeljeneStatistike() {
		// TODO: implement
	}

	/** @pdOid 0cd4f7d1-9c74-410d-86de-74f0700c99a8 */
	public void klikPocetak() {
		// TODO: implement
	}

	/** @pdOid 669685d6-bfe3-40bf-9348-ef1cc15bf325 */
	public void klikKraj() {
		// TODO: implement
	}

	/** @pdOid 94bc43c4-865a-4ada-98db-efe2f31a41ac */
	public void klikSledeca() {
		// TODO: implement
	}

	/** @pdOid e3a90fcf-fd90-4591-b41d-e42c5805092a */
	public void prikazTerenaIPostave() {
		// TODO: implement
	}

	/** @pdOid 3012fb5b-d06d-4d27-ae5d-15b285ddf334 */
	public void odabirDelegataISudija() {
		// TODO: implement
	}

	@Override
	public String toString() {
		return "Utakmica [datum=" + datum + ", vremePocetka=" + vremePocetka + ", delegat=" + delegat + ", sudija="
				+ sudija + ", gosti=" + gosti + ", domacin=" + domacin + ", hala=" + hala + "]";
	}
	

}