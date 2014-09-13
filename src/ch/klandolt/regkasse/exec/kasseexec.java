package ch.klandolt.regkasse.exec;

import ch.klandolt.regkasse.buissness.geld.Muenze;
import ch.klandolt.regkasse.buissness.kasse.kasse;

public class kasseexec {

	public static void main(String[] args) {
		
		//Geld erstellen
		Muenze einfraenkler = new Muenze(1.0, "Einfraenkler");
		Muenze zweifraenkler = new Muenze(2.0, "Zweifraenkler");
		Muenze fuenffraenkler = new Muenze(5.0, "Fuenffraenkler");
		
		
		
		
		kasse migrokasse = new kasse(1000);
		System.out.println("Aktueller Kassenstand: " + migrokasse.getKassenstand());
		
		migrokasse.betragerfassen(2.50);
		
		System.out.println("Aktueller Total: " + migrokasse.getTotal());
		
		double rueckgeld = migrokasse.zahlungerfassen(fuenffraenkler);
		
		System.out.println("Rückgeld: " + rueckgeld);

		System.out.println("Aktueller Kassenstand: " + migrokasse.getKassenstand());
		
		
		
		//Bezahlen
		
		//System.out.println("Rueckgeld: " + migrokasse.zahlungerfassen(100));
		
		//System.out.println("Aktueller Kassenstand: " + migrokasse.getKassenstand());
		


		

	}

}
