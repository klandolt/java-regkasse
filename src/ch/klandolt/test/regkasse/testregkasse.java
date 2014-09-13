package ch.klandolt.test.regkasse;

import ch.klandolt.regkasse.buissness.geld.Muenze;
import ch.klandolt.regkasse.buissness.kasse.kasse;
import junit.framework.TestCase;

public class testregkasse extends TestCase {

	public void testbetrag() { // Test Methoden müssen mit test beginnen!!!
		kasse migroskasse = new kasse();

		migroskasse.betragerfassen(20);
		migroskasse.betragerfassen(20);
		migroskasse.betragerfassen(20);
		migroskasse.betragerfassen(20);
		migroskasse.betragerfassen(20);

		double total = migroskasse.getTotal();

		// System.out.println(total);

		assertEquals("Falscher Betrage zusammen Rechnung", 100.0, total);
	}

	public void testRückgeld() { // Test Methoden müssen mit test beginnen!!!
		kasse migroskasse = new kasse();

		migroskasse.betragerfassen(20);
		migroskasse.betragerfassen(20);
		migroskasse.betragerfassen(20);
		migroskasse.betragerfassen(20);

		double rueckgeld = migroskasse.zahlungerfassen(100);

		// System.out.println(rueckgeld);

		assertEquals("Falscher Betrage zusammen Rechnung", 20.0, rueckgeld);
	}

	public void testKassenstand() { // Test Methoden müssen mit test beginnen!!!
		kasse migroskasse = new kasse(100);

		migroskasse.betragerfassen(20);
		migroskasse.betragerfassen(20);

		double retourgeld = migroskasse.zahlungerfassen(50);

		double kassenstand = migroskasse.getKassenstand();

		System.out.println(kassenstand);
		System.out.println(retourgeld);

		assertEquals("Falscher Betrage zusammen Rechnung", 140.0, kassenstand);
	}

	public void testeinkaufmuenz() { // Test Methoden müssen mit test
										// beginnen!!!
		// Geld erstellen
		Muenze einfraenkler = new Muenze(1.0, "Einfraenkler");
		Muenze zweifraenkler = new Muenze(2.0, "Zweifraenkler");
		Muenze fuenffraenkler = new Muenze(5.0, "Fuenffraenkler");

		kasse migroskasse = new kasse(100);

		migroskasse.betragerfassen(2.0);
		migroskasse.betragerfassen(2.0);

		double retourgeld = migroskasse.zahlungerfassen(fuenffraenkler);

		double kassenstand = migroskasse.getKassenstand();

		System.out.println(kassenstand);
		System.out.println(retourgeld);

		assertEquals("Falsches Rueckgeld: ", 1.0, retourgeld);
		assertEquals("Falscher Kassenstand: ", 104.0, kassenstand);
	}

}
