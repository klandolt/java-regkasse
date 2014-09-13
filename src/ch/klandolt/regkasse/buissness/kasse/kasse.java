package ch.klandolt.regkasse.buissness.kasse;

import java.math.BigDecimal;

import ch.klandolt.regkasse.buissness.geld.Muenze;

/**
 * Klasse für die Kassen Funktionen
 * 

*/
public class kasse {

	//Attribute
		
	private BigDecimal bigdecKassenstand;
	private BigDecimal bigdecTotal;
	private BigDecimal bigdecRetourgeld;
	
	
	
	/**
	 * default Constructor Kassenstand auf 0 setzen
	 * 
	 */
	public kasse()
	{
		bigdecKassenstand = BigDecimal.ZERO;
		bigdecTotal = BigDecimal.ZERO;
		bigdecRetourgeld = BigDecimal.ZERO;
		
	}
	
	/**
	 * Spezial Constructor um den Kassenstand zu setzen über Parameter inhalt
	 * @param inhalt Start Kassenstand setzen
	 */
	public kasse(double inhalt)
	{
		bigdecKassenstand = BigDecimal.valueOf(inhalt);
		bigdecTotal = BigDecimal.ZERO;
		bigdecRetourgeld = BigDecimal.ZERO;
		
	}

	/**
	 * Abfragen des Kassenstands
	 * @return Stand Geldbetrag in der Kasse als Double
	 */
	public double getKassenstand() 
	{
		return bigdecKassenstand.setScale(2).doubleValue();
	}
	
	public void betragerfassen(double betrag)
	{
		
		bigdecTotal = BigDecimal.valueOf(bigdecTotal.doubleValue() + betrag);
		
	}

	/**
	 * Abfragen des Aktuellen Totals
	 * @return total als double Wert
	 */
	
	public double getTotal() 
	{
		
		return bigdecTotal.setScale(2).doubleValue();
	}
	
	/**
	 * Hier wierd die Zahlung erasst und das Rückgeld berechnet und zurück gegeben
	 * @param betrag
	 * @return retourgeld
	 */
	public double zahlungerfassen(double betrag)
	{
		
		if(betrag > bigdecTotal.doubleValue())
		{
			bigdecRetourgeld = BigDecimal.valueOf(betrag - bigdecTotal.doubleValue()); 
			
			//bigdecKassenstand.add(bigdecTotal);
			bigdecKassenstand = bigdecKassenstand.add(bigdecTotal);
			
		}else if (betrag == bigdecTotal.doubleValue()) {
			bigdecRetourgeld = BigDecimal.ZERO;
			bigdecKassenstand = bigdecKassenstand.add(bigdecTotal);
			
		}else {
			bigdecRetourgeld = BigDecimal.valueOf(betrag - bigdecTotal.doubleValue());
			//TODO: Bessere Lösung für zuwenig bezahlen
		}
		
				
		return bigdecRetourgeld.setScale(2).doubleValue();
	}
	
	
	public double zahlungerfassen(Muenze muenze)
	{
		
		double betrag = muenze.getWert().doubleValue();
		
		double rueckgeld = zahlungerfassen(betrag);
		
		return rueckgeld;
	}
	
	
	
	
	
	
	
}
