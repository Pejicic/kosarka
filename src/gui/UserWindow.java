package gui;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;

import javax.swing.*;

import model.Aplikacija;

/*Klasa za kreiranje prozora za log in */

public class UserWindow extends JFrame {

	
	private JButton ok;
	private JButton cancel;
	private JLabel labName;
	private JLabel labPass;
	private JLabel labTitle;
	private JTextField fieldName;
	private JPasswordField fieldPass;


	// panel za ok i cancel
	private JPanel okCancel;
	
	private JPanel panel;

	//konstruktor 
	public UserWindow(){
		initialize();
	}
	
	
	public void initialize() {

		setTitle("Log in");
		setSize(500, 300);
		setLocation(400, 200);
		setResizable(false);
		
		ok = new JButton("OK");
		cancel = new JButton("Cancel");
		okCancel = new JPanel();

	
		panel = new JPanel();
		labTitle= new JLabel("Welcome! Insert: ");
		labName = new JLabel("User ID: ");
		labPass = new JLabel("Password: ");

		fieldName = new JTextField(30);
		fieldPass = new JPasswordField(10);

		getContentPane().add(okCancel, BorderLayout.SOUTH);
		okCancel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		panel.setLayout(null);
		
		labTitle.setBounds(70,25,200,20);
		labName.setBounds(70,75,200,20);
		fieldName.setBounds(150,75,200,20);
		
		panel.add(labTitle);
		panel.add(labName);
		panel.add(fieldName);
		
		labPass.setBounds(70,120,200,20);
		fieldPass.setBounds(150,120,200,20);
		
		panel.add(labPass);
		panel.add(fieldPass);

		getContentPane().add(panel);
		
		okCancel.add(ok);
		okCancel.add(cancel);
		
		// listeneri za ok i cancel
		cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				System.exit(0);
			}

		});

		List list= new List();
		
		ok.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev) {
				
				String name = fieldName.getText();
				String pass = new String(fieldPass.getPassword());
				boolean check = false;
				try {
					check = Aplikacija.login(name, pass);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (check){
					StartWindow sw= new StartWindow();
					sw.setVisible(true);
					dispose();
				}
				else{
					JOptionPane.showMessageDialog(null, "Invalid username/password. Try again.");
				}
			}

		});
	}

}
