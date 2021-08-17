package co.com.tiendaventas;

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
	
	
	public void agregarProducto(Producto producto[]) {
		
	}
	
	public Double calcularTotal(Double total){		
		
		return null;
	}
	
	
	public void mostrarOrden(){
		
	}	
	
}
