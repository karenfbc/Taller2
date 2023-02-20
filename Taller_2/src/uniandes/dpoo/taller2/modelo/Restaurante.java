package uniandes.dpoo.taller2.modelo;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.BufferedReader;

public class Restaurante {
	
	public Restaurante() {
	}
	
	public void iniciarPedido(String nombreCliente, String direccionCliente) {
	}
	
	public void cerrarYGuardarPedido() {
		
	}
	
	public Pedido getPedidoEnCurso() {
		return null;
		
	}
	
	public ArrayList<Producto> getMenuBase(){
		return null;
		
	}
	
	public ArrayList<Ingrediente> getIngredientes(){
		return null;
		
	}
	
	public void cargarInformacionRestaurante(File archivoIngredientes, File archivoMenu, File archivoCombos) {
		cargarIngredientes(archivoIngredientes);
		cargarMenu(archivoMenu);
		cargarCombos(archivoCombos);
	}
	
	private void cargarIngredientes(File archivoIngredientes) {
		Map<String,String> ingredientesMap = new HashMap <String, String>();
		
		String ruta = archivoIngredientes.getAbsolutePath();
		
		Scanner file = new Scanner(ruta);
		
		String linea;
		
		while(file.hasNextLine()) {
			linea = file.nextLine();
			System.out.println(linea);
		}
		
	}
	
	private void cargarMenu(File archivoMenu) {
		Map<String,String> MenuMap = new HashMap <String, String>();
		
		String ruta = archivoMenu.getAbsolutePath();
		
		Scanner file = new Scanner(ruta);
		
		String linea;
		
		while(file.hasNextLine()) 
		{
			linea = file.nextLine();
			System.out.println(linea);
		}
	}
	
	private void cargarCombos(File archivoCombos) {
		
		String ruta = archivoCombos.getAbsolutePath();
		
		Scanner file = new Scanner(ruta);
		
		String linea;
		
		while(file.hasNextLine()) 
		{
			linea = file.nextLine();
			System.out.println(linea);
			
			
		}
		
	}
}
