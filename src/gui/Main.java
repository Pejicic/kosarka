package gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Aplikacija;
import model.Database;
import model.Korisnik;

public class Main {
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		/*Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:XE", "sims", "ftn");
	
		// create statement
		st = con.createStatement();*/
		
		Class.forName("oracle.jdbc.driver.OracleDriver");

		Database.con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "sims", "ftn");
		Database.st =  Database.con.createStatement();
		
		UserWindow uw= new UserWindow();
		uw.setVisible(true);
		
	/*	Korisnik k1= new Korisnik("a","a");
		Korisnik k2= new Korisnik ("b","b");
		
		List.korisnici.add(k1);
		List.korisnici.add(k2);
		
		Tim tim = new Tim("Zvezda");
		Tim tim2 = new Tim("Partizan");
		ArrayList <Igrac> igraci2= new ArrayList<>();
		
		for (int i = 0; i<15 ; i++){
			Igrac ig = new Igrac(Integer.valueOf(i).toString(), Integer.valueOf(i).toString(), i);
			igraci2.add(ig);
		}
		tim.setIgraci(igraci2);
		tim2.setIgraci(igraci2);
		*/
		//List.klubovi.add(tim);
	//	List.klubovi.add(tim2);
		
		// close
		
		
		
		

	}

}
