package model;

import java.util.*;

/** @pdOid b9c64ba6-360f-48d5-bec4-4f4e5add8f81 */
public class LicneGreske {
	/** @pdOid 59e64377-4a0b-4bb2-ae84-71386ffddcbe */
	private VrstaLicneGreske greska;
	/** @pdOid 7a27dee3-8ca0-4bff-8c36-df956312dab7 */
	private VrstaNesportskeGreske nesportska;
	/** @pdOid fd6c7212-3f15-4944-aaf5-00c074f2520e */
	private int brojGresaka;
	/** @pdOid af6a0969-8723-4578-b5e4-912d42707812 */
	private int brNesportskihGresaka;
	/** @pdOid 9aa42c00-0d28-4770-8cbf-fe9fdb8cab8a */
	private boolean diskvalifikujuca;

	public LicneGreske(){}
	public LicneGreske(VrstaLicneGreske greska, VrstaNesportskeGreske nesportska, int brojGresaka,
			int brNesportskihGresaka, boolean diskvalifikujuca) {
		this();
		this.greska = greska;
		this.nesportska = nesportska;
		this.brojGresaka = brojGresaka;
		this.brNesportskihGresaka = brNesportskihGresaka;
		this.diskvalifikujuca = diskvalifikujuca;
	}

	public VrstaLicneGreske getGreska() {
		return greska;
	}

	public void setGreska(VrstaLicneGreske greska) {
		this.greska = greska;
	}

	public VrstaNesportskeGreske getNesportska() {
		return nesportska;
	}

	public void setNesportska(VrstaNesportskeGreske nesportska) {
		this.nesportska = nesportska;
	}

	public int getBrojGresaka() {
		return brojGresaka;
	}

	public void setBrojGresaka(int brojGresaka) {
		this.brojGresaka = brojGresaka;
	}

	public int getBrNesportskihGresaka() {
		return brNesportskihGresaka;
	}

	public void setBrNesportskihGresaka(int brNesportskihGresaka) {
		this.brNesportskihGresaka = brNesportskihGresaka;
	}

	public boolean isDiskvalifikujuca() {
		return diskvalifikujuca;
	}

	public void setDiskvalifikujuca(boolean diskvalifikujuca) {
		this.diskvalifikujuca = diskvalifikujuca;
	}

}
