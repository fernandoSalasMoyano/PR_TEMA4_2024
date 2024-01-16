package es.studium.ejercicios;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Ejercicio8
{
	Frame ventana = new Frame("Menú");
	MenuBar barraMenu = new MenuBar();
	
	Menu menuArticulos = new Menu("Artículos");
	Menu menuClientes = new Menu("Clientes");
	Menu menuFacturas = new Menu("Facturas");
	
	// Elementos de Articulos
	MenuItem mniArticuloNuevo = new MenuItem("Nuevo Artículo");
	MenuItem mniArticuloEliminar = new MenuItem("Eliminar Artículo");
	MenuItem mniArticuloConsultar = new MenuItem("Consultar Artículo");
	
	// Elementos de Clientes
	MenuItem mniClienteNuevo = new MenuItem("Nuevo Cliente");
	MenuItem mniClienteEliminar = new MenuItem("Eliminar Cliente");
	MenuItem mniClienteConsultar = new MenuItem("Consultar Cliente");
	
	// Elementos de Facturas
	MenuItem mniFacturaNueva = new MenuItem("Nueva Factura");
	MenuItem mniFacturaConsultar = new MenuItem("Consultar Factura");

	Ejercicio8()
	{
		ventana.setVisible(true);
		ventana.setSize(400, 200);
		ventana.setLayout(new FlowLayout());
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setMenuBar(barraMenu);
		menuArticulos.add(mniArticuloNuevo);
		menuArticulos.add(mniArticuloEliminar);
		menuArticulos.add(mniArticuloConsultar);
		menuClientes.add(mniClienteNuevo);
		menuClientes.add(mniClienteEliminar);
		menuClientes.add(mniClienteConsultar);
		menuFacturas.add(mniFacturaNueva);
		menuFacturas.add(mniFacturaConsultar);
		
		barraMenu.add(menuArticulos);
		barraMenu.add(menuClientes);
		barraMenu.add(menuFacturas);
	}
	
	public static void main(String[] args)
	{
		new Ejercicio8();
	}

}
