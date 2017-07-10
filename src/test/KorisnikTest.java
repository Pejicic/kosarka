package test;

import static org.junit.Assert.*;

import java.sql.DriverManager;

import org.junit.BeforeClass;
import org.junit.Test;

import model.Aplikacija;
import model.Database;
import model.Hala;
import model.Korisnik;
import model.Mesto;
import model.Osoba;

public class KorisnikTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");

		Database.con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "sims", "ftn");
		Database.st = Database.con.createStatement();
	}
	@Test
	public void testDodajKorisnika() {
		Aplikacija ap = new Aplikacija();
		boolean result1 = false;
		Korisnik k=new Korisnik("ssss", "2222", new Osoba("Pera", "Peric"));
		boolean result = ap.dodajKorisnika(k);
		assertEquals(result1, result);
	}

	@Test
	public void testPretraziKorisnike() {
		Aplikacija ap = new Aplikacija();
		boolean result1 = true;
		Korisnik k=new Korisnik("ssss", "2222", new Osoba("Pera", "Peric"));
		boolean result = ap.pretraziKorisnike(k);
		assertEquals(result1, result);
		
		
	}

}
