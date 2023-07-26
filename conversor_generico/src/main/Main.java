package main;




import javax.swing.JOptionPane;

import funciones_atributos.Calculos_Por_Defecto;
import funciones_atributos.Cotización_Propia;

public class Main {

	public static void main(String[] args) {

		// Calculos por defecto

		Calculos_Por_Defecto monedas = new Calculos_Por_Defecto();

		while (true) {

			String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ", "Menu",
					JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Compraventa de Moneda (Cotización por defecto)",
							"Compraventa de Moneda (Mi cotización)" },
					"Seleccion")).toString();

			switch (opciones) {
			case "Compraventa de Moneda (Cotización por defecto)":
				String input = JOptionPane.showInputDialog(
						"Ingresa la cantidad de dinero (Pesos o Moneda Extranjera) que deseas convertir (Compra o venta) \n (Cotización según BNA 24/7/2023): ");
				
					char[] Minput = input.toCharArray();
					monedas.ConvertirMonedas(Minput);

					int confirmar = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
					if (JOptionPane.OK_OPTION == confirmar) {
						
						System.out.println("Selecciona opción Afirmativa");
					} else {
						JOptionPane.showMessageDialog(null, "Volver al principio");
					}
				
				break;

			// SegundoCaso

			case "Compraventa de Moneda (Mi cotización)":

				String inputCompra = JOptionPane.showInputDialog("Ingresa el valor de la cotización de compra");
				String inputVenta = JOptionPane.showInputDialog("Ingresa el valor de la cotización de venta");
				String inputPesos = JOptionPane.showInputDialog("Ingresa el valor del numero a convertir");

				
					char[] inputC = inputCompra.toCharArray();
					char[] inputV = inputVenta.toCharArray();
					char[] inputP = inputPesos.toCharArray();

					Cotización_Propia cotizacion_propia = new Cotización_Propia();

					cotizacion_propia.compraCotizada(inputV, inputC, inputP);
					cotizacion_propia.ventaCotizada(inputV, inputC, inputP);

					int confirmacion = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
					if (JOptionPane.OK_OPTION == confirmacion) {
						System.out.println("Selecciona opción Afirmativa");
					} else {
						JOptionPane.showMessageDialog(null, "Volver al principio");
					}
				
				break;
			}
		}

	}

	
}