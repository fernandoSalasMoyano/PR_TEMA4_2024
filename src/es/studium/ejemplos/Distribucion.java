package es.studium.ejemplos;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextArea;
import java.awt.TextField;

public class Distribucion
{
	Frame ventana = new Frame("Ejemplo GridBagLayout");
	GridBagConstraints constraints = new GridBagConstraints();
	TextArea txtArea = new TextArea("Area texto");
	Button btnBoton1 = new Button ("Botón 1");
	Button btnBoton2 = new Button ("Botón 2");
	Button btnBoton3 = new Button ("Botón 3");
	Button btnBoton4 = new Button ("Botón 4");
	TextField txtCampo = new TextField ("Campo texto");


	
	public Distribucion()
	{
		ventana.setLayout (new GridBagLayout());
		//Establecer restricciones
		constraints.gridx = 0;
		constraints.gridy = 0;
		constraints.gridwidth = 2;
		constraints.gridheight = 2;
		constraints.weighty = 1.0;
		constraints.fill = GridBagConstraints.BOTH;
		//Aplicar un componente
		//Añadir el componente
		ventana.add(txtArea, constraints);
		constraints.fill = GridBagConstraints.NONE;

		
		constraints.gridx = 2;
//		constraints.gridy = 0;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.anchor = GridBagConstraints.NORTHEAST;
		ventana.add(btnBoton1, constraints);

		
		//constraints.gridx = 2;
		constraints.gridy = 1;
		constraints.anchor = GridBagConstraints.NORTH;

		ventana.add(btnBoton2, constraints);
		
		constraints.gridx = 0;
		constraints.gridy = 2;
		constraints.anchor = GridBagConstraints.SOUTHWEST;

		ventana.add(btnBoton3, constraints);
		constraints.weighty = 0.0;

		
		constraints.gridx = 2;
		//constraints.gridy = 2;
		constraints.anchor = GridBagConstraints.SOUTHEAST;
		ventana.add(btnBoton4, constraints);
		
		constraints.gridx = 1;
		constraints.gridy = 2;
		constraints.weightx = 1.0;
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.anchor = GridBagConstraints.SOUTH;
		ventana.add(txtCampo, constraints);
		
		
		ventana.setSize(550,250);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}
	public static void main(String[]args)
	{
		new Distribucion();
	}
}
