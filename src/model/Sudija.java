package model;

/** @pdOid eb3bd330-a409-45f7-838d-fe83b86e1c49 */
public class Sudija extends Osoba {
   /** @pdRoleInfo migr=no name=Utakmica assc=association3 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Utakmica> utakmica;
   
   
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
   
   /** @pdGenerated default setter
     * @param newUtakmica */
   public void setUtakmica(java.util.Collection<Utakmica> newUtakmica) {
      removeAllUtakmica();
      for (java.util.Iterator iter = newUtakmica.iterator(); iter.hasNext();)
         addUtakmica((Utakmica)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newUtakmica */
   public void addUtakmica(Utakmica newUtakmica) {
      if (newUtakmica == null)
         return;
      if (this.utakmica == null)
         this.utakmica = new java.util.HashSet<Utakmica>();
      if (!this.utakmica.contains(newUtakmica))
         this.utakmica.add(newUtakmica);
   }
   
   /** @pdGenerated default remove
     * @param oldUtakmica */
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

}
