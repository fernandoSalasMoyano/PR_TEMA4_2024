package es.studium.ejercicios;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.ScrollPane;
import java.awt.List;

public class Ejercicio7
{
	Frame ventana = new Frame("Provincias Españolas");
	ScrollPane scrEquipos = new ScrollPane();
	List listaEquipos = new List();
	
	
	public Ejercicio7()
	{
		String[] Equipos = {"Seleccione un equipo", "Real Madrid","Barça","Iberoestar Tenerife","TD Systems Baskonia","Hereda San Pablo Burgos","Valencia Basket",
				"Club Joventut de Badalona","Unicaja","UCAM Murcia","Baxi Manresa","MoraBanc Andorra","Herbalife Gran Canaria","Monbus Obradoiro",
				"Movistar Estudiantes","Casademont Zaragoza","Urbas Fuenlabrada","Coosur Real Betis","RETAbet Bilbao Basket","Acunsa Gipuzkoa Basket"};
		
		for(String equipo: Equipos)
		{
			listaEquipos.add(equipo);
		}
		
		scrEquipos.add(listaEquipos);
		ventana.setSize(300, 150);
		ventana.setLayout(new FlowLayout());
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.add(scrEquipos);
		scrEquipos.setSize(170, 100);
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Ejercicio7();
	}
}
