package gui;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.*;

import model.Database;
import model.Klub;
import sun.security.krb5.internal.tools.Klist;

public class GamePanel extends JPanel{
	
	private JLabel homeTeam;
	private JComboBox<Klub> homeBox;
	private JButton homeButton;
	
	private JLabel guestTeam;
	private JComboBox<Klub> guestBox;
	private JButton guestButton;
	
	private JButton judge;
	
	private JLabel time;
	private JTextField timeField;
	
	private JLabel date;
	private JTextField dateField;
	
	private JLabel delegate;
	private JComboBox delBox;
	
	private JLabel hala;
	private JComboBox halaBox;
	
	public GamePanel () throws SQLException{
		initialize();
	}
	
	public void initialize () throws SQLException{
		
		setLayout(new BorderLayout());
		
		Dimension dim=new Dimension(150,20); // za labele 
		
		Box box = new Box(BoxLayout.Y_AXIS);
		
		
		JPanel panHome =new JPanel(new FlowLayout(FlowLayout.LEFT));
		homeTeam= new JLabel("Home team: ");
		homeTeam.setPreferredSize(dim);
		
		ArrayList<Klub> klubovi = new ArrayList<Klub>();
		homeBox= new JComboBox<Klub>();
		
		Database.rs = Database.st.executeQuery("select nazkl from klub");
		
		while(Database.rs.next()){
			String name = Database.rs.getString(1);
			Klub k = new Klub(name);
			klubovi.add(k);
		}
	
		
		for (Klub k: klubovi){
			System.out.println(k.getNazivKluba());
			//homeBox.addItem(k);
		}
		Klub k = (Klub) homeBox.getSelectedItem();
		System.out.println(k);
				
		homeBox.setPreferredSize(dim);
		homeButton= new JButton("Home players ");
		panHome.add(homeTeam);
		panHome.add(homeBox);
		panHome.add(homeButton);
		box.add(panHome);
		
		
		
		JPanel panGuest =new JPanel(new FlowLayout(FlowLayout.LEFT));
		guestTeam= new JLabel("Guest team: ");
		guestTeam.setPreferredSize(dim);
		guestBox= new JComboBox<Klub>();
		guestBox.setPreferredSize(dim);
		
		for (Klub k1: klubovi){
			guestBox.addItem(k1);
		}
		
		guestButton= new JButton("Guest players ");
		panGuest.add(guestTeam);
		panGuest.add(guestBox);
		panGuest.add(guestButton);
		box.add(panGuest);
		
		JPanel panDate =new JPanel(new FlowLayout(FlowLayout.LEFT));
		date= new JLabel("Date: ");
		date.setPreferredSize(dim);
		dateField= new JTextField();
		dateField.setPreferredSize(dim);
		panDate.add(date);
		panDate.add(dateField);
		box.add(panDate);
		
		JPanel panTime =new JPanel(new FlowLayout(FlowLayout.LEFT));
		time= new JLabel("Time: ");
		time.setPreferredSize(dim);
		timeField= new JTextField();
		timeField.setPreferredSize(dim);
		panTime.add(time);
		panTime.add(timeField);
		box.add(panTime);
		
		JPanel panHala =new JPanel(new FlowLayout(FlowLayout.LEFT));
		hala = new JLabel("Arena: ");
		hala.setPreferredSize(dim);
		halaBox= new JComboBox();
		halaBox.setPreferredSize(dim);
		panHala.add(hala);
		panHala.add(halaBox);
		box.add(panHala);
		
		JPanel panDel =new JPanel(new FlowLayout(FlowLayout.LEFT));
		delegate = new JLabel("Delegate: ");
		delegate.setPreferredSize(dim);
		delBox= new JComboBox();
		delBox.setPreferredSize(dim);
		judge=new JButton("Judges");
		panDel.add(delegate);
		panDel.add(delBox);
		panDel.add(judge);
		box.add(panDel);
		
		
		add(box,BorderLayout.CENTER);
	}

}
