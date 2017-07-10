package gui;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Utakmica;

public class GameWindow extends JFrame{

	private JButton pos1;
	private JButton pos2;
	private JButton pos3;
	private JButton pos4;
	private JButton pos5;
	private JButton pos6;
	private JButton pos7;
	private JButton pos8;
	private JButton pos9;
	private JButton pos10;
	
	private JButton homeCoach;
	private JButton guestCoach;
	
	private JPanel pan1;
	
	private JLabel home; 
	private JLabel guest;
	private JLabel homeRes; 
	private JLabel guestRes;
	
	public static JLabel quarter;
	public static JButton state;
	public static String resH;
	public static String resG;
	
	private int n=0;

	
	public GameWindow(Utakmica u) throws IOException{
		initialize(u);
	}

	private void initialize(Utakmica u) throws IOException {
		
		setTitle("Game");
		
        setVisible(true);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(false);
        
        Rectangle r = getBounds();
		int h = r.height;
		int w = r.width;
		
        setContentPane(pan1=new JPanel() {
            BufferedImage image = ImageIO.read(new File("game.png"));
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, w, h, this);
            }
        });
        drawField(u,w,h);
	}
	
	public void drawField(Utakmica u, int w, int h){
		 
      
        setLayout(null);
        
        pos1 =new JButton("Player1");
        pos1.setBackground(Color.white);
        pos1.setBounds(150, 100, 100, 50);
        add(pos1);
         
        pos2=new JButton("Player2");
        pos2.setBackground(Color.white);
        pos2.setBounds(300, 200, 100, 50);
        add(pos2);
        
        pos3=new JButton("Player3");
        pos3.setBackground(Color.white);
        pos3.setBounds(80, 350, 100, 50);
        add(pos3);
        
        pos4=new JButton("Player4");
        pos4.setBackground(Color.white);
        pos4.setBounds(300, 500, 100, 50);
        add(pos4);
        
        pos5=new JButton("Player5");
        pos5.setBackground(Color.white);
        pos5.setBounds(150, 600, 100, 50);
        add(pos5);
        
        pos6 =new JButton("Player6");
        pos6.setBackground(Color.gray);
        pos6.setBounds(1100, 100, 100, 50);
        add(pos6);
         
        pos7=new JButton("Player7");
        pos7.setBackground(Color.gray);
        pos7.setBounds(1000, 200, 100, 50);
        add(pos7);
        
        pos8=new JButton("Player8");
        pos8.setBackground(Color.gray);
        pos8.setBounds(1200, 350, 100, 50);
        add(pos8);
        
        pos9=new JButton("Player9");
        pos9.setBounds(1000, 500, 100, 50);
        pos9.setBackground(Color.gray);
        add(pos9);
        
        pos10=new JButton("Player10");
        pos10.setBackground(Color.gray);
        pos10.setBounds(1100, 600, 100, 50);
        add(pos10);
        
        homeCoach=new JButton("Coach");
        homeCoach.setBackground(Color.white);
        homeCoach.setBounds(10, 10, 100, 50);
        add(homeCoach);
        
        guestCoach=new JButton("Coach");
        guestCoach.setBackground(Color.gray); 
        guestCoach.setBounds(w-110, 10, 100, 50);
        add(guestCoach);
        
        int sredina= w/2-200; // da bude iza crte
        home=new JLabel(u.getDomacin().getNazivKluba());
        home.setForeground(Color.white);
        home.setBounds(sredina, 10, 150, 50);
        add(home);
        
        
        guest=new JLabel(u.getGosti().getNazivKluba());
        guest.setForeground(Color.white);
        guest.setBounds(sredina+300, 10, 150, 50);
        add(guest);
        
        homeRes=new JLabel("0");
        homeRes.setForeground(Color.white);
        homeRes.setBounds(sredina, 30, 100, 50);
        resH= homeRes.getText();
        add(homeRes);
        
        guestRes=new JLabel("0");
        guestRes.setForeground(Color.white);
        guestRes.setBounds(sredina+300, 30, 100, 50);
        resG= guestRes.getText();
        add(guestRes);
                
        
        quarter=new JLabel("Start");
        quarter.setForeground(Color.white);
        quarter.setBounds(w/2-100, h-100, 100, 50);
        add(quarter);
        
        state=new JButton("Next");
        state.setBounds(w/2+50, h-100, 100, 40);
        add(state);
        
        state.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ev) {
				n++;
				if (n==5){
					GamePanel.novaUtakmica.klikKraj();
				}
				else {
					GamePanel.novaUtakmica.klikSledeca();
				}
				
				
		}});
	}
		
}
