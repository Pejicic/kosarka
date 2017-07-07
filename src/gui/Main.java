package gui;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		UserWindow uw= new UserWindow();
		uw.setVisible(true);
		
		Korisnik k1= new Korisnik("a","a");
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
		
		List.klubovi.add(tim);
		List.klubovi.add(tim2);
	}

}
