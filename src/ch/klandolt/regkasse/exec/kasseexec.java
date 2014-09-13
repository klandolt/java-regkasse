package ch.klandolt.regkasse.exec;
import ch.klandolt.regkasse.kasse.kasse;

public class kasseexec {

	public static void main(String[] args) {
		
		
		
		kasse migrokasse = new kasse(1000);
		System.out.println("Aktueller Kassenstand: " + migrokasse.getKassenstand());
		
		migrokasse.betragerfassen(2.50);
		migrokasse.betragerfassen(1.20);
		migrokasse.betragerfassen(2.30);
		migrokasse.betragerfassen(34.30);
		migrokasse.betragerfassen(20);

		System.out.println("Aktueller Kassenstand: " + migrokasse.getKassenstand());
		System.out.println("Aktueller Total: " + migrokasse.getTotal());
		
		
		//Bezahlen
		
		System.out.println("Rueckgeld: " + migrokasse.zahlungerfassen(100));
		
		System.out.println("Aktueller Kassenstand: " + migrokasse.getKassenstand());
		


		

	}

}
