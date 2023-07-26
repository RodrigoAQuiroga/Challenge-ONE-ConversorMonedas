package funciones_atributos;

import java.math.BigDecimal;

public class Atributos_Calculo {

	
	// Cotización por defecto 24/7/23 Arg. Fuente: BNA

	private BigDecimal dolarCompra = new BigDecimal("271.2000");
	private BigDecimal euroCompra = new BigDecimal ("299.0251");
	private BigDecimal libraCompra = new BigDecimal ("349.0344");
	private BigDecimal wonCompra = new BigDecimal ("4.70"); // Fuente Google
	private BigDecimal yenCompra = new BigDecimal ("2"); // BNA: Cotización cada 100 unidades

	private BigDecimal dolarVenta = new BigDecimal ("271.6000");
	private BigDecimal euroVenta = new BigDecimal ("300.1452");
	private BigDecimal libraVenta = new BigDecimal ("350.3640");
	private BigDecimal wonVenta = new BigDecimal ("0.21"); // Fuente Google
	private BigDecimal yenVenta = new BigDecimal ("2"); //

	// Getters and Setters
	public BigDecimal getDolarCompra() {
		return dolarCompra;
	}

	public BigDecimal getEuroCompra() {
		return euroCompra;
	}

	public BigDecimal getLibraCompra() {
		return libraCompra;
	}

	public BigDecimal getWonCompra() {
		return wonCompra;
	}

	public BigDecimal getYenCompra() {
		return yenCompra;
	}

	public BigDecimal getDolarVenta() {
		return dolarVenta;
	}

	public BigDecimal getEuroVenta() {
		return euroVenta;
	}

	public BigDecimal getLibraVenta() {
		return libraVenta;
	}

	public BigDecimal getWonVenta() {
		return wonVenta;
	}

	public BigDecimal getYenVenta() {
		return yenVenta;
	}
	
	

}
