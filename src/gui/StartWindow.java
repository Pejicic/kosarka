package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.*;

public class StartWindow extends JFrame{
	
	private JButton report;
	private JButton game;
	private JPanel panel;
	
	public StartWindow(){
		initialize();
	}
	
	public void initialize (){
		
		setSize(300,300);
		setLocation(500,200);
		setTitle("Options");
		
		report= new JButton("Previous reports ");
		game= new JButton("New game ");
		
		report.setBounds(50, 60, 180, 40);
		game.setBounds(50, 130, 180, 40);
		
		panel= new JPanel();
		panel.setLayout(null);
		
		panel.add(report);
		panel.add(game);
		
		getContentPane().add(panel);
		
		game.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				GameDialog gd;
				try {
					gd = new GameDialog();
					gd.setVisible(true);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}

		});
	}
}
