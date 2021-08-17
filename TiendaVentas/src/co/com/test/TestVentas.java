package co.com.test;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import co.com.tiendaventas.Orden;
import co.com.tiendaventas.Producto;

public class TestVentas {
	
	public static void main(String[] args) {
		
		Orden orden1 = new Orden();
		Producto p1 = new Producto("Celular",750000D);
		Producto p2 = new Producto("Cargador",15000D);
		Producto p3 = new Producto("Audifono",10000D);
		Producto p4 = new Producto("Forro",1200D);
		orden1.agregarProducto(p1);
		orden1.agregarProducto(p2);
		orden1.agregarProducto(p3);
		orden1.agregarProducto(p4);	
		orden1.mostrarOrden();
		
		
		/*
		char charToAdd1 = 'E';
        char charToAdd2 = 'g';
        
        String alex = "Alex got Grade  in the School";
        String bob = "While Bob ot Grade C";
        
        String alexResult = alex.substring(0, 15) + charToAdd1 +alex.substring(15);
        String bobResult = bob.substring(0, 10) + charToAdd2 + bob.substring(10);
        System.out.println(alexResult);
        System.out.println(bobResult);
*/
	    
		
	}
	
}
