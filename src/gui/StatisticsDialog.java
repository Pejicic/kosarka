package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

public class StatisticsDialog extends JDialog {

	private JButton cancel;
	private JButton player;
	private JButton coach;
	private JButton game;
	
	public StatisticsDialog(){
		initialize();
	}

	public void initialize(){
		
		setSize(300, 300);
		
		final Toolkit toolkit = Toolkit.getDefaultToolkit();
		final Dimension screenSize = toolkit.getScreenSize();
		final int x = (screenSize.width - getWidth()) / 2;
		final int y = (screenSize.height - getHeight()) / 2;
		setLocation(x, y);
		
		JPanel pan= new JPanel(); 
		pan.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		JPanel pan1= new JPanel(); 
		
		JPanel pan2= new JPanel();
		
		JPanel pan3= new JPanel();
		
		Box box = new Box(BoxLayout.Y_AXIS);
		
		player= new JButton("Player statistics");
		pan1.add(player);
		box.add(pan1);
		
		coach= new JButton("Coach statistics");
		pan2.add(coach);
		box.add(pan2);
		
		game= new JButton("Game statistics");
		pan3.add(game);
		box.add(pan3);
	
		
		cancel= new JButton("Cancel");
		pan.add(cancel);
		
		add(box,BorderLayout.CENTER);
		add(pan,BorderLayout.SOUTH);
		
		cancel.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				}
		});
		
		// uraditi ovo ispod
		
		player.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				}
		});
		
		coach.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				}
		});
		
		game.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				}
		});
	}
}
