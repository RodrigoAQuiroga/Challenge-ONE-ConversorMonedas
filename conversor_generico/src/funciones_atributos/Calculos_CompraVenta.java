package funciones_atributos;

import java.math.BigDecimal;

import java.math.RoundingMode;


import javax.swing.JOptionPane;

public class Calculos_CompraVenta extends Atributos_Calculo {

	// Metodos para compra y venta por defecto según cotización de BNA 24/7/23

	// Compra: Con x pesos se pueden obtener y dolares
	// Venta: Con x dolares se pueden obtener y pesos

	// Dolares Estadounidenses
	
	

	public BigDecimal ventaDolar(char [] moneda) {

		// BigDecimal resultado = pesos * getDolarCompra();

		BigDecimal monedaExt = new BigDecimal(moneda);
		BigDecimal venta = getDolarVenta();
		
		System.out.println(monedaExt);
		System.out.println(venta);
		
		

		BigDecimal resultado = venta.multiply(monedaExt);
		
		

		System.out.println(resultado);
		JOptionPane.showMessageDialog(null, "Venta: " + monedaExt + "  Dolares, puedes venderlos a $ " + resultado
				+ " pesos (Cotización para la Venta: " + getDolarVenta() + ")");
		return resultado;

	}

	

	public BigDecimal compraDolar(char[] minput) {

		BigDecimal pesosArg = new BigDecimal(minput);
		BigDecimal compra = getDolarCompra();
		
		System.out.println(pesosArg);
		System.out.println(compra);
		

		BigDecimal resultado = pesosArg.divide(compra, 3,RoundingMode.FLOOR);		
		
		System.out.println(resultado);
		JOptionPane.showMessageDialog(null, "Compra: Con " + pesosArg + " pesos, puedes comprar $ " + resultado
				+ " Dolares (Cotización para la Compra: " + getDolarCompra() + ")");

		return resultado;
	}

	// Euros

	public BigDecimal ventaEuro(char [] moneda) {

		BigDecimal monedaExt = new BigDecimal(moneda);
		BigDecimal venta = getEuroCompra();

		BigDecimal resultado = venta.multiply(monedaExt);
		
		System.out.println(resultado);
		JOptionPane.showMessageDialog(null, "Venta: " + monedaExt + " Euros, puedes venderlos a $" + resultado
				+ " pesos  (Cotización para la Venta: " + getEuroVenta() + ")");

		return resultado;
	}

	public BigDecimal compraEuro(char[] minput) {

		BigDecimal pesosArg = new BigDecimal(minput);
		BigDecimal compra = getEuroCompra();

		BigDecimal resultado = pesosArg.divide(compra, 3, RoundingMode.UP);
		
		System.out.println(resultado);
		JOptionPane.showMessageDialog(null, "Compra: Con $" + pesosArg + " pesos, se pueden comprar " + resultado
				+ " Euros (Cotización para la Venta: " + getEuroCompra() + ")");

		return resultado;
	}

	// Libras

	public BigDecimal ventaLibra(char [] moneda) {

		BigDecimal monedaExt = new BigDecimal(moneda);
		BigDecimal venta = getLibraVenta();

		BigDecimal resultado = venta.multiply(monedaExt);
		
		System.out.println(resultado);
		JOptionPane.showMessageDialog(null, "Venta: Con " + monedaExt + " Libras, puedes venderlas a " + resultado
				+ " pesos (Cotización para la Venta: " + getLibraVenta() + ")");

		return resultado;
	}

	public BigDecimal compraLibra(char [] moneda) {

		BigDecimal pesosArg = new BigDecimal(moneda);
		BigDecimal compra = getLibraCompra();

		BigDecimal resultado = pesosArg.divide(compra, 3, RoundingMode.UP);
		System.out.println(resultado);
		JOptionPane.showMessageDialog(null, "Compra: " + pesosArg + " pesos, se pueden comprar " + resultado
				+ " Libras (Cotización para la Compra: " + getLibraCompra() + ")");

		return resultado;
	}

	// Won

	public BigDecimal ventaWon(char [] moneda) {

		BigDecimal monedaExt = new BigDecimal(moneda);
		BigDecimal venta = getWonVenta();

		BigDecimal resultado = venta.multiply(monedaExt);
		
		System.out.println(resultado);
		JOptionPane.showMessageDialog(null, "Venta: Con " + monedaExt + " Won Coreanos, puedes venderlos a" + resultado
				+ " pesos (Cotización para la Venta: " + getWonCompra() + ")");

		return resultado;
	}

	public BigDecimal compraWon(char [] moneda) {

		BigDecimal pesosArg = new BigDecimal(moneda);
		BigDecimal compra = getWonCompra();

		BigDecimal resultado = pesosArg.divide(compra, 3, RoundingMode.UP);
		
		System.out.println(resultado);
		JOptionPane.showMessageDialog(null, "Compra: " + pesosArg + " pesos, se pueden comprar " + resultado
				+ " Won Coreanos (Cotización para la Compra: " + getWonCompra() + ")");

		return resultado;
	}

	// Yen

	public BigDecimal ventaYen(char [] moneda) {

		BigDecimal monedaExt = new BigDecimal(moneda);
		BigDecimal venta = getYenVenta();

		BigDecimal resultado = venta.multiply(monedaExt);
		
		System.out.println(resultado);
		JOptionPane.showMessageDialog(null, "Venta: " + monedaExt + " Yenes, puedes venderlos a" + resultado
				+ " pesos (Cotización para la Venta: " + getYenVenta() + ")");

		return resultado;
	}

	public BigDecimal compraYen(char [] moneda) {

		BigDecimal pesosArg = new BigDecimal(moneda);
		BigDecimal compra = getYenCompra();

		BigDecimal resultado = pesosArg.divide(compra, 3, RoundingMode.UP);
		System.out.println(resultado);
		JOptionPane.showMessageDialog(null, "Compra: Con " + pesosArg + " pesos, se pueden comprar " + resultado
				+ " Yenes (Cotización para la Compra: " + getYenCompra() + ")");

		return resultado;
	}

}
