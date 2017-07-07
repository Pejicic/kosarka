package model;

import java.util.Collection;

/** @pdOid a1978178-b537-41d3-8008-6ee68130450e */
public class StatistikaUtakmice {
	/** @pdOid cacc3ae4-9b36-4f18-a484-b9e121741279 */
	private int timeOut;
	/** @pdOid 9475023c-ad37-4e19-bc4f-697e5d797c0b */
	private int bodoviGosti;
	/** @pdOid 59dbe649-7ddc-48c5-be5a-43770c30e063 */
	private int bodoviDomaci;

	/**
	 * @pdRoleInfo migr=no name=StatistikaIgraca assc=association24
	 *             coll=java.util.Collection impl=java.util.HashSet mult=1..*
	 */
	public java.util.Collection<StatistikaIgraca> statistikaIgraca;
	/**
	 * @pdRoleInfo migr=no name=StatistikaTrenera assc=association25
	 *             coll=java.util.Collection impl=java.util.HashSet mult=1..*
	 */
	public java.util.Collection<StatistikaTrenera> statistikaTrenera;
	/** @pdRoleInfo migr=no name=TimskaStatistika assc=association27 mult=2 */
	public TimskaStatistika[] timskaStatistika;
	/** @pdRoleInfo migr=no name=Utakmica assc=association23 mult=1..1 side=A */
	public Utakmica utakmica;

	public StatistikaUtakmice() {
	}

	public StatistikaUtakmice(int timeOut, int bodoviGosti, int bodoviDomaci,
			Collection<StatistikaIgraca> statistikaIgraca, Collection<StatistikaTrenera> statistikaTrenera,
			TimskaStatistika[] timskaStatistika, Utakmica utakmica) {
		this();
		this.timeOut = timeOut;
		this.bodoviGosti = bodoviGosti;
		this.bodoviDomaci = bodoviDomaci;
		this.statistikaIgraca = statistikaIgraca;
		this.statistikaTrenera = statistikaTrenera;
		this.timskaStatistika = timskaStatistika;
		this.utakmica = utakmica;
	}

	public int getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(int timeOut) {
		this.timeOut = timeOut;
	}

	public int getBodoviGosti() {
		return bodoviGosti;
	}

	public void setBodoviGosti(int bodoviGosti) {
		this.bodoviGosti = bodoviGosti;
	}

	public int getBodoviDomaci() {
		return bodoviDomaci;
	}

	public void setBodoviDomaci(int bodoviDomaci) {
		this.bodoviDomaci = bodoviDomaci;
	}

	public TimskaStatistika[] getTimskaStatistika() {
		return timskaStatistika;
	}

	public void setTimskaStatistika(TimskaStatistika[] timskaStatistika) {
		this.timskaStatistika = timskaStatistika;
	}

	public Utakmica getUtakmica() {
		return utakmica;
	}

	public void setUtakmica(Utakmica utakmica) {
		this.utakmica = utakmica;
	}

	/**
	 * @param u
	 * @pdOid cfaa0747-18e8-4ee3-af8d-c6bf90fda8d8
	 */
	public void dodajStatistikuUtakmice(StatistikaUtakmice u) {
		// TODO: implement
	}

	/**
	 * @param i
	 * @pdOid bac66635-ba76-45a1-8626-bd3513c228f7
	 */
	public void dodajStatistikuIgraca(StatistikaIgraca i) {
		// TODO: implement
	}

	/**
	 * @param t
	 * @pdOid 695dba84-35fe-4e56-8178-8bfcd959a1d3
	 */
	public void dodajStatistikuTrenera(StatistikaTrenera t) {
		// TODO: implement
	}

	/**
	 * @param u
	 * @pdOid 4e2233e5-541b-49aa-9869-ebf69a10e0eb
	 */
	public void obrisiStatistikuUtakmice(StatistikaUtakmice u) {
		// TODO: implement
	}

	/**
	 * @param i
	 * @pdOid bf789ca3-a756-4078-a5d0-7b75d94ad77a
	 */
	public void obrisiStatistikuIgraca(StatistikaIgraca i) {
		// TODO: implement
	}

	/**
	 * @param t
	 * @pdOid 4a5e259a-374b-4be5-8cf5-75b8ab93f65b
	 */
	public void obrisiStatistikuTrenera(StatistikaTrenera t) {
		// TODO: implement
	}

	/** @pdOid d9a07d1f-aedd-4a87-a1bd-8dd61d690c08 */
	public void pretraziStatistikeIgraca() {
		// TODO: implement
	}

	/** @pdOid eb3d3642-f1d3-4343-bfdb-ebbfec26fe5b */
	public void pretraziStatistikeUtakmica() {
		// TODO: implement
	}

	/** @pdOid 4e7e2dec-4d08-41a5-bdb7-d3bdc084f7cf */
	public void pretraziStatistikeTrenera() {
		// TODO: implement
	}

	/**
	 * @param s
	 * @pdOid 2509f9ac-f54b-4428-bf78-e4697e7ed37d
	 */
	public void dodajStatistikuKluba(TimskaStatistika s) {
		// TODO: implement
	}

	/**
	 * @param s
	 * @pdOid 13055e80-8c99-4259-8cf0-15362cddf161
	 */
	public void obrisiStatistikuKluba(TimskaStatistika s) {
		// TODO: implement
	}

	/** @pdOid 20aaca62-fe1c-491c-af56-61437dad2785 */
	public void pretragaStatistikeKluba() {
		// TODO: implement
	}

	/** @pdGenerated default getter */
	public java.util.Collection<StatistikaIgraca> getStatistikaIgraca() {
		if (statistikaIgraca == null)
			statistikaIgraca = new java.util.HashSet<StatistikaIgraca>();
		return statistikaIgraca;
	}

	/** @pdGenerated default iterator getter */
	public java.util.Iterator getIteratorStatistikaIgraca() {
		if (statistikaIgraca == null)
			statistikaIgraca = new java.util.HashSet<StatistikaIgraca>();
		return statistikaIgraca.iterator();
	}

	/**
	 * @pdGenerated default setter
	 * @param newStatistikaIgraca
	 */
	public void setStatistikaIgraca(java.util.Collection<StatistikaIgraca> newStatistikaIgraca) {
		removeAllStatistikaIgraca();
		for (java.util.Iterator iter = newStatistikaIgraca.iterator(); iter.hasNext();)
			addStatistikaIgraca((StatistikaIgraca) iter.next());
	}

	/**
	 * @pdGenerated default add
	 * @param newStatistikaIgraca
	 */
	public void addStatistikaIgraca(StatistikaIgraca newStatistikaIgraca) {
		if (newStatistikaIgraca == null)
			return;
		if (this.statistikaIgraca == null)
			this.statistikaIgraca = new java.util.HashSet<StatistikaIgraca>();
		if (!this.statistikaIgraca.contains(newStatistikaIgraca))
			this.statistikaIgraca.add(newStatistikaIgraca);
	}

	/**
	 * @pdGenerated default remove
	 * @param oldStatistikaIgraca
	 */
	public void removeStatistikaIgraca(StatistikaIgraca oldStatistikaIgraca) {
		if (oldStatistikaIgraca == null)
			return;
		if (this.statistikaIgraca != null)
			if (this.statistikaIgraca.contains(oldStatistikaIgraca))
				this.statistikaIgraca.remove(oldStatistikaIgraca);
	}

	/** @pdGenerated default removeAll */
	public void removeAllStatistikaIgraca() {
		if (statistikaIgraca != null)
			statistikaIgraca.clear();
	}

	/** @pdGenerated default getter */
	public java.util.Collection<StatistikaTrenera> getStatistikaTrenera() {
		if (statistikaTrenera == null)
			statistikaTrenera = new java.util.HashSet<StatistikaTrenera>();
		return statistikaTrenera;
	}

	/** @pdGenerated default iterator getter */
	public java.util.Iterator getIteratorStatistikaTrenera() {
		if (statistikaTrenera == null)
			statistikaTrenera = new java.util.HashSet<StatistikaTrenera>();
		return statistikaTrenera.iterator();
	}

	/**
	 * @pdGenerated default setter
	 * @param newStatistikaTrenera
	 */
	public void setStatistikaTrenera(java.util.Collection<StatistikaTrenera> newStatistikaTrenera) {
		removeAllStatistikaTrenera();
		for (java.util.Iterator iter = newStatistikaTrenera.iterator(); iter.hasNext();)
			addStatistikaTrenera((StatistikaTrenera) iter.next());
	}

	/**
	 * @pdGenerated default add
	 * @param newStatistikaTrenera
	 */
	public void addStatistikaTrenera(StatistikaTrenera newStatistikaTrenera) {
		if (newStatistikaTrenera == null)
			return;
		if (this.statistikaTrenera == null)
			this.statistikaTrenera = new java.util.HashSet<StatistikaTrenera>();
		if (!this.statistikaTrenera.contains(newStatistikaTrenera))
			this.statistikaTrenera.add(newStatistikaTrenera);
	}

	/**
	 * @pdGenerated default remove
	 * @param oldStatistikaTrenera
	 */
	public void removeStatistikaTrenera(StatistikaTrenera oldStatistikaTrenera) {
		if (oldStatistikaTrenera == null)
			return;
		if (this.statistikaTrenera != null)
			if (this.statistikaTrenera.contains(oldStatistikaTrenera))
				this.statistikaTrenera.remove(oldStatistikaTrenera);
	}

	/** @pdGenerated default removeAll */
	public void removeAllStatistikaTrenera() {
		if (statistikaTrenera != null)
			statistikaTrenera.clear();
	}

}