package test;

import static org.junit.Assert.*;

import java.sql.DriverManager;

import org.junit.BeforeClass;
import org.junit.Test;

import model.Aplikacija;
import model.Database;
import model.Hala;
import model.Mesto;

public class HalaTest {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");

		Database.con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "sims", "ftn");
		Database.st = Database.con.createStatement();
	}

	@Test
	public void testDodajHalu() {
		Aplikacija ap = new Aplikacija();
		boolean result1 = false;
		Mesto m=new Mesto("BELGRADE", null);
		Hala h=new Hala("SC Banjica", 1000, m);
		boolean result = ap.dodajHalu(h);
		assertEquals(result1, result);
	}

	@Test
	public void testPretraziHale() {
		Aplikacija ap = new Aplikacija();
		boolean result1 = true;
		Hala h=new Hala("Palau Blaugrana");
		boolean result = ap.pretraziHale(h);
		assertEquals(result1, result);
	}

}
