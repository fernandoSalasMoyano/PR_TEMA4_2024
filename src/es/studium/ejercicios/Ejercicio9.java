package es.studium.ejercicios;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class Ejercicio9
{
	Frame ventana = new Frame("Agenda");
	MenuBar barraMenu = new MenuBar();
	
	Menu menuCitas = new Menu("Agenda de Citas");
	Menu menuEventos = new Menu("Eventos");
	Menu menuDirecciones = new Menu("Libreta de direcciones");

	// Elementos de citas
	MenuItem mniAñadirCita = new MenuItem("Añadir Cita");
	MenuItem mniEliminarCita = new MenuItem("Eliminar Cita");
	MenuItem mniConsultarCita = new MenuItem("Consultar Cita");
	MenuItem mniModificarCita = new MenuItem("Modificar Cita");

	// Elementos de eventos
	MenuItem mniAñadirEvento = new MenuItem("Añadir Evento");
	MenuItem mniEliminarEvento = new MenuItem("Eliminar Evento");
	MenuItem mniConsultarEvento = new MenuItem("Consultar Evento");
	MenuItem mniModificarEvento = new MenuItem("Modificar Evento");
	
	// Elementos de direcciones
	MenuItem mniAñadirDireccion = new MenuItem("Añadir Evento");
	MenuItem mniEliminarDireccion = new MenuItem("Eliminar Evento");
	MenuItem mniConsultarDireccion = new MenuItem("Consultar Evento");
	MenuItem mniModificarDireccion = new MenuItem("Modificar Evento");
	Ejercicio9()
	{
		ventana.setVisible(true);
		ventana.setSize(400, 200);
		ventana.setLayout(new FlowLayout());
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setMenuBar(barraMenu);
		menuCitas.add(mniAñadirCita);
		menuCitas.add(mniEliminarCita);
		menuCitas.add(mniConsultarCita);
		menuCitas.add(mniModificarCita);
		menuEventos.add(mniAñadirEvento);
		menuEventos.add(mniEliminarEvento);
		menuEventos.add(mniConsultarEvento);
		menuEventos.add(mniModificarEvento);
		menuDirecciones.add(mniAñadirDireccion);
		menuDirecciones.add(mniEliminarDireccion);
		menuDirecciones.add(mniConsultarDireccion);
		menuDirecciones.add(mniModificarDireccion);
		
		barraMenu.add(menuCitas);
		barraMenu.add(menuEventos);
		barraMenu.add(menuDirecciones);
	}

	public static void main(String[] args)
	{
		new Ejercicio9();
	}

}
