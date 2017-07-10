package model;

import gui.GamePanel;
import gui.GameWindow;
import gui.ResultDialog;

/** @pdOid 4e967fc2-00fc-4873-bdaf-8f011aefebfa */
public class Prva extends StanjeUtakmice {
	/** @pdOid 8084e81a-8798-4eff-93c6-b113b23cd232 */
	public void entry() {
		GameWindow.quarter.setText("1. quarter");
	}

	/** @pdOid 61c9b278-daa5-458d-8aba-873b04445152 */
	public void exit() {
		ResultDialog dialog = new ResultDialog(0);
		dialog.setVisible(true);
		dialog.setTitle("Results after 1/4");
		
		
	}

	/** @pdOid cb61dfd8-54d4-4f0b-8e7c-65303153d62d */
	public void _do() {
		// TODO: implement
	}

	/** @pdOid ab456bba-6aab-4501-b58c-ca5f7e8029d4 */
	public void dogadjajKlikPocetak() {
		// TODO: implement
	}

	/** @pdOid e1c631da-7fa5-4031-9820-09d3d3505219 */
	public void dogadjajKlikKraj() {
		// TODO: implement
	}

	/** @pdOid 7020f125-0d98-4189-9ce8-50f6e988e3a8 */
	public void dogadjajKlikSledeca() {
		
		GamePanel.novaUtakmica.getAktivno().exit();
		Druga stanje= new Druga();
		GamePanel.novaUtakmica.setAktivno(stanje);
		stanje.entry();
	}

}