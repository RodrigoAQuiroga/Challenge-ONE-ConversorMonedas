package funciones_atributos;



import javax.swing.JOptionPane;

public class Calculos_Por_Defecto extends Calculos_CompraVenta{	
	
	//Calculos con Cotización por Defecto
	
	Calculos_CompraVenta monedas = new Calculos_CompraVenta();
	
	public void ConvertirMonedas(char[] minput) {
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"Compra de Dólar", "Compra de Euro", "Compra de Libras","Compra de Yen","Compra de Won Coreano","Venta de Dólar", "Venta de Euro", "Venta de Libras","Venta de Yen","Venta de Won Coreano"}, 
    			"Seleccion")).toString();
	
    	 switch(opcion) {
    	 //Compras
         case "Compra de Dólar":
         	monedas.compraDolar(minput);
         	break;
         case "Compra de Euro":
          	monedas.compraEuro(minput);
          	break;
         case "Compra de Libras":
          	monedas.compraLibra(minput);
          	break;
         case "Compra de Yen":
          	monedas.compraYen(minput);
          	break;
         case "Compra de Won Coreano":
          	monedas.compraWon(minput);
          	break;
          	
          	//Ventas
          	
         case "Venta de Dólar":
          	monedas.ventaDolar(minput);
          	break;
          case "Venta de Euro":
           	monedas.ventaEuro(minput);
           	break;
          case "Venta de Libras":
           	monedas.ventaLibra(minput);
           	break;
          case "Venta de Yen":
           	monedas.ventaYen(minput);
           	break;
          case "Venta de Won Coreano":
           	monedas.ventaWon(minput);
           	break;
         	
        
         }      
     }
         
 }