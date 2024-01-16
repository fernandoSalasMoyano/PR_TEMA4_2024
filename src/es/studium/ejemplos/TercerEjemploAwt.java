package es.studium.ejemplos;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class TercerEjemploAwt
{
//	Variables y objetos
	Frame ventana = new Frame("Título de la ventana");
	Label lblNombre = new Label("Nombre: ");
	Label lblApellidos = new Label("Apellidos: ");
	TextField txtNombre = new TextField(20);
	TextField txtApellidos = new TextField(20);
	Button btnAceptar = new Button("Aceptar");
	Button btnCancelar = new Button("Cancelar");
	
	public TercerEjemploAwt()
	{
		ventana.setTitle("Formulario");
		// Establecer Distribución
		ventana.setLayout(new GridLayout(3,2) );
		
		ventana.add(lblNombre);
		txtNombre.setEchoChar('*');
		ventana.add(txtNombre);
		ventana.add(lblApellidos);
		ventana.add(txtApellidos);

		ventana.add(btnAceptar);
		ventana.add(btnCancelar);
		
		ventana.setSize(300,110);
		ventana.setBackground(Color.red);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);// Centrar la ventana en  la pantalla
		ventana.setVisible(true);
	}

	public static void main(String[] args)
	{
		new TercerEjemploAwt();
	}

}
