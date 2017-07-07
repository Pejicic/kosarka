package model;

/** @pdOid 108d5d54-24dd-43d7-9694-17a37708d043 */
public class Delegat extends Osoba {
	/** @pdRoleInfo migr=no name=Utakmica assc=association4 mult=1..* side=A */
	public Utakmica[] utakmica;

	public Delegat() {
	}

	public Delegat(String ime, String prezime, String drzavljanstvo, int godiste, Utakmica[] utakmica) {
		super(ime, prezime, drzavljanstvo, godiste);
		this.utakmica = utakmica;
	}

	public Utakmica[] getUtakmica() {
		return utakmica;
	}

	public void setUtakmica(Utakmica[] utakmica) {
		this.utakmica = utakmica;
	}

}