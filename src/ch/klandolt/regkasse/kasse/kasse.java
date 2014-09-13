package ch.klandolt.regkasse.kasse;

/**
 * Klasse für die Kassen Funktionen
 * 

*/
public class kasse {

	//Attribute
	private double kassenstand;
	private double total;
	private double retourgeld;
	
	/**
	 * default Constructor Kassenstand auf 0 setzen
	 * 
	 */
	public kasse()
	{
		kassenstand = 0;
		total = 0;
		retourgeld = 0;
	}
	
	/**
	 * Spezial Constructor um den Kassenstand zu setzen über Parameter inhalt
	 * @param inhalt Start Kassenstand setzen
	 */
	public kasse(double inhalt)
	{
		kassenstand = inhalt;
		total = 0;
		retourgeld = 0;
	}

	/**
	 * Abfragen des Kassenstands
	 * @return Stand Geldbetrag in der Kasse als Double
	 */
	public double getKassenstand() {
		return kassenstand;
	}
	
	public void betragerfassen(double betrag)
	{
		total = total + betrag;
		
	}

	/**
	 * Abfragen des Aktuellen Totals
	 * @return total als double Wert
	 */
	
	public double getTotal() {
		return total;
	}
	
	/**
	 * Hier wierd die Zahlung erasst und das Rückgeld berechnet und zurück gegeben
	 * @param betrag
	 * @return retourgeld
	 */
	public double zahlungerfassen(double betrag)
	{
		
		if(betrag > total)
		{
			retourgeld = betrag - total;
			kassenstand = kassenstand + total;
		}else if (betrag == total) {
			retourgeld = 0;
			kassenstand = kassenstand + total;
		}else {
			retourgeld = betrag - total;
			//TODO: Bessere Lösung für zuwenig bezahlen
		}
		
		
		
		return retourgeld;
	}
	
	
	
	
	
	
	
	
}
