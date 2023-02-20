package uniandes.dpoo.taller2.consola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import uniandes.dpoo.taller2.modelo.Restaurante;

public class Aplicacion {
		
	public void mostrarMenu() 
	{
		System.out.println("************************* menu *************************");
		System.out.println("corral;14000");
		System.out.println("corral queso;16000");
		System.out.println("corral pollo;15000");
		System.out.println("corralita;13000");
		System.out.println("todoterreno;25000");
		System.out.println("1/2 libra;25000");
		System.out.println("especial;24000");
		System.out.println("casera;23000");
		System.out.println("mexicana;22000");
		System.out.println("criolla;22000");
		System.out.println("costeña;20000");
		System.out.println("hawaiana;20000");
		System.out.println("wrap de pollo;15000");
		System.out.println("wrap de lomo;22000");
		System.out.println("ensalada mexicana;20900");
		System.out.println("papas medianas;5500");
		System.out.println("papas grandes;6900");
		System.out.println("papas en casco medianas;5500");
		System.out.println("papas en casco grandes;6900");
		System.out.println("agua cristal sin gas;5000");
		System.out.println("agua cristal con gas;5000");
		System.out.println("gaseosa;5000");
		System.out.println("\nOpciones de la aplicación\n");
		System.out.println("1. Iniciar un nuevo pedido");
		System.out.println("2. Agregar un nuevo elemento a un pedido");
		System.out.println("3. Cerrar un pedido y guardar la factura");
		System.out.println("4. Consultar la información de un pedido por Id");
		System.out.println("5. Salir de la aplicación");
	}
	
	public void iniciarNuevoPedido() 
	{	
	}
	
	public void agregarNuevoElemento() 
	{	
	}
	
	public void cerrarPedido() 
	{	
	}
	
	public void  consultarPedido() 
	{	
	}
	
	public void ejecutarOpcion() { 
	
		System.out.println("Bienvenido al restaurante de hamburguesas");

		boolean continuar = true;
		while (continuar)
		{
			try
			{
				mostrarMenu();
				int opcion_seleccionada = Integer.parseInt(input("Por favor seleccione una opción"));
				if (opcion_seleccionada == 1)
					iniciarNuevoPedido();
				else if (opcion_seleccionada == 2)
					agregarNuevoElemento();
				else if (opcion_seleccionada == 3)
					cerrarPedido();
				else if (opcion_seleccionada == 4)
					consultarPedido();
				else if (opcion_seleccionada == 5)
				{
					System.out.println("Saliendo de la aplicación ...");
					continuar = false;
				}

				else
				{
					System.out.println("Por favor seleccione una opción válida.");
				}
			}

			catch (NumberFormatException e)
			{
				System.out.println("Debe seleccionar uno de los números de las opciones.");
			}
		}
	}
		
		public String input(String mensaje)
		{
			try
			{
				System.out.print(mensaje + ": ");
				BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				return reader.readLine();
			}
			catch (IOException e)
			{
				System.out.println("Error leyendo de la consola");
				e.printStackTrace();
			}
			return null;
		}
		
		public static void main(String[] args) {
			Aplicacion consola = new Aplicacion();
			consola.ejecutarOpcion();

		}
	}

