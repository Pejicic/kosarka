package model;


import java.util.*;

/** @pdOid ae518d7f-86e0-4eec-9315-9cb210e857b3 */
public class StatistikaIgraca {
   /** @pdOid 444ffb9a-54cb-4022-89ef-556478400687 */
   private int minutaza;
   /** @pdOid 197057b9-c309-4b12-aa05-ee9b0eea726a */
   private int indeks;
   /** @pdOid 194b68c6-f34c-4cfb-b807-ea85714b8820 */
   private int asistencije;
   /** @pdOid 6311f0d0-4642-4232-9a07-15c7c872fbc1 */
   private int osvojenaLopta;
   /** @pdOid d2064897-53ca-46b8-9917-7977d35ec2dd */
   private int tehnickaGreska;
   /** @pdOid 1cddb3dd-529d-490f-ae54-0540c0eaa03b */
   private boolean starter;
   /** @pdOid a4b5fa1e-a08a-4fd4-824c-e02523b90448 */
   private boolean aktivnost;
   
   /** @pdRoleInfo migr=no name=Sut assc=association18 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Sut> sut;
   /** @pdRoleInfo migr=no name=IzgubljenaLopta assc=association19 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<IzgubljenaLopta> izgubljenaLopta;
   /** @pdRoleInfo migr=no name=LicneGreske assc=association20 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<LicneGreske> licneGreske;
   /** @pdRoleInfo migr=no name=Skok assc=association22 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<Skok> skok;
   
   public StatistikaIgraca(){}
   
   public StatistikaIgraca(int minutaza, int indeks, int asistencije, int osvojenaLopta, int tehnickaGreska,
		boolean starter, boolean aktivnost, Collection<Sut> sut, Collection<IzgubljenaLopta> izgubljenaLopta,
		Collection<LicneGreske> licneGreske, Collection<Skok> skok) {
	this();
	this.minutaza = minutaza;
	this.indeks = indeks;
	this.asistencije = asistencije;
	this.osvojenaLopta = osvojenaLopta;
	this.tehnickaGreska = tehnickaGreska;
	this.starter = starter;
	this.aktivnost = aktivnost;
	this.sut = sut;
	this.izgubljenaLopta = izgubljenaLopta;
	this.licneGreske = licneGreske;
	this.skok = skok;
}

/** @pdOid 45faea14-355f-44fc-a7b4-7447dbfcd982 */
   public void izracunajIndeks() {
      // TODO: implement
   }
   
   /** @pdOid e90a2ab4-b365-4ee9-9fbe-4f8bc9a2453a */
   public void prikaziStatistiku() {
      // TODO: implement
   }
   
   /** @param sut
    * @pdOid 6469402c-e8c0-4836-8b84-ad20c16d9efa */
   public void dodajSut(Sut sut) {
      // TODO: implement
   }
   
   /** @param sut
    * @pdOid 029e54f3-aa95-4699-9b63-29af1ff16fac */
   public void obrisiSut(Sut sut) {
      // TODO: implement
   }
   
   /** @pdOid 64011c94-8f44-46f1-8bdb-a7598e8d34b5 */
   public void pretraziSuteve() {
      // TODO: implement
   }
   
   /** @param i
    * @pdOid 7db3334a-e2f6-4999-9b65-76394af29023 */
   public void dodajIzgubljenuLoptu(IzgubljenaLopta i) {
      // TODO: implement
   }
   
   /** @param i
    * @pdOid dae48be0-dfff-49c0-9077-23a5ca056816 */
   public void izbrisiIzgubljenuLoptu(IzgubljenaLopta i) {
      // TODO: implement
   }
   
   /** @pdOid 3401ac7e-6ad3-4ef7-9307-6c37ef263cd4 */
   public void pretraziIIzgubljeneLopte() {
      // TODO: implement
   }
   
   /** @param s
    * @pdOid fd5d0e25-2da2-430c-9428-bc988e24f8d0 */
   public void dodajSkok(Skok s) {
      // TODO: implement
   }
   
   /** @param s
    * @pdOid 743d65f1-f6c0-4a37-9c92-72cbff1cdddc */
   public void obrisiSkok(Skok s) {
      // TODO: implement
   }
   
   /** @pdOid 216147b1-7474-4e21-a7ec-cef8f4d4d510 */
   public void pretraziSkokove() {
      // TODO: implement
   }
   
   /** @param l
    * @pdOid baaa26a7-b5bc-474b-adf0-9741a4e4953e */
   public void dodajLicnu(LicneGreske l) {
      // TODO: implement
   }
   
   /** @param l
    * @pdOid 3365ddbd-9e5a-476c-8326-846c4cc36fdd */
   public void obrisiLicnu(LicneGreske l) {
      // TODO: implement
   }
   
   /** @pdOid f0322bba-fbb1-4a83-add6-6f18cc4511f7 */
   public void pretraziLicne() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Sut> getSut() {
      if (sut == null)
         sut = new java.util.HashSet<Sut>();
      return sut;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorSut() {
      if (sut == null)
         sut = new java.util.HashSet<Sut>();
      return sut.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newSut */
   public void setSut(java.util.Collection<Sut> newSut) {
      removeAllSut();
      for (java.util.Iterator iter = newSut.iterator(); iter.hasNext();)
         addSut((Sut)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newSut */
   public void addSut(Sut newSut) {
      if (newSut == null)
         return;
      if (this.sut == null)
         this.sut = new java.util.HashSet<Sut>();
      if (!this.sut.contains(newSut))
         this.sut.add(newSut);
   }
   
   /** @pdGenerated default remove
     * @param oldSut */
   public void removeSut(Sut oldSut) {
      if (oldSut == null)
         return;
      if (this.sut != null)
         if (this.sut.contains(oldSut))
            this.sut.remove(oldSut);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllSut() {
      if (sut != null)
         sut.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<IzgubljenaLopta> getIzgubljenaLopta() {
      if (izgubljenaLopta == null)
         izgubljenaLopta = new java.util.HashSet<IzgubljenaLopta>();
      return izgubljenaLopta;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorIzgubljenaLopta() {
      if (izgubljenaLopta == null)
         izgubljenaLopta = new java.util.HashSet<IzgubljenaLopta>();
      return izgubljenaLopta.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newIzgubljenaLopta */
   public void setIzgubljenaLopta(java.util.Collection<IzgubljenaLopta> newIzgubljenaLopta) {
      removeAllIzgubljenaLopta();
      for (java.util.Iterator iter = newIzgubljenaLopta.iterator(); iter.hasNext();)
         addIzgubljenaLopta((IzgubljenaLopta)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newIzgubljenaLopta */
   public void addIzgubljenaLopta(IzgubljenaLopta newIzgubljenaLopta) {
      if (newIzgubljenaLopta == null)
         return;
      if (this.izgubljenaLopta == null)
         this.izgubljenaLopta = new java.util.HashSet<IzgubljenaLopta>();
      if (!this.izgubljenaLopta.contains(newIzgubljenaLopta))
         this.izgubljenaLopta.add(newIzgubljenaLopta);
   }
   
   /** @pdGenerated default remove
     * @param oldIzgubljenaLopta */
   public void removeIzgubljenaLopta(IzgubljenaLopta oldIzgubljenaLopta) {
      if (oldIzgubljenaLopta == null)
         return;
      if (this.izgubljenaLopta != null)
         if (this.izgubljenaLopta.contains(oldIzgubljenaLopta))
            this.izgubljenaLopta.remove(oldIzgubljenaLopta);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllIzgubljenaLopta() {
      if (izgubljenaLopta != null)
         izgubljenaLopta.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<LicneGreske> getLicneGreske() {
      if (licneGreske == null)
         licneGreske = new java.util.HashSet<LicneGreske>();
      return licneGreske;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorLicneGreske() {
      if (licneGreske == null)
         licneGreske = new java.util.HashSet<LicneGreske>();
      return licneGreske.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newLicneGreske */
   public void setLicneGreske(java.util.Collection<LicneGreske> newLicneGreske) {
      removeAllLicneGreske();
      for (java.util.Iterator iter = newLicneGreske.iterator(); iter.hasNext();)
         addLicneGreske((LicneGreske)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newLicneGreske */
   public void addLicneGreske(LicneGreske newLicneGreske) {
      if (newLicneGreske == null)
         return;
      if (this.licneGreske == null)
         this.licneGreske = new java.util.HashSet<LicneGreske>();
      if (!this.licneGreske.contains(newLicneGreske))
         this.licneGreske.add(newLicneGreske);
   }
   
   /** @pdGenerated default remove
     * @param oldLicneGreske */
   public void removeLicneGreske(LicneGreske oldLicneGreske) {
      if (oldLicneGreske == null)
         return;
      if (this.licneGreske != null)
         if (this.licneGreske.contains(oldLicneGreske))
            this.licneGreske.remove(oldLicneGreske);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllLicneGreske() {
      if (licneGreske != null)
         licneGreske.clear();
   }
   /** @pdGenerated default getter */
   public java.util.Collection<Skok> getSkok() {
      if (skok == null)
         skok = new java.util.HashSet<Skok>();
      return skok;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorSkok() {
      if (skok == null)
         skok = new java.util.HashSet<Skok>();
      return skok.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newSkok */
   public void setSkok(java.util.Collection<Skok> newSkok) {
      removeAllSkok();
      for (java.util.Iterator iter = newSkok.iterator(); iter.hasNext();)
         addSkok((Skok)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newSkok */
   public void addSkok(Skok newSkok) {
      if (newSkok == null)
         return;
      if (this.skok == null)
         this.skok = new java.util.HashSet<Skok>();
      if (!this.skok.contains(newSkok))
         this.skok.add(newSkok);
   }
   
   /** @pdGenerated default remove
     * @param oldSkok */
   public void removeSkok(Skok oldSkok) {
      if (oldSkok == null)
         return;
      if (this.skok != null)
         if (this.skok.contains(oldSkok))
            this.skok.remove(oldSkok);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllSkok() {
      if (skok != null)
         skok.clear();
   }

}