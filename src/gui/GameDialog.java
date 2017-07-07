package gui;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.*;

public class GameDialog extends JDialog{

	private GamePanel gp;
	private JPanel panel;
	private JButton play;
	
	public GameDialog(){
		
		setSize(500,400);
		setLocation(400,200);
		setTitle("New game");
		
		panel= new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		play = new JButton ();
		ImageIcon icon = new ImageIcon("images/play.png");
		Image img = icon.getImage();
		Image newimg = img.getScaledInstance(25, 30, java.awt.Image.SCALE_SMOOTH);
		icon = new ImageIcon(newimg); 
		play.setIcon(icon);
		play.setToolTipText("Play");
		panel.add(play);
		
		add(panel,BorderLayout.SOUTH);
		gp= new GamePanel();
		add(gp,BorderLayout.CENTER);
	}
}
