package es.studium.ejercicios;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class Ejercicio10
{
	Frame ventana = new Frame("Tres en raya");
	Button btnPrimero = new Button();
	Button btnSegundo = new Button();
	Button btnTercero = new Button();
	Button btnCuarto = new Button();
	Button btnQuinto = new Button();
	Button btnSexto = new Button();
	Button btnSeptimo = new Button();
	Button btnOctavo = new Button();
	Button btnNoveno = new Button();
	
	public Ejercicio10()
	{
		ventana.setResizable(false);
		ventana.setSize(300, 300);
		ventana.setLayout(new GridLayout(3,3));
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null);		
		
		ventana.add(btnPrimero);
		ventana.add(btnSegundo);
		ventana.add(btnTercero);
		ventana.add(btnCuarto);
		ventana.add(btnQuinto);
		ventana.add(btnSexto);
		ventana.add(btnSeptimo);
		ventana.add(btnOctavo);
		ventana.add(btnNoveno);
	}
	
	public static void main(String[] args)
	{
		new Ejercicio10();
	}
}
