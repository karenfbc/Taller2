package uniandes.dpoo.taller2.modelo;

import java.io.File;

public class Pedido {

	private static int numeroPedidos;
	
	private int idPedido;
	
	private String nombreCliente;
	
	private String direccionCliente;
	
	public Pedido(String nombreCliente, String direccionCliente) {
		
	}
	
	public int getIdPedido() {
		return idPedido;
		
	}
	
	public void agregarProducto(Producto nuevoItem) {
		
	}
	
	private int getPrecioNetoPedido() {
		return 0;
		
	}
	
	private int getPecioTotalPedido() {
		return 0;
		
	}
	
	private int getPrecioIVAPedido() {
		return 0;
		
	}
	
	private String generarTextoFcatura() {
		return null;
		
	}
	
	public void guardarFactura(File archivo) {
		
	}
}
