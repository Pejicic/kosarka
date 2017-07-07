package gui;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.*;

public class GamePanel extends JPanel{
	
	private JLabel homeTeam;
	private JComboBox<Tim> homeBox;
	private JButton homeButton;
	
	private JLabel guestTeam;
	private JComboBox<Tim> guestBox;
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
	
	public GamePanel (){
		initialize();
	}
	
	public void initialize (){
		
		setLayout(new BorderLayout());
		
		Dimension dim=new Dimension(150,20); // za labele 
		
		Box box = new Box(BoxLayout.Y_AXIS);
		
		
		JPanel panHome =new JPanel(new FlowLayout(FlowLayout.LEFT));
		homeTeam= new JLabel("Home team: ");
		homeTeam.setPreferredSize(dim);
		
		ArrayList<Tim> timovi= List.getKlubovi();
		homeBox= new JComboBox<Tim>();
		
		for (Tim tim: timovi){
			homeBox.addItem(tim);
		}
		Tim tim = (Tim) homeBox.getSelectedItem();
		System.out.println(tim);
				
		homeBox.setPreferredSize(dim);
		homeButton= new JButton("Home players ");
		panHome.add(homeTeam);
		panHome.add(homeBox);
		panHome.add(homeButton);
		box.add(panHome);
		
		
		
		JPanel panGuest =new JPanel(new FlowLayout(FlowLayout.LEFT));
		guestTeam= new JLabel("Guest team: ");
		guestTeam.setPreferredSize(dim);
		guestBox= new JComboBox<Tim>();
		guestBox.setPreferredSize(dim);
		
		for (Tim t: timovi){
			if (t==tim)
				continue;
			else
				guestBox.addItem(tim);
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
