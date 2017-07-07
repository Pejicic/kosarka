package model;
import java.util.*;

/** @pdOid b4c50a41-2eee-488a-84cd-b57f1dfbc0a2 */
public class Sut {
   /** @pdOid 64cee611-21a7-47ad-96a0-39a10f112a6e */
   private Pokusaj pokusaj;
   /** @pdOid 12ef8342-f191-4a9f-a996-f8b6c4bf9953 */
   private Kvadrant kvadrant;
   /** @pdOid c54d3846-de13-474e-85a0-1c3bbb26229a */
   private int poen;
   
   public Sut(){}
   
   
	public Sut(Pokusaj pokusaj, Kvadrant kvadrant, int poen) {
		this();
		this.pokusaj = pokusaj;
		this.kvadrant = kvadrant;
		this.poen = poen;
	}
	public Pokusaj getPokusaj() {
		return pokusaj;
	}
	public void setPokusaj(Pokusaj pokusaj) {
		this.pokusaj = pokusaj;
	}
	public Kvadrant getKvadrant() {
		return kvadrant;
	}
	public void setKvadrant(Kvadrant kvadrant) {
		this.kvadrant = kvadrant;
	}
	public int getPoen() {
		return poen;
	}
	public void setPoen(int poen) {
		this.poen = poen;
	}

   
   
}