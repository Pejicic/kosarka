package model;

import java.util.List;


public class Igrac extends Osoba {
   
   private int brDresa;
 
   private int visina;
  
   private Pozicija pozicija;
   
   
   public java.util.List<StatistikaIgraca> statistikaIgraca;
   
   public Klub klub;
   
   
   
   public java.util.List<StatistikaIgraca> getStatistikaIgraca() {
      if (statistikaIgraca == null)
         statistikaIgraca = new java.util.Vector<StatistikaIgraca>();
      return statistikaIgraca;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorStatistikaIgraca() {
      if (statistikaIgraca == null)
         statistikaIgraca = new java.util.Vector<StatistikaIgraca>();
      return statistikaIgraca.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newStatistikaIgraca */
   public void setStatistikaIgraca(java.util.List<StatistikaIgraca> newStatistikaIgraca) {
      removeAllStatistikaIgraca();
      for (java.util.Iterator iter = newStatistikaIgraca.iterator(); iter.hasNext();)
         addStatistikaIgraca((StatistikaIgraca)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newStatistikaIgraca */
   public void addStatistikaIgraca(StatistikaIgraca newStatistikaIgraca) {
      if (newStatistikaIgraca == null)
         return;
      if (this.statistikaIgraca == null)
         this.statistikaIgraca = new java.util.Vector<StatistikaIgraca>();
      if (!this.statistikaIgraca.contains(newStatistikaIgraca))
         this.statistikaIgraca.add(newStatistikaIgraca);
   }
   
   /** @pdGenerated default remove
     * @param oldStatistikaIgraca */
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
   public Igrac() {
	super();
}

public Igrac(int brDresa, int visina, Pozicija pozicija, List statistikaIgraca,
		Klub klub) {
	super();
	this.brDresa = brDresa;
	this.visina = visina;
	this.pozicija = pozicija;
	this.statistikaIgraca = statistikaIgraca;
	this.klub = klub;
}

/** @pdGenerated default parent getter */
   public Klub getKlub() {
      return klub;
   }
   
   /** @pdGenerated default parent setter
     * @param newKlub */
   public void setKlub(Klub newKlub) {
      if (this.klub == null || !this.klub.equals(newKlub))
      {
         if (this.klub != null)
         {
            Klub oldKlub = this.klub;
            this.klub = null;
            oldKlub.removeIgrac(this);
         }
         if (newKlub != null)
         {
            this.klub = newKlub;
            this.klub.addIgrac(this);
         }
      }
   }

}