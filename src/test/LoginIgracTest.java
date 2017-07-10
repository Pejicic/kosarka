package test;

import static org.junit.Assert.*;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.BeforeClass;
import org.junit.Test;

import model.Aplikacija;
import model.Database;
import model.Igrac;

public class LoginIgracTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");

		Database.con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "sims", "ftn");
		Database.st = Database.con.createStatement();
	}

	@Test
	public void testLogin() throws SQLException {
		Aplikacija test = new Aplikacija();
		boolean expectedResult = true;
		boolean result = test.login("lenka", "1211");
		assertEquals(expectedResult, result);
	}

	@Test
	public void testPretragaIgraca() {
		Aplikacija test = new Aplikacija();
		Igrac i = new Igrac("Milos", "Teodosic");
		boolean result = test.pretraziIgrace(i);
		assertEquals(true, result);
	}

}
