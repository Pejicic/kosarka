package model;


import java.util.*;


public class Trener extends Osoba {
   
   public Klub klub;
   public java.util.Collection<StatistikaTrenera> statistikaTrenera;
   
   public Trener(String ime, String prezime, String drzavljanstvo, int godiste,
		Klub klub, Collection statistikaTrenera) {
	super(ime, prezime, drzavljanstvo, godiste);
	this.klub = klub;
	this.statistikaTrenera = statistikaTrenera;
}


   
   
   public Klub getKlub() {
	return klub;
}




public void setKlub(Klub klub) {
	this.klub = klub;
}




public Trener() {
	super();
}




public Trener(String ime, String prezime, String drzavljanstvo, int godiste) {
	super(ime, prezime, drzavljanstvo, godiste);
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
   
   /** @pdGenerated default setter
     * @param newStatistikaTrenera */
   public void setStatistikaTrenera(java.util.Collection<StatistikaTrenera> newStatistikaTrenera) {
      removeAllStatistikaTrenera();
      for (java.util.Iterator iter = newStatistikaTrenera.iterator(); iter.hasNext();)
         addStatistikaTrenera((StatistikaTrenera)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newStatistikaTrenera */
   public void addStatistikaTrenera(StatistikaTrenera newStatistikaTrenera) {
      if (newStatistikaTrenera == null)
         return;
      if (this.statistikaTrenera == null)
         this.statistikaTrenera = new java.util.HashSet<StatistikaTrenera>();
      if (!this.statistikaTrenera.contains(newStatistikaTrenera))
         this.statistikaTrenera.add(newStatistikaTrenera);
   }
   
   /** @pdGenerated default remove
     * @param oldStatistikaTrenera */
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