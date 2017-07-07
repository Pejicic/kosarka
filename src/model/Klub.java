package model;

import java.util.*;

/** @pdOid 3cdf8e24-4ed6-4ba6-a6c5-0369637f70a3 */
public class Klub {
	/** @pdOid 42a82400-2540-4f07-abfc-c01af17de538 */
	private String nazivKluba;

	/**
	 * @pdRoleInfo migr=no name=Igrac assc=association1
	 *             coll=java.util.Collection impl=java.util.HashSet mult=1..*
	 */
	public java.util.Collection<Igrac> igrac;
	/** @pdRoleInfo migr=no name=Utakmica assc=association5 mult=1..* */
	public Utakmica[] utakmice;
	/**
	 * @pdRoleInfo migr=no name=Utakmica assc=association6
	 *             coll=java.util.Collection impl=java.util.HashSet mult=1..*
	 */
	public java.util.Collection<Utakmica> utakmica;
	/** @pdRoleInfo migr=no name=Mesto assc=association7 mult=1..1 */
	public Mesto mesto;
	/**
	 * @pdRoleInfo migr=no name=TimskaStatistika assc=association26
	 *             coll=java.util.Collection impl=java.util.HashSet mult=1..*
	 */
	public java.util.Collection<TimskaStatistika> timskaStatistika;
	/** @pdRoleInfo migr=no name=Trener assc=association2 mult=1..1 side=A */
	public Trener trener;

	public Klub() {
	}

	public Klub(String nazivKluba, Collection<Igrac> igrac, Utakmica[] utakmice, Collection<Utakmica> utakmica,
			Mesto mesto, Collection<TimskaStatistika> timskaStatistika, Trener trener) {
		this();
		this.nazivKluba = nazivKluba;
		this.igrac = igrac;
		this.utakmice = utakmice;
		this.utakmica = utakmica;
		this.mesto = mesto;
		this.timskaStatistika = timskaStatistika;
		this.trener = trener;
	}
	public Klub(String nazivKluba){
		this.nazivKluba = nazivKluba;
	}
	public String getNazivKluba() {
		return nazivKluba;
	}

	public void setNazivKluba(String nazivKluba) {
		this.nazivKluba = nazivKluba;
	}

	public Utakmica[] getUtakmice() {
		return utakmice;
	}

	public void setUtakmice(Utakmica[] utakmice) {
		this.utakmice = utakmice;
	}

	public Mesto getMesto() {
		return mesto;
	}

	public void setMesto(Mesto mesto) {
		this.mesto = mesto;
	}

	public Trener getTrener() {
		return trener;
	}

	public void setTrener(Trener trener) {
		this.trener = trener;
	}

	/** @pdGenerated default getter */
	public java.util.Collection<Igrac> getIgrac() {
		if (igrac == null)
			igrac = new java.util.HashSet<Igrac>();
		return igrac;
	}

	/** @pdGenerated default iterator getter */
	public java.util.Iterator getIteratorIgrac() {
		if (igrac == null)
			igrac = new java.util.HashSet<Igrac>();
		return igrac.iterator();
	}

	/**
	 * @pdGenerated default setter
	 * @param newIgrac
	 */
	public void setIgrac(java.util.Collection<Igrac> newIgrac) {
		removeAllIgrac();
		for (java.util.Iterator iter = newIgrac.iterator(); iter.hasNext();)
			addIgrac((Igrac) iter.next());
	}

	/**
	 * @pdGenerated default add
	 * @param newIgrac
	 */
	public void addIgrac(Igrac newIgrac) {
		if (newIgrac == null)
			return;
		if (this.igrac == null)
			this.igrac = new java.util.HashSet<Igrac>();
		if (!this.igrac.contains(newIgrac)) {
			this.igrac.add(newIgrac);
			newIgrac.setKlub(this);
		}
	}

	/**
	 * @pdGenerated default remove
	 * @param oldIgrac
	 */
	public void removeIgrac(Igrac oldIgrac) {
		if (oldIgrac == null)
			return;
		if (this.igrac != null)
			if (this.igrac.contains(oldIgrac)) {
				this.igrac.remove(oldIgrac);
				oldIgrac.setKlub((Klub) null);
			}
	}

	/** @pdGenerated default removeAll */
	public void removeAllIgrac() {
		if (igrac != null) {
			Igrac oldIgrac;
			for (java.util.Iterator iter = getIteratorIgrac(); iter.hasNext();) {
				oldIgrac = (Igrac) iter.next();
				iter.remove();
				oldIgrac.setKlub((Klub) null);
			}
		}
	}

	/** @pdGenerated default getter */
	public java.util.Collection<Utakmica> getUtakmica() {
		if (utakmica == null)
			utakmica = new java.util.HashSet<Utakmica>();
		return utakmica;
	}

	/** @pdGenerated default iterator getter */
	public java.util.Iterator getIteratorUtakmica() {
		if (utakmica == null)
			utakmica = new java.util.HashSet<Utakmica>();
		return utakmica.iterator();
	}

	/**
	 * @pdGenerated default setter
	 * @param newUtakmica
	 */
	public void setUtakmica(java.util.Collection<Utakmica> newUtakmica) {
		removeAllUtakmica();
		for (java.util.Iterator iter = newUtakmica.iterator(); iter.hasNext();)
			addUtakmica((Utakmica) iter.next());
	}

	/**
	 * @pdGenerated default add
	 * @param newUtakmica
	 */
	public void addUtakmica(Utakmica newUtakmica) {
		if (newUtakmica == null)
			return;
		if (this.utakmica == null)
			this.utakmica = new java.util.HashSet<Utakmica>();
		if (!this.utakmica.contains(newUtakmica))
			this.utakmica.add(newUtakmica);
	}

	/**
	 * @pdGenerated default remove
	 * @param oldUtakmica
	 */
	public void removeUtakmica(Utakmica oldUtakmica) {
		if (oldUtakmica == null)
			return;
		if (this.utakmica != null)
			if (this.utakmica.contains(oldUtakmica))
				this.utakmica.remove(oldUtakmica);
	}

	/** @pdGenerated default removeAll */
	public void removeAllUtakmica() {
		if (utakmica != null)
			utakmica.clear();
	}

	/** @pdGenerated default getter */
	public java.util.Collection<TimskaStatistika> getTimskaStatistika() {
		if (timskaStatistika == null)
			timskaStatistika = new java.util.HashSet<TimskaStatistika>();
		return timskaStatistika;
	}

	/** @pdGenerated default iterator getter */
	public java.util.Iterator getIteratorTimskaStatistika() {
		if (timskaStatistika == null)
			timskaStatistika = new java.util.HashSet<TimskaStatistika>();
		return timskaStatistika.iterator();
	}

	/**
	 * @pdGenerated default setter
	 * @param newTimskaStatistika
	 */
	public void setTimskaStatistika(java.util.Collection<TimskaStatistika> newTimskaStatistika) {
		removeAllTimskaStatistika();
		for (java.util.Iterator iter = newTimskaStatistika.iterator(); iter.hasNext();)
			addTimskaStatistika((TimskaStatistika) iter.next());
	}

	/**
	 * @pdGenerated default add
	 * @param newTimskaStatistika
	 */
	public void addTimskaStatistika(TimskaStatistika newTimskaStatistika) {
		if (newTimskaStatistika == null)
			return;
		if (this.timskaStatistika == null)
			this.timskaStatistika = new java.util.HashSet<TimskaStatistika>();
		if (!this.timskaStatistika.contains(newTimskaStatistika))
			this.timskaStatistika.add(newTimskaStatistika);
	}

	/**
	 * @pdGenerated default remove
	 * @param oldTimskaStatistika
	 */
	public void removeTimskaStatistika(TimskaStatistika oldTimskaStatistika) {
		if (oldTimskaStatistika == null)
			return;
		if (this.timskaStatistika != null)
			if (this.timskaStatistika.contains(oldTimskaStatistika))
				this.timskaStatistika.remove(oldTimskaStatistika);
	}

	/** @pdGenerated default removeAll */
	public void removeAllTimskaStatistika() {
		if (timskaStatistika != null)
			timskaStatistika.clear();
	}

}