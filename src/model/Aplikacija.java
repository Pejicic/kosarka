package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import gui.Main;
import javafx.scene.chart.PieChart.Data;

/** @pdOid 666160ba-e392-4a91-8998-e93bf3b6176e */
public class Aplikacija {

	/**
	 * @pdRoleInfo migr=no name=Hala assc=association11
	 *             coll=java.util.Collection impl=java.util.HashSet mult=1..*
	 *             type=Composition
	 */
	public java.util.Collection<Hala> hala;
	/**
	 * @pdRoleInfo migr=no name=Osoba assc=association12
	 *             coll=java.util.Collection impl=java.util.HashSet mult=1..*
	 *             type=Composition
	 */
	public java.util.Collection<Osoba> osoba;
	/**
	 * @pdRoleInfo migr=no name=Klub assc=association13
	 *             coll=java.util.Collection impl=java.util.HashSet mult=1..*
	 *             type=Composition
	 */
	public java.util.Collection<Klub> klub;
	/**
	 * @pdRoleInfo migr=no name=Utakmica assc=association14
	 *             coll=java.util.Collection impl=java.util.HashSet mult=1..*
	 *             type=Composition
	 */
	public java.util.Collection<Utakmica> utakmica;
	/**
	 * @pdRoleInfo migr=no name=Korisnik assc=association16
	 *             coll=java.util.Collection impl=java.util.HashSet mult=0..*
	 *             type=Composition
	 */
	public java.util.Collection<Korisnik> korisnik;

	public Aplikacija() {
	}

	public Aplikacija(Collection<Hala> hala, Collection<Osoba> osoba, Collection<Klub> klub,
			Collection<Utakmica> utakmica, Collection<Korisnik> korisnik) {
		this();
		this.hala = hala;
		this.osoba = osoba;
		this.klub = klub;
		this.utakmica = utakmica;
		this.korisnik = korisnik;
	}

	/**
	 * @param h
	 * @throws SQLException
	 * @pdOid 63346b20-2c3b-4cba-bf22-538bb74f7b19
	 * 
	 * 
	 */
	public boolean dodajHalu(Hala h) {
		// TODO: implement
		// 1. naci mesto gde se nalazi hala
		String nazMesto = h.getMesto().getNazivMesta();
		String mesto = null;
		ResultSet rs;
		try {
			rs = Database.st.executeQuery("select idmes from mesto where nazmesto = '" + nazMesto + "'");

			while (rs.next()) {
				mesto = rs.getString(1);
			}
			// 2. unos hale u bazu

			String unosHale = "insert into hala(idhale, nazhal, idmes, kapacitet) values ('H" + Database.count + "', '"
					+ h.getNaziv() + "' , '" + mesto + "', " + h.getKapacitet() + ")";
			int insert = Database.st.executeUpdate(unosHale);
			if (insert > 0) {
				Database.count += 1;
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return false;

		}

	}

	/**
	 * @param h
	 * @pdOid 81aae51f-5b64-4095-b559-134747352ba2
	 */
	public boolean obrisiHalu(Hala h) {

		try {
			String brisanjeHale = "DELETE from hala where nazhal = ?";
			PreparedStatement ps = Database.con.prepareStatement(brisanjeHale);
			ps.setString(1, h.getNaziv());
			ResultSet rs = Database.st.executeQuery(brisanjeHale);
			int delete = 0;
			while(rs.next()){
				delete++;
			}
			if (delete > 0) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return false;
		}
	}

	/** @pdOid ee579d3c-542e-4a19-9872-12f8f0d9b288 */
	public boolean pretraziHale(Hala h) {
		try {
			ResultSet rs = Database.st.executeQuery("select * from hala where nazhal = '" + h.getNaziv() + "'" );
			int count = 0;
			while(rs.next()){
				count++;
			}
			
			if (count > 0 ){
				return true;
			}else{
				return false;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return false;
		}
	

	}

	/**
	 * @param u
	 * @pdOid 51aef23f-61d2-4dd6-bae2-5bb6cae2f3e7
	 */
	public boolean dodajUtakmicu(Utakmica u) {
		return false;
		// TODO: implement
	}

	/**
	 * @param u
	 * @pdOid 861df700-1866-44bd-81e3-c1cc2a254778
	 */
	public boolean obrisiUtakmicu(Utakmica u) {
		return false;
		// TODO: implement
	}

	/** @pdOid 0226ed5e-7915-4cbf-b987-5d941547dfff */
	public boolean pretraziUtakmice() {
		return false;
		// TODO: implement
	}

	/**
	 * @throws SQLException
	 * @pdOid 4fe38d40-40d7-4e27-9ca0-e1001e278ffb
	 */
	public static boolean login(String username, String password) throws SQLException {
		ResultSet rs = Database.st.executeQuery(
				"select * from korisnici where username = '" + username + "' and pass = '" + password + "' ");

		int count = 0;
		while (rs.next()) {
			count += 1;
		}
		rs.close();
		if (count == 1) {
			return true;
		} else {
			return false;
		}

	}

	/**
	 * @param k
	 * @pdOid 4f83f05b-7fe9-43eb-b770-48a97e63489f
	 */
	public boolean dodajKorisnika(Korisnik k) {
		return false;
		// TODO: implement
	}

	/**
	 * @param k
	 * @pdOid 66e84035-50b3-4485-9cfb-aa98be0d556b
	 */
	public boolean obrisiKorisnika(Korisnik k) {
		return false;
		// TODO: implement
	}

	/** @pdOid fa14f2cc-e47b-42fb-abda-6cab97412c81 */
	public boolean pretraziKorisnike() {
		return false;
		// TODO: implement
	}

	/**
	 * @param k
	 * @pdOid 3526631a-5dbe-45f4-8199-2dae804c0b64
	 */
	public boolean dodajKlub(Klub k) {
		return false;
		// TODO: implement
	}

	/**
	 * @param k
	 * @pdOid 887e7fe5-d9c2-493d-a69f-699b5c62cd4e
	 */
	public boolean obrisiKlub(Klub k) {
		return false;
		// TODO: implement
	}

	/** @pdOid 7b1f5964-df01-4ac1-bdb1-4b71d3c437f7 */
	public boolean pretraziKlubove() {
		return false;
		// TODO: implement
	}

	/**
	 * @param d
	 * @pdOid 152065d6-428d-4041-bb8e-03eb46df2d1e
	 */
	public boolean dodajDelegata(Delegat d) {
		return false;
		// TODO: implement
	}

	/**
	 * @param s
	 * @pdOid 89382bc5-4e0c-4ed7-93cc-14dc57508d0f
	 */
	public boolean dodajSudiju(Sudija s) {
		return false;
		// TODO: implement
	}

	/**
	 * @param d
	 * @pdOid 7ec9e2df-d12b-4cd3-bf55-46c8b0bea0b8
	 */
	public boolean izbrisiDelegata(Delegat d) {
		return false;
		// TODO: implement
	}

	/**
	 * @param s
	 * @pdOid 14b98196-c464-416a-a955-6ae510b345e1
	 */
	public boolean izbrisiSudiju(Sudija s) {
		return false;
		// TODO: implement
	}

	/** @pdOid 7a39d6fa-741a-43f7-924c-69d5633dcfcb */
	public boolean pretraziDelegate() {
		return false;
		// TODO: implement
	}

	/** @pdOid dcbecf6e-45f4-49cc-8533-da48b599fdaf */
	public boolean pretraziSudije() {
		return false;
		// TODO: implement
	}

	/**
	 * @param i
	 * @pdOid d7246d41-d310-47f6-8408-f9a3aad60b9a
	 */
	public boolean dodajIgraca(Igrac i) {
		return false;
		// TODO: implement
	}

	/**
	 * @param i
	 * @pdOid ce07564e-79de-40e4-a569-5fe1ba0b2536
	 */
	public boolean obrisiIgraca(Igrac i) {
		return false;
		// TODO: implement
	}

	/** @pdOid b35966bc-de03-4ddf-836f-5d54321a7612 */
	public boolean pretraziIgrace() {
		return false;
		// TODO: implement
	}

	/** @pdGenerated default getter */
	public java.util.Collection<Hala> getHala() {
		if (hala == null)
			hala = new java.util.HashSet<Hala>();
		return hala;
	}

	/** @pdGenerated default iterator getter */
	public java.util.Iterator getIteratorHala() {
		if (hala == null)
			hala = new java.util.HashSet<Hala>();
		return hala.iterator();
	}

	/**
	 * @pdGenerated default setter
	 * @param newHala
	 */
	public void setHala(java.util.Collection<Hala> newHala) {
		removeAllHala();
		for (java.util.Iterator iter = newHala.iterator(); iter.hasNext();)
			addHala((Hala) iter.next());
	}

	/**
	 * @pdGenerated default add
	 * @param newHala
	 */
	public void addHala(Hala newHala) {
		if (newHala == null)
			return;
		if (this.hala == null)
			this.hala = new java.util.HashSet<Hala>();
		if (!this.hala.contains(newHala))
			this.hala.add(newHala);
	}

	/**
	 * @pdGenerated default remove
	 * @param oldHala
	 */
	public void removeHala(Hala oldHala) {
		if (oldHala == null)
			return;
		if (this.hala != null)
			if (this.hala.contains(oldHala))
				this.hala.remove(oldHala);
	}

	/** @pdGenerated default removeAll */
	public void removeAllHala() {
		if (hala != null)
			hala.clear();
	}

	/** @pdGenerated default getter */
	public java.util.Collection<Osoba> getOsoba() {
		if (osoba == null)
			osoba = new java.util.HashSet<Osoba>();
		return osoba;
	}

	/** @pdGenerated default iterator getter */
	public java.util.Iterator getIteratorOsoba() {
		if (osoba == null)
			osoba = new java.util.HashSet<Osoba>();
		return osoba.iterator();
	}

	/**
	 * @pdGenerated default setter
	 * @param newOsoba
	 */
	public void setOsoba(java.util.Collection<Osoba> newOsoba) {
		removeAllOsoba();
		for (java.util.Iterator iter = newOsoba.iterator(); iter.hasNext();)
			addOsoba((Osoba) iter.next());
	}

	/**
	 * @pdGenerated default add
	 * @param newOsoba
	 */
	public void addOsoba(Osoba newOsoba) {
		if (newOsoba == null)
			return;
		if (this.osoba == null)
			this.osoba = new java.util.HashSet<Osoba>();
		if (!this.osoba.contains(newOsoba))
			this.osoba.add(newOsoba);
	}

	/**
	 * @pdGenerated default remove
	 * @param oldOsoba
	 */
	public void removeOsoba(Osoba oldOsoba) {
		if (oldOsoba == null)
			return;
		if (this.osoba != null)
			if (this.osoba.contains(oldOsoba))
				this.osoba.remove(oldOsoba);
	}

	/** @pdGenerated default removeAll */
	public void removeAllOsoba() {
		if (osoba != null)
			osoba.clear();
	}

	/** @pdGenerated default getter */
	public java.util.Collection<Klub> getKlub() {
		if (klub == null)
			klub = new java.util.HashSet<Klub>();
		return klub;
	}

	/** @pdGenerated default iterator getter */
	public java.util.Iterator getIteratorKlub() {
		if (klub == null)
			klub = new java.util.HashSet<Klub>();
		return klub.iterator();
	}

	/**
	 * @pdGenerated default setter
	 * @param newKlub
	 */
	public void setKlub(java.util.Collection<Klub> newKlub) {
		removeAllKlub();
		for (java.util.Iterator iter = newKlub.iterator(); iter.hasNext();)
			addKlub((Klub) iter.next());
	}

	/**
	 * @pdGenerated default add
	 * @param newKlub
	 */
	public void addKlub(Klub newKlub) {
		if (newKlub == null)
			return;
		if (this.klub == null)
			this.klub = new java.util.HashSet<Klub>();
		if (!this.klub.contains(newKlub))
			this.klub.add(newKlub);
	}

	/**
	 * @pdGenerated default remove
	 * @param oldKlub
	 */
	public void removeKlub(Klub oldKlub) {
		if (oldKlub == null)
			return;
		if (this.klub != null)
			if (this.klub.contains(oldKlub))
				this.klub.remove(oldKlub);
	}

	/** @pdGenerated default removeAll */
	public void removeAllKlub() {
		if (klub != null)
			klub.clear();
	}

	/** @pdGenerated default getter */
	public java.util.Collection<Utakmica> getUtakmica() {
		if (utakmica == null)
			utakmica = new java.util.HashSet<Utakmica>();
		return utakmica;
	}

	/** @pdGenerated default iterator getter */
	public java.util.Iterator getIteratorUtakmica() {
		if (utakmica == null)
			utakmica = new java.util.HashSet<Utakmica>();
		return utakmica.iterator();
	}

	/**
	 * @pdGenerated default setter
	 * @param newUtakmica
	 */
	public void setUtakmica(java.util.Collection<Utakmica> newUtakmica) {
		removeAllUtakmica();
		for (java.util.Iterator iter = newUtakmica.iterator(); iter.hasNext();)
			addUtakmica((Utakmica) iter.next());
	}

	/**
	 * @pdGenerated default add
	 * @param newUtakmica
	 */
	public void addUtakmica(Utakmica newUtakmica) {
		if (newUtakmica == null)
			return;
		if (this.utakmica == null)
			this.utakmica = new java.util.HashSet<Utakmica>();
		if (!this.utakmica.contains(newUtakmica))
			this.utakmica.add(newUtakmica);
	}

	/**
	 * @pdGenerated default remove
	 * @param oldUtakmica
	 */
	public void removeUtakmica(Utakmica oldUtakmica) {
		if (oldUtakmica == null)
			return;
		if (this.utakmica != null)
			if (this.utakmica.contains(oldUtakmica))
				this.utakmica.remove(oldUtakmica);
	}

	/** @pdGenerated default removeAll */
	public void removeAllUtakmica() {
		if (utakmica != null)
			utakmica.clear();
	}

	/** @pdGenerated default getter */
	public java.util.Collection<Korisnik> getKorisnik() {
		if (korisnik == null)
			korisnik = new java.util.HashSet<Korisnik>();
		return korisnik;
	}

	/** @pdGenerated default iterator getter */
	public java.util.Iterator getIteratorKorisnik() {
		if (korisnik == null)
			korisnik = new java.util.HashSet<Korisnik>();
		return korisnik.iterator();
	}

	/**
	 * @pdGenerated default setter
	 * @param newKorisnik
	 */
	public void setKorisnik(java.util.Collection<Korisnik> newKorisnik) {
		removeAllKorisnik();
		for (java.util.Iterator iter = newKorisnik.iterator(); iter.hasNext();)
			addKorisnik((Korisnik) iter.next());
	}

	/**
	 * @pdGenerated default add
	 * @param newKorisnik
	 */
	public void addKorisnik(Korisnik newKorisnik) {
		if (newKorisnik == null)
			return;
		if (this.korisnik == null)
			this.korisnik = new java.util.HashSet<Korisnik>();
		if (!this.korisnik.contains(newKorisnik))
			this.korisnik.add(newKorisnik);
	}

	/**
	 * @pdGenerated default remove
	 * @param oldKorisnik
	 */
	public void removeKorisnik(Korisnik oldKorisnik) {
		if (oldKorisnik == null)
			return;
		if (this.korisnik != null)
			if (this.korisnik.contains(oldKorisnik))
				this.korisnik.remove(oldKorisnik);
	}

	/** @pdGenerated default removeAll */
	public void removeAllKorisnik() {
		if (korisnik != null)
			korisnik.clear();
	}

}