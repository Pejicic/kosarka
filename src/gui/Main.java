package gui;

import java.sql.DriverManager;
import java.sql.SQLException;

import model.Aplikacija;
import model.Database;
import model.Hala;
import model.Igrac;
import model.Korisnik;
import model.Mesto;
import model.Osoba;

public class Main {
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");

		Database.con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "sims", "ftn");
		Database.st =  Database.con.createStatement();
		
		UserWindow uw= new UserWindow();
		uw.setVisible(true);
		
		
	}

}
