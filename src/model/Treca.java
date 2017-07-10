package model;

import gui.GamePanel;
import gui.GameWindow;
import gui.ResultDialog;

/** @pdOid 0e6d401b-e3e6-42b2-a3d3-2cf4e25b77df */
public class Treca extends StanjeUtakmice {
	/** @pdOid 6c7b655b-7529-4bd0-bd8e-d54569957bd3 */
	public void entry() {
		GameWindow.quarter.setText("3. quarter");
	}

	/** @pdOid 5769b7d2-f7a1-4680-bb02-1897cbb54024 */
	public void exit() {
		ResultDialog dialog = new ResultDialog(0);
		dialog.setVisible(true);
		dialog.setTitle("Results after 3/4");
	}

	/** @pdOid 6ef1b270-9f0c-4224-a07e-955549bd4b81 */
	public void _do() {
		// TODO: implement
	}

	/** @pdOid 3bc3610c-773b-48c9-b0de-5f108b9601c6 */
	public void dogadjajKlikPocetak() {
		// TODO: implement
	}

	/** @pdOid 72f9a142-b990-4b2f-b69b-91d38910f59e */
	public void dogadjajKlikKraj() {
		// TODO: implement
	}

	/** @pdOid a3c1230f-8fd3-44f1-a696-27e91a7cfe79 */
	public void dogadjajKlikSledeca() {

		GamePanel.novaUtakmica.getAktivno().exit();
		Cetvrta stanje= new Cetvrta();
		GamePanel.novaUtakmica.setAktivno(stanje);
		stanje.entry();
	}

}
