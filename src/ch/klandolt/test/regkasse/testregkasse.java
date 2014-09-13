package ch.klandolt.test.regkasse;

import ch.klandolt.regkasse.kasse.kasse;
import junit.framework.TestCase;

public class testregkasse extends TestCase {

	public void testbetrag(){			//Test Methoden müssen mit test beginnen!!!
		kasse migroskasse = new kasse();
		
		migroskasse.betragerfassen(20);
		migroskasse.betragerfassen(20);
		migroskasse.betragerfassen(20);
		migroskasse.betragerfassen(20);
		migroskasse.betragerfassen(20);
		
		double total = migroskasse.getTotal();
		
		System.out.println(total);
		
		assertEquals("Falscher Betrage zusammen Rechnung", 100.0, total);
	}
	
	
	public void testRückgeld(){			//Test Methoden müssen mit test beginnen!!!
		kasse migroskasse = new kasse();
		
		migroskasse.betragerfassen(20);
		migroskasse.betragerfassen(20);
		migroskasse.betragerfassen(20);
		migroskasse.betragerfassen(20);
		
		
		
		double rueckgeld = migroskasse.zahlungerfassen(100);
		
		System.out.println(rueckgeld);
		
		assertEquals("Falscher Betrage zusammen Rechnung", 20.0, rueckgeld);
	}
	
	public void testKassenstand(){			//Test Methoden müssen mit test beginnen!!!
		kasse migroskasse = new kasse(100);
		
		migroskasse.betragerfassen(20);
		migroskasse.betragerfassen(20);
		
		
		
		migroskasse.zahlungerfassen(100);
		
		double kassenstand = migroskasse.getKassenstand();
		
		System.out.println(kassenstand);
		
		assertEquals("Falscher Betrage zusammen Rechnung", 140.0, kassenstand);
	}
	
	
}
