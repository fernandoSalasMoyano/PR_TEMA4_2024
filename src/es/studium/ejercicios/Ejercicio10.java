package es.studium.ejercicios;

import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.TextField;

public class Ejercicio10
{
	Frame ventana = new Frame("Tres en raya");
	TextField txtCampo1 = new TextField();
	TextField txtCampo2 = new TextField();
	TextField txtCampo3 = new TextField();
	TextField txtCampo4 = new TextField();
	TextField txtCampo5 = new TextField();
	TextField txtCampo6 = new TextField();
	TextField txtCampo7 = new TextField();
	TextField txtCampo8 = new TextField();
	TextField txtCampo9 = new TextField();
	GridBagConstraints restricciones = new GridBagConstraints();
	
	public Ejercicio10()
	{
		ventana.setResizable(false);
		ventana.setSize(300, 300);
		ventana.setLayout(new GridBagLayout());
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);
		
		//Comunes
		restricciones.weightx = 1.0;
		restricciones.weighty = 1.0;
		restricciones.gridheight = 1;
		restricciones.gridwidth = 1;
		restricciones.fill = GridBagConstraints.BOTH;
		
		//Particulares
		restricciones.gridx = 0;
		restricciones.gridy = 0;
		ventana.add(txtCampo1, restricciones);

		restricciones.gridx = 1;
		ventana.add(txtCampo2, restricciones);

		restricciones.gridx = 2;
		ventana.add(txtCampo3, restricciones);
		
		restricciones.gridx = 0;
		restricciones.gridy = 1;
		ventana.add(txtCampo4, restricciones);
		
		restricciones.gridx = 1;
		ventana.add(txtCampo5, restricciones);
		
		restricciones.gridx = 2;
		ventana.add(txtCampo6, restricciones);
		
		restricciones.gridx = 0;
		restricciones.gridy = 2;
		ventana.add(txtCampo7, restricciones);
		
		restricciones.gridx = 1;
		ventana.add(txtCampo8, restricciones);
		
		restricciones.gridx = 2;
		ventana.add(txtCampo9, restricciones);

	}
	
	public static void main(String[] args)
	{
		new Ejercicio10();
	}

}
