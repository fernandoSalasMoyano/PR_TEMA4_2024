package es.studium.ejercicios;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextField;

public class Ejercicio11
{
	Frame ventana = new Frame("Mi calculadora");
	GridBagConstraints restricciones = new GridBagConstraints();
	Button btnBoton0 = new Button("0");
	Button btnBoton1 = new Button("1");
	Button btnBoton2 = new Button("2");
	Button btnBoton3 = new Button("3");
	Button btnBoton4 = new Button("4");
	Button btnBoton5 = new Button("5");
	Button btnBoton6 = new Button("6");
	Button btnBoton7 = new Button("7");
	Button btnBoton8 = new Button("8");
	Button btnBoton9 = new Button("9");
	Button btnBotonCE = new Button("CE");
	Button btnBotonDivision = new Button("/");
	Button btnBotonMultiplicacion = new Button("*");
	Button btnBotonResta = new Button("-");
	Button btnBotonSuma = new Button("+");
	Button btnBotonPunto = new Button(".");
	Button btnBotonIgual = new Button("=");
	TextField txtTexto = new TextField();



	
	public Ejercicio11() 
	{
		ventana.setLayout(new GridBagLayout());
		
		//Comunes
		restricciones.fill = GridBagConstraints.BOTH;
		restricciones.weightx = 1.0;
		restricciones.weighty = 1.0;

		//Particulares
		restricciones.gridx = 0;
		restricciones.gridy = 0;
		restricciones.gridwidth = 4;
		txtTexto.setEnabled(false);
		ventana.add(txtTexto, restricciones);
		
		restricciones.gridy = 1;
		restricciones.gridwidth = 1;
		ventana.add(btnBotonCE, restricciones);
		
		restricciones.gridx = 1;
		ventana.add(btnBotonDivision, restricciones);

		restricciones.gridx = 2;
		ventana.add(btnBotonMultiplicacion, restricciones);
		
		restricciones.gridx = 3;
		ventana.add(btnBotonResta, restricciones);
		
		restricciones.gridx = 0;
		restricciones.gridy = 2;
		ventana.add(btnBoton7, restricciones);
		
		restricciones.gridx = 1;
		restricciones.gridy = 2;
		ventana.add(btnBoton8, restricciones);
		
		restricciones.gridx = 2;
		restricciones.gridy = 2;
		ventana.add(btnBoton9, restricciones);
		
		restricciones.gridx = 3;
		restricciones.gridy = 2;
		restricciones.gridheight = 2;
		ventana.add(btnBotonSuma, restricciones);

		restricciones.gridx = 0;
		restricciones.gridy = 3;
		restricciones.gridheight = 1;
		ventana.add(btnBoton4, restricciones);
		
		restricciones.gridx = 1;
		ventana.add(btnBoton5, restricciones);
		
		restricciones.gridx = 2;
		ventana.add(btnBoton6, restricciones);
		
		restricciones.gridx = 0;
		restricciones.gridy = 4;
		ventana.add(btnBoton1, restricciones);
		
		restricciones.gridx = 1;
		ventana.add(btnBoton2, restricciones);
		
		restricciones.gridx = 2;
		ventana.add(btnBoton3, restricciones);
		
		restricciones.gridx = 3;
		restricciones.gridy = 4;
		restricciones.gridheight = 2;
		ventana.add(btnBotonIgual, restricciones);
		
		restricciones.gridx = 0;
		restricciones.gridy = 5;
		restricciones.gridwidth = 2;
		restricciones.gridheight = 1;
		ventana.add(btnBoton0, restricciones);
		
		restricciones.gridwidth = 1;
		restricciones.gridx = 2;
		ventana.add(btnBotonPunto, restricciones);
		
		
		ventana.setSize(350,250);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Ejercicio11();
	}

}
