package co.com.prueba1;

public class Producto {
	
	private String nombre;
	private Double precio;
	private int idProducto;
	private static int contProducto;
	
	public Producto() {
		this.idProducto = ++Producto.contProducto;
		
	}
	
	public Producto(String nombre, Double precio) {
		this.nombre = nombre;
		this.precio= precio;
	}
	
	public int getIdProducto() {
		return idProducto;
	}
	
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
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
		sb.append("ID Producto: ").append(this.idProducto);
		sb.append(" Nombre: ").append(this.nombre);
		sb.append(" Precio: ").append(this.precio);
		return super.toString();
	}
	
	

}
