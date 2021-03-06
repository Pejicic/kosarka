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
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.KrajUtakmice;

public class ResultDialog extends JDialog{
	
	private JLabel home;
	private JLabel guest;
	private JLabel homeRes;
	private JLabel guestRes;
	private JButton ok;
	private int option;

	public ResultDialog( int n){
		option =n;
		initialize();
	}

	public void initialize(){
		
		setSize(300, 200);
		
		final Toolkit toolkit = Toolkit.getDefaultToolkit();
		final Dimension screenSize = toolkit.getScreenSize();
		final int x = (screenSize.width - getWidth()) / 2;
		final int y = (screenSize.height - getHeight()) / 2;
		setLocation(x, y);
		
		JPanel panel= new JPanel(); // donji ugao
		panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		JPanel homePan= new JPanel(); // za domacina
		
		JPanel guestPan= new JPanel(); // za gosta
		
		Box box = new Box(BoxLayout.Y_AXIS);
		
		home = new JLabel(GamePanel.novaUtakmica.getDomacin().getNazivKluba());
		homeRes= new JLabel(GameWindow.resH);
		homePan.add(home);
		homePan.add(homeRes);
		
		box.add(homePan);
		
		guest = new JLabel(GamePanel.novaUtakmica.getGosti().getNazivKluba());
		guestRes= new JLabel(GameWindow.resG);
		guestPan.add(guest);
		guestPan.add(guestRes);
		box.add(guestPan);
		
		ok= new JButton("OK");
		panel.add(ok);
		
		add(box,BorderLayout.CENTER);
		add(panel,BorderLayout.SOUTH);
		
		ok.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if( option==1){
					GamePanel.novaUtakmica.getAktivno()._do();
					dispose();
					
				}
				else{
				dispose();}
				}
		});
	}
}
