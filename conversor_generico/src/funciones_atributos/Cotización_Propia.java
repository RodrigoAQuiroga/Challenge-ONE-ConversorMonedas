package funciones_atributos;

import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JOptionPane;

public class Cotización_Propia {
	
	public BigDecimal compraPropia;
	public BigDecimal ventaPropia;
	public BigDecimal valorPropio;
	
	public BigDecimal ventaCotizada(char [] venta, char [] compra, char[] valor) {

		// BigDecimal resultado = pesos * getDolarCompra();
		

		compraPropia = new BigDecimal(compra);
		ventaPropia = new BigDecimal(venta);
		valorPropio = new BigDecimal(valor);
		
		
		System.out.println(ventaPropia);
		System.out.println(compraPropia);
		System.out.println(valorPropio);
		
		

		BigDecimal resultado = ventaPropia.multiply(valorPropio);
		
		

		System.out.println(resultado);
		JOptionPane.showMessageDialog(null, "Venta: " + ventaPropia + " de la Moneda Cotizada, puedes venderlos a $ " + resultado
				+ " pesos (Cotización para la Venta: " + ventaPropia + ")");
		return resultado;

	}

	

	public BigDecimal compraCotizada(char [] venta, char [] compra, char[] valor) {

		compraPropia = new BigDecimal(compra);
		ventaPropia = new BigDecimal(venta);
		valorPropio = new BigDecimal(valor);
		
		System.out.println(ventaPropia);
		System.out.println(compraPropia);
		System.out.println(valorPropio);
		

		BigDecimal resultado = valorPropio.divide(compraPropia, 3,RoundingMode.FLOOR);		
		
		System.out.println(resultado);
		JOptionPane.showMessageDialog(null, "Compra: " + valorPropio + " pesos, se pueden comprar " + resultado
				+ " de la Moneda Cotizada (Cotización para la Compra: " + compraPropia + ")");

		return resultado;
	}
	
}
