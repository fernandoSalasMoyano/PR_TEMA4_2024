package es.studium.ejercicios;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class Ejercicio12
{
	Frame ventana = new Frame("Ahorcado");
	Label lblAdivina = new Label("Adivina la palabra secreta: ");
	Label lblIntentos = new Label("Intentos restantes: X de 10");
	Label lblLetras = new Label("Letras probadas: ");
	TextField txtPalabra = new TextField("_ _ _ A _ _ M _ _ _");
	TextField txtProbar = new TextField("Probar con la letra: ");
	TextField txtLetra = new TextField(1);
	TextField txtProbadas = new TextField("E R T X");
	
	Ejercicio12()
	{
		ventana.setVisible(true);
		ventana.setResizable(true);
		ventana.setLayout(new FlowLayout());
		ventana.setLocationRelativeTo(null);
		ventana.setSize(400, 150);
		
		ventana.add(lblAdivina);
		txtPalabra.setEnabled(false);
		ventana.add(txtPalabra);
		txtProbar.setEnabled(false);
		ventana.add(txtProbar);
		ventana.add(txtLetra);
		ventana.add(lblIntentos);
		ventana.add(lblLetras);
		txtProbadas.setEnabled(false);
		ventana.add(txtProbadas);
		
	}
	
	public static void main(String[] args)
	{
		new Ejercicio12();
	}

}
