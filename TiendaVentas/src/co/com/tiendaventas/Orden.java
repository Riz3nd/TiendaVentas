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
		DecimalFormat df = new DecimalFormat("#,###.###");
		StringBuilder sb = new StringBuilder();
		double total = this.calcularTotal();
		String sTotal = df.format(total);
		sb.append("{ID Orden: ").append(this.idOrden);
		sb.append(" Productos de la orden: ");
		for( int i = 0; i< this.contadorProductos ;i++ ) {
			sb.append(this.productos[i].toString());
		}
		sb.append("\n Total de la Orden: $").append(sTotal);
		sb.append(" }");
		System.out.println(sb.toString());
	}	
	
}
