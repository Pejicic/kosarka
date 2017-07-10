package model;

import com.sun.javafx.runtime.SystemProperties;

import gui.GameWindow;
import gui.ResultDialog;

/** @pdOid 5831ff0b-8511-4d8e-a9a9-5fc772bdb8ef */
public class Cetvrta extends StanjeUtakmice {
	/** @pdOid e0c6b37f-d372-46ec-b5e0-92c42230b675 */
	public void entry() {
		GameWindow.quarter.setText("4. quarter");
		System.out.println("entry");
	}

	/** @pdOid b9f1f652-9c63-4216-8c84-e8297680e0a0 */
	public void exit() {
		System.out.println("exit");
		ResultDialog dialog = new ResultDialog();
		dialog.setVisible(true);
		dialog.setTitle("Results after 4/4");	}

	/** @pdOid 5f467456-22ec-430a-b08a-d68ad1879b06 */
	public void _do() {
		// TODO: implement
	}

	/** @pdOid fc0a2762-e027-4a59-8261-6ce57b784013 */
	public void dogadjajKlikPocetak() {
		// TODO: implement
	}

	/** @pdOid c8a5f47b-773b-49d4-8771-42fdf9042a19 */
	public void dogadjajKlikKraj(Utakmica u) {
		System.out.println("kad kako");
		u.getAktivno().exit();
		GameWindow.state.setEnabled(false);
		KrajUtakmice stanje= new KrajUtakmice();
		u.setAktivno(stanje);
		stanje.entry();
	}

	/** @pdOid f5111fec-8ebb-4c6b-908a-4a6fc2a2c1fe */
	public void dogadjajKlikSledeca(Utakmica u) {
		
	}

}