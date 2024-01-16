package es.studium.ejercicios;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class Ejercicio3
{
	Frame ventana = new Frame("Conversión de temperaturas");
	Label lblCelsius = new Label("Celsius:");
	Label lblFarenheit = new Label("Farenheit:");
	TextField txtPrimero = new TextField();
	TextField txtSegundo = new TextField();
	Button btnPrimero = new Button("Celsius a Farenheit");
	Button btnSegundo = new Button("Farenheit a Celsius");

	public Ejercicio3() 
	{
		ventana.setVisible(true);
		ventana.setSize(500,200);
		ventana.setResizable(false);
		ventana.setLayout(new GridLayout(3,2));
		ventana.setLocationRelativeTo(null);
		ventana.add(lblCelsius);
		ventana.add(txtPrimero);
		ventana.add(lblFarenheit);
		ventana.add(txtSegundo);
		ventana.add(btnPrimero);
		ventana.add(btnSegundo);
	}
	public static void main(String[] args)
	{
		new Ejercicio3();
	}
}
