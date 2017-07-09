package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import model.Database;
import model.Delegat;
import model.Hala;
import model.Klub;
import model.Sudija;
import model.Utakmica;

public class GamePanel extends JPanel {

	private JLabel homeTeam;
	private JComboBox<String> homeBox;
	private JButton homeButton;

	private JLabel guestTeam;
	private JComboBox<String> guestBox;
	private JButton guestButton;

	private JLabel time;
	private JTextField timeField;

	private JLabel date;
	private JTextField dateField;

	private JLabel delegate;
	private JComboBox<String> delBox;

	private JLabel hala;
	private JComboBox<String> halaBox;

	private JLabel judges1;
	private JLabel judges2;
	private JLabel judges3;
	private JComboBox<String> sud1;
	private JComboBox<String> sud2;
	private JComboBox<String> sud3;

	private ArrayList<String> nazKlubovi;
	private ArrayList<String> nazHala;
	private ArrayList<String> delegati;
	private ArrayList<String> sudije;

	private String klubHome;
	private String klubGuest;
	private String izabranaHala;
	private Delegat izabraniDelegat;
	private String izabranis1;
	private String izabranis2;
	private String izabranis3;
	private String izabraniDatum;
	private String izabranoVreme;
	private ArrayList<Sudija> izabraniSudija = new ArrayList<Sudija>();

	private int num = 0; // pomoc oko preklapanja liste
	private int nums1 = 0;
	private int nums2 = 0;
	private int nums3 = 0;

	private Utakmica novaUtakmica;

	public GamePanel() throws SQLException, ParseException {
		initialize();
	}

	public void initialize() throws SQLException, ParseException {

		setLayout(new BorderLayout());

		Dimension dim = new Dimension(150, 20); // za labele

		Box box = new Box(BoxLayout.Y_AXIS);

		initializeTeam(dim, box);
		initializeTimeDate(dim, box);
		initializeHall(dim, box);
		initializeDelegate(dim, box);
		initializeJugdes(dim, box);


		/*String token[] = getIzabranis1().split(" ");
		Sudija s1 = new Sudija(token[0].trim(), token[1].trim());
		izabraniSudija.add(s1);
		String tokens[] = getIzabranis2().split(" ");
		Sudija s2 = new Sudija(tokens[0].trim(), tokens[1].trim());
		izabraniSudija.add(s2);
		String tokens1[] = getIzabranis3().split(" ");
		Sudija s3 = new Sudija(tokens1[0].trim(), tokens1[1].trim());
		izabraniSudija.add(s3);
		Klub klubG = new Klub(getKlubGuest());
		Klub klubD = new Klub(getKlubHome());
		Hala hala = new Hala(getIzabranaHala());
		novaUtakmica = new Utakmica(getIzabraniDatum(), getIzabranoVreme(), getIzabraniDelegat(), izabraniSudija, klubG, klubD, hala);*/
		add(box, BorderLayout.CENTER);

		
	}

	private void initializeJugdes(Dimension dim, Box box) throws SQLException {
		// TODO Auto-generated method stub
		// prikaz za izbor sudija
		JPanel panSud1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		judges1 = new JLabel("Judges 1: ");
		judges1.setPreferredSize(dim);
		sud1 = new JComboBox<String>();
		sud1.setPreferredSize(dim);
		sudije = new ArrayList<String>();
		Database.rs = Database.st.executeQuery("select ime, prz from sud_del where iduloga like 'S'");
		String sud;

		while (Database.rs.next()) {
			if (Database.rs.getString(1) != null) {
				sud = Database.rs.getString(1) + " " + Database.rs.getString(2);
				sudije.add(sud);
			}
		}

		for (String s : sudije) {
			sud1.addItem(s);
		}

		panSud1.add(judges1);
		panSud1.add(sud1);

		sud1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				// TODO Auto-generated method stub
				setIzabranis1((String) sud1.getSelectedItem());
				
				if (nums1 == 0) {
					for (String k : sudije) {
						sud2.addItem(k);
					}
					sud2.removeItem(getIzabranis1());
					nums1++;
				} else {
					sud2.removeAllItems();
					for (String k : sudije) {
						sud2.addItem(k);
					}
					sud2.removeItem(getIzabranis1());
					nums1++;
				}
			}
		});
		box.add(panSud1);

		JPanel panSud2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		judges2 = new JLabel("Judges 2: ");
		judges2.setPreferredSize(dim);
		sud2 = new JComboBox<String>();
		sud2.setPreferredSize(dim);

		panSud2.add(judges2);
		panSud2.add(sud2);

		sud2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setIzabranis2((String) sud2.getSelectedItem());
				
				if (nums2 == 0) {
					for (String s : sudije) {
						sud3.addItem(s);
					}
					sud3.removeItem(getIzabranis1());
					sud3.removeItem(getIzabranis2());
					nums2++;
				} else {
					sud3.removeAllItems();
					for (String s : sudije) {
						sud3.addItem(s);
					}
					sud3.removeItem(getIzabranis2());
					sud3.removeItem(getIzabranis1());
					nums2++;
				}
			}
		});
		box.add(panSud2);

		JPanel panSud3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		judges3 = new JLabel("Judges 3: ");
		judges3.setPreferredSize(dim);
		sud3 = new JComboBox<String>();
		sud3.setPreferredSize(dim);

		panSud3.add(judges3);
		panSud3.add(sud3);

		sud3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setIzabranis3( (String) sud3.getSelectedItem());
				
			}
		});
		;

		box.add(panSud3);

	}

	private void initializeDelegate(Dimension dim, Box box) throws SQLException {
		// TODO Auto-generated method stub
		JPanel panDel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		delegate = new JLabel("Delegate: ");
		delegate.setPreferredSize(dim);
		delBox = new JComboBox();
		delBox.setPreferredSize(dim);
		delegati = new ArrayList<String>();
		Database.rs = Database.st.executeQuery("select ime, prz from sud_del where iduloga like  'D'");
		String del;

		while (Database.rs.next()) {
			if (Database.rs.getString(1) != null) {
				del = Database.rs.getString(1) + " " + Database.rs.getString(2);
				delegati.add(del);
			}
		}

		for (String d : delegati) {
			delBox.addItem(d);
		}

		panDel.add(delegate);
		panDel.add(delBox);
		delBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String izdel = (String) delBox.getSelectedItem();
				String[] token = izdel.split(" ");
				setIzabraniDelegat(new Delegat(token[0].trim(), token[1].trim()));
			}
		});

		box.add(panDel);
	}

	private void initializeHall(Dimension dim, Box box) throws SQLException {
		// TODO Auto-generated method stub
		JPanel panHala = new JPanel(new FlowLayout(FlowLayout.LEFT));
		hala = new JLabel("Arena: ");
		hala.setPreferredSize(dim);
		halaBox = new JComboBox<String>();
		halaBox.setPreferredSize(dim);

		nazHala = new ArrayList<String>();
		Database.rs = Database.st.executeQuery("select nazhal from hala");

		while (Database.rs.next()) {
			if (Database.rs.getString(1) != null) {
				String name = Database.rs.getString(1);
				Hala h = new Hala(name);
				nazHala.add(h.getNaziv());
			}
		}

		for (String h : nazHala) {
			halaBox.addItem(h);
		}
		panHala.add(hala);
		panHala.add(halaBox);
		box.add(panHala);

		halaBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setIzabranaHala((String) halaBox.getSelectedItem());

			}
		});

	}

	private void initializeTimeDate(Dimension dim, Box box) throws ParseException {
		// TODO Auto-generated method stub
		JPanel panDate = new JPanel(new FlowLayout(FlowLayout.LEFT));
		date = new JLabel("Date: ");
		date.setPreferredSize(dim);
		dateField = new JTextField();
		dateField.setPreferredSize(dim);
		setIzabraniDatum(dateField.getText());

		System.out.println(izabraniDatum);
		panDate.add(date);
		panDate.add(dateField);
		box.add(panDate);

		JPanel panTime = new JPanel(new FlowLayout(FlowLayout.LEFT));
		time = new JLabel("Time: ");
		time.setPreferredSize(dim);
		timeField = new JTextField();
		timeField.setPreferredSize(dim);
		setIzabranoVreme(timeField.getText());
		panTime.add(time);
		panTime.add(timeField);
		box.add(panTime);
	}

	private void initializeTeam(Dimension dim, Box box) throws SQLException {
		// TODO Auto-generated method stub
		JPanel panHome = new JPanel(new FlowLayout(FlowLayout.LEFT));
		homeTeam = new JLabel("Home team: ");
		homeTeam.setPreferredSize(dim);

		nazKlubovi = new ArrayList<String>(); // lista sadrzi nazive klubova
		homeBox = new JComboBox<String>();

		Database.rs = Database.st.executeQuery("select nazkl from klub");

		while (Database.rs.next()) {
			if (Database.rs.getString(1) != null) {
				String name = Database.rs.getString(1);
				Klub k = new Klub(name);
				nazKlubovi.add(k.getNazivKluba());
			}
		}

		for (String k : nazKlubovi) {
			homeBox.addItem(k);
		}

		homeBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				setKlubHome((String) homeBox.getSelectedItem());
				if (num == 0) {
					for (String k : nazKlubovi) {
						guestBox.addItem(k);
					}
					guestBox.removeItem(getKlubHome());
					num++;
				} else {
					guestBox.removeAllItems();
					for (String k : nazKlubovi) {
						guestBox.addItem(k);
					}
					guestBox.removeItem(getKlubHome());
					num++;
				}
			}

		});

		homeBox.setPreferredSize(dim);
		homeTeam.setPreferredSize(dim);
		panHome.add(homeTeam);
		panHome.add(homeBox);

		box.add(panHome);

		JPanel panGuest = new JPanel(new FlowLayout(FlowLayout.LEFT));
		guestTeam = new JLabel("Guest team: ");
		guestTeam.setPreferredSize(dim);
		guestBox = new JComboBox<String>();
		guestBox.setPreferredSize(dim);

		guestBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setKlubGuest((String) guestBox.getSelectedItem());

			}
		});
		guestTeam.setPreferredSize(dim);
		panGuest.add(guestTeam);
		panGuest.add(guestBox);

		box.add(panGuest);
	}

	public Utakmica getNovaUtakmica() {
		return novaUtakmica;
	}

	public void setNovaUtakmica(Utakmica novaUtakmica) {
		this.novaUtakmica = novaUtakmica;
	}

	public JLabel getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(JLabel homeTeam) {
		this.homeTeam = homeTeam;
	}

	public JComboBox<String> getHomeBox() {
		return homeBox;
	}

	public void setHomeBox(JComboBox<String> homeBox) {
		this.homeBox = homeBox;
	}

	public JButton getHomeButton() {
		return homeButton;
	}

	public void setHomeButton(JButton homeButton) {
		this.homeButton = homeButton;
	}

	public JLabel getGuestTeam() {
		return guestTeam;
	}

	public void setGuestTeam(JLabel guestTeam) {
		this.guestTeam = guestTeam;
	}

	public JComboBox<String> getGuestBox() {
		return guestBox;
	}

	public void setGuestBox(JComboBox<String> guestBox) {
		this.guestBox = guestBox;
	}

	public JButton getGuestButton() {
		return guestButton;
	}

	public void setGuestButton(JButton guestButton) {
		this.guestButton = guestButton;
	}

	public JLabel getTime() {
		return time;
	}

	public void setTime(JLabel time) {
		this.time = time;
	}

	public JTextField getTimeField() {
		return timeField;
	}

	public void setTimeField(JTextField timeField) {
		this.timeField = timeField;
	}

	public JLabel getDate() {
		return date;
	}

	public void setDate(JLabel date) {
		this.date = date;
	}

	public JTextField getDateField() {
		return dateField;
	}

	public void setDateField(JTextField dateField) {
		this.dateField = dateField;
	}

	public JLabel getDelegate() {
		return delegate;
	}

	public void setDelegate(JLabel delegate) {
		this.delegate = delegate;
	}

	public JComboBox<String> getDelBox() {
		return delBox;
	}

	public void setDelBox(JComboBox<String> delBox) {
		this.delBox = delBox;
	}

	public JLabel getHala() {
		return hala;
	}

	public void setHala(JLabel hala) {
		this.hala = hala;
	}

	public JComboBox<String> getHalaBox() {
		return halaBox;
	}

	public void setHalaBox(JComboBox<String> halaBox) {
		this.halaBox = halaBox;
	}

	public JLabel getJudges1() {
		return judges1;
	}

	public void setJudges1(JLabel judges1) {
		this.judges1 = judges1;
	}

	public JLabel getJudges2() {
		return judges2;
	}

	public void setJudges2(JLabel judges2) {
		this.judges2 = judges2;
	}

	public JLabel getJudges3() {
		return judges3;
	}

	public void setJudges3(JLabel judges3) {
		this.judges3 = judges3;
	}

	public JComboBox<String> getSud1() {
		return sud1;
	}

	public void setSud1(JComboBox<String> sud1) {
		this.sud1 = sud1;
	}

	public JComboBox<String> getSud2() {
		return sud2;
	}

	public void setSud2(JComboBox<String> sud2) {
		this.sud2 = sud2;
	}

	public JComboBox<String> getSud3() {
		return sud3;
	}

	public void setSud3(JComboBox<String> sud3) {
		this.sud3 = sud3;
	}

	public ArrayList<String> getNazKlubovi() {
		return nazKlubovi;
	}

	public void setNazKlubovi(ArrayList<String> nazKlubovi) {
		this.nazKlubovi = nazKlubovi;
	}

	public ArrayList<String> getNazHala() {
		return nazHala;
	}

	public void setNazHala(ArrayList<String> nazHala) {
		this.nazHala = nazHala;
	}

	public ArrayList<String> getDelegati() {
		return delegati;
	}

	public void setDelegati(ArrayList<String> delegati) {
		this.delegati = delegati;
	}

	public ArrayList<String> getSudije() {
		return sudije;
	}

	public void setSudije(ArrayList<String> sudije) {
		this.sudije = sudije;
	}

	public String getKlubHome() {
		return klubHome;
	}

	public void setKlubHome(String klubHome) {
		this.klubHome = klubHome;
	}

	public String getKlubGuest() {
		return klubGuest;
	}

	public void setKlubGuest(String klubGuest) {
		this.klubGuest = klubGuest;
	}

	public String getIzabranaHala() {
		return izabranaHala;
	}

	public void setIzabranaHala(String izabranaHala) {
		this.izabranaHala = izabranaHala;
	}

	public Delegat getIzabraniDelegat() {
		return izabraniDelegat;
	}

	public void setIzabraniDelegat(Delegat izabraniDelegat) {
		this.izabraniDelegat = izabraniDelegat;
	}

	public String getIzabranis1() {
		return izabranis1;
	}

	public void setIzabranis1(String izabranis1) {
		this.izabranis1 = izabranis1;
	}

	public String getIzabranis2() {
		return izabranis2;
	}

	public void setIzabranis2(String izabranis2) {
		this.izabranis2 = izabranis2;
	}

	public String getIzabranis3() {
		return izabranis3;
	}

	public void setIzabranis3(String izabranis3) {
		this.izabranis3 = izabranis3;
	}

	public String getIzabraniDatum() {
		return izabraniDatum;
	}

	public void setIzabraniDatum(String izabraniDatum) {
		this.izabraniDatum = izabraniDatum;
	}

	public String getIzabranoVreme() {
		return izabranoVreme;
	}

	public void setIzabranoVreme(String izabranoVreme) {
		this.izabranoVreme = izabranoVreme;
	}

	public ArrayList<Sudija> getIzabraniSudija() {
		return izabraniSudija;
	}

	public void setIzabraniSudija(ArrayList<Sudija> izabraniSudija) {
		this.izabraniSudija = izabraniSudija;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getNums1() {
		return nums1;
	}

	public void setNums1(int nums1) {
		this.nums1 = nums1;
	}

	public int getNums2() {
		return nums2;
	}

	public void setNums2(int nums2) {
		this.nums2 = nums2;
	}

	public int getNums3() {
		return nums3;
	}

	public void setNums3(int nums3) {
		this.nums3 = nums3;
	}

	
}
