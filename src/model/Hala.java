package model;

/** @pdOid 09ae54f9-3244-4aec-b91c-ff6016e9d789 */
public class Hala {
	/** @pdOid 470a7be6-f104-4c44-8dcc-eaf2c22b9ba8 */
	private String naziv;
	/** @pdOid 003e5e1c-7c3c-457a-824f-4d9c9c63b9fa */
	private int kapacitet;

	/** @pdRoleInfo migr=no name=Mesto assc=association8 mult=1..1 */
	public Mesto mesto;

	public Hala() {
	}

	public Hala(String naziv, int kapacitet, Mesto mesto) {
		this();
		this.naziv = naziv;
		this.kapacitet = kapacitet;
		this.mesto = mesto;
	}
	
	public Hala(String name){
		this.naziv = name;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getKapacitet() {
		return kapacitet;
	}

	public void setKapacitet(int kapacitet) {
		this.kapacitet = kapacitet;
	}

	public Mesto getMesto() {
		return mesto;
	}

	public void setMesto(Mesto mesto) {
		this.mesto = mesto;
	}

}