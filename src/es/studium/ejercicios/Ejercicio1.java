package es.studium.ejercicios;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class Ejercicio1
{
	Frame ventana = new Frame("Par/Impar");
	TextField txtText = new TextField(10);
	Button btnCalcular = new Button("Calcular");
	Label lblParImpar = new Label("      ");
	
	
	public Ejercicio1()
	{
		ventana.setSize(400, 80);
		ventana.add(txtText);
		ventana.add(btnCalcular);
		ventana.add(lblParImpar);
		ventana.setVisible(true);
		ventana.setLayout(new FlowLayout());
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);
	}
	public static void main(String[] args)
	{
		new Ejercicio1();
	}
}
