
package model;

import gui.GamePanel;
import gui.GameWindow;
import gui.ResultDialog;

/** @pdOid f9d2f4b7-1a71-4759-980e-cd95c6c493fe */
public class Druga extends StanjeUtakmice {
	/** @pdOid f79b3b60-bc63-40a1-be44-7767c3b3405c */
	public void entry() {
		GameWindow.quarter.setText("2. quarter");
	}

	/** @pdOid 7f8fd24a-b60e-4f3d-b690-5f5d35a2ef66 */
	public void exit() {
		ResultDialog dialog = new ResultDialog(0);
		dialog.setVisible(true);
		dialog.setTitle("Results after 2/4");
	}

	/** @pdOid bbf7382e-9d1c-4ad7-b563-a5d0dc9925d8 */
	public void _do() {
		// TODO: implement
	}

	/** @pdOid aea06165-b909-4145-a2c3-cb1328e26f10 */
	public void dogadjajKlikPocetak() {
		// TODO: implement
	}

	/** @pdOid 59d796dc-75a7-4f3a-9a1f-182ab23550c7 */
	public void dogadjajKlikKraj() {
		// TODO: implement
	}

	/** @pdOid ca699f37-8483-4790-97f3-6b31f412e072 */
	public void dogadjajKlikSledeca() {
		GamePanel.novaUtakmica.getAktivno().exit();
		Treca stanje= new Treca();
		GamePanel.novaUtakmica.setAktivno(stanje);
		stanje.entry();
	}

}