package co.com.tiendaventas;

import java.text.DecimalFormat;

public class Producto {
	
	private final int idProducto;
	private String nombre;
	private Double precio;
	private static int contProducto;
	
	private Producto() {
		this.idProducto = ++Producto.contProducto;
		
	}
	
	public Producto(String nombre, Double precio) {
		this();
		this.nombre = nombre;
		this.precio= precio;
	}
	
	public int getIdProducto() {
		return idProducto;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		StringBuilder sb  = new StringBuilder();
		DecimalFormat df = new DecimalFormat("#,###.###");
		double total = this.precio;
		String sTotal = df.format(total);
		sb.append("\n [ID Producto: ").append(this.idProducto);
		sb.append(", Nombre: ").append(this.nombre);
		sb.append(", Precio: ").append(sTotal);
		sb.append(" ]");
		return sb.toString();
	}
	

}
