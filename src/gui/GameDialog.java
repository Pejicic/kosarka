package gui;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.ParseException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

import model.Hala;
import model.Klub;
import model.PocetakUtakmice;
import model.Sudija;
import model.Utakmica;

public class GameDialog extends JDialog{

	private GamePanel gp;
	private JPanel panel;
	private JButton play;
	
	public GameDialog() throws SQLException, ParseException{
		
		setSize(500,400);
		setLocation(400,200);
		setTitle("New game");
		
		panel= new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		play = new JButton ();
		ImageIcon icon = new ImageIcon("Play.png");
		Image img = icon.getImage();
		Image newimg = img.getScaledInstance(25, 30, java.awt.Image.SCALE_SMOOTH);
		icon = new ImageIcon(newimg); 
		play.setIcon(icon);
		play.setToolTipText("Play");
		panel.add(play);
		add(panel,BorderLayout.SOUTH);
		gp= new GamePanel();
		add(gp,BorderLayout.CENTER);
		

		play.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ev) {
				dispose();
				makeGame();
				
		}});
	}
	
	public void makeGame(){
		
		String token[] = gp.getIzabranis1().split(" ");
		Sudija s1 = new Sudija(token[0].trim(), token[1].trim());
		gp.getIzabraniSudija().add(s1);
		String tokens[] = gp.getIzabranis2().split(" ");
		Sudija s2 = new Sudija(tokens[0].trim(), tokens[1].trim());
		gp.getIzabraniSudija().add(s2);
		String tokens1[] = gp.getIzabranis3().split(" ");
		Sudija s3 = new Sudija(tokens1[0].trim(), tokens1[1].trim());
		gp.getIzabraniSudija().add(s3);
		Klub klubG = new Klub(gp.getKlubGuest());
		Klub klubD = new Klub(gp.getKlubHome());
		Hala hala = new Hala(gp.getIzabranaHala());
		gp.setNovaUtakmica ( new Utakmica(gp.getIzabraniDatum(), gp.getIzabranoVreme(), 
				gp.getIzabraniDelegat(), gp.getIzabraniSudija(), klubG, klubD, hala));
		//PocetakUtakmice pocetak= new PocetakUtakmice();
		//gp.getNovaUtakmica().setAktivno(pocetak);
		GamePanel.novaUtakmica.klikPocetak();
	}
}
