package ch.klandolt.regkasse.buissness.geld;

import java.math.BigDecimal;

public class Muenze {
	
	private BigDecimal wert;
	private String name;
	
	
	public Muenze(double betrag, String bezeichnung)
	{
		this.wert = BigDecimal.valueOf(betrag);
		
		this.name = bezeichnung;
		
	}


	public BigDecimal getWert() {
		return wert;
	}
	
	

}
