package model;

import java.io.IOException;

import gui.GamePanel;
import gui.GameWindow;

/** @pdOid 5ca820ee-e704-453a-91b5-9e868198bad7 */
public class PocetakUtakmice extends StanjeUtakmice {
	/** @pdOid dc46037b-655f-426d-a61d-5f9e7ee427cb */
	public void entry() {
		GameWindow gw=null;
		try {
			gw = new GameWindow(GamePanel.novaUtakmica);
			gw.setVisible(true);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/** @pdOid 822a103d-4e2c-46ce-b5c1-89ee95e2a777 */
	public void exit() {
		// TODO: implement
	}

	/** @pdOid 4f22a0bf-8c6f-43a2-83a8-a34294981388 */
	public void _do() {
		// TODO: implement
	}

	/** @pdOid 78bf840d-7bec-4d28-8579-cf74c535ab18 */
	public void dogadjajKlikPocetak() {
		// TODO: implement
	}

	/** @pdOid 412500d2-c7e7-433e-abe4-222abc6dbe90 */
	public void dogadjajKlikKraj(Utakmica u) {
		// TODO: implement
	}

	/** @pdOid 21719614-a1e4-412a-88a9-eb5f2382f808 */
	public void dogadjajKlikSledeca(Utakmica u) {
		Prva stanje= new Prva();
		u.setAktivno(stanje);
		stanje.entry();
		return;
	}

}