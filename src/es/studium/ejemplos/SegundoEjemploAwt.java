package es.studium.ejemplos;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

public class SegundoEjemploAwt
{
	// Variables y objetos
		Frame ventana = new Frame("Título de la ventana");
//		ventana.setTitle("Nuevo título");
		Button btnBoton = new Button("Aceptar");
		Button btnBoton2 = new Button("Cancelar");
			
	public SegundoEjemploAwt()
	{
		ventana.setTitle("Nuevo título");
		// Establecer Distribución
		ventana.setLayout(new FlowLayout () );
				
		ventana.add(btnBoton);
		ventana.add(btnBoton2);
				
		ventana.setSize(300,200);
		ventana.setBackground(Color.red);
		ventana.setLocationRelativeTo(null);// Centrar la ventana en  la pantalla
		ventana.setVisible(true);

	}
	public static void main(String[] args)
	{
		new SegundoEjemploAwt();
	}
}
