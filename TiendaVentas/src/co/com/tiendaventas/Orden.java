package co.com.tiendaventas;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Orden {
	
	private int idOrden;	
	private Producto productos[];
	private static int contadorOrdenes;
	private int contadorProductos;
	private static final int MAX_PRODUCTOS = 10;
	
	public Orden(){
		this.idOrden = ++Orden.contadorOrdenes;
		this.productos = new Producto[Orden.MAX_PRODUCTOS];
	}
	
	
	public void agregarProducto( Producto producto ) {
		if( this.contadorProductos < Orden.MAX_PRODUCTOS ) {
			this.productos[this.contadorProductos++] = producto;
		}else {
			System.out.println("Maximo de productos superado!");
		}
	}
	
	public double calcularTotal(){		
		double total = 0;
		
		for (int i = 0; i < this.contadorProductos; i++) {
			//Producto produto = this.productos[i];
			total += this.productos[i].getPrecio();
		}
		return total;		
	}
	
	
	public void mostrarOrden(){
		DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
		simbolos.setDecimalSeparator(',');		
		DecimalFormat df = new DecimalFormat("#.###");
		StringBuilder sb = new StringBuilder();
		double total = this.calcularTotal();
		String sTotal = df.format(total);
		
		if( sTotal.length() == 4 ) {
			sTotal = sTotal.substring(0,1)+"."+sTotal.substring(1);			
		}else if( sTotal.length() == 6 ) {
			sTotal = sTotal.substring(0,3)+","+sTotal.substring(3);
		}else if( sTotal.length() >= 7 ) {
			sTotal = sTotal.substring(3)+","+sTotal.substring(6);
		}
		
		sb.append("{ ID Orden: ").append(this.idOrden);
		sb.append(" Total Orden: ").append(sTotal);
		
		
		sb.append(" }");
		System.out.println(sb.toString());
	}	
	
}
