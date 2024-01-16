package es.studium.ejercicios;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Ejercicio6
{
	Frame ventana = new Frame("Provincias Españolas");
	Choice choProvincias = new Choice();
	
	
	
	Ejercicio6()
	{
		String[] provincias = {"Seleccione una provincia","Álava","Albacete","Alicante","Almería","Asturias","Ávila","Badajoz","Barcelona","Burgos","Cáceres",
				"Cádiz","Cantabria","Castellón","Ciudad Real","Córdoba","La Coruña","Cuenca","Gerona","Granada","Guadalajara",
				"Guipúzcoa","Huelva","Huesca","Islas Baleares","Jaén","León","Lérida","Lugo","Madrid","Málaga","Murcia","Navarra",
				"Orense","Palencia","Las Palmas","Pontevedra","La Rioja","Salamanca","Segovia","Sevilla","Soria","Tarragona",
				"Santa Cruz de Tenerife","Teruel","Toledo","Valencia","Valladolid","Vizcaya","Zamora","Zaragoza"};
		for(String provincia: provincias)
		{
			choProvincias.add(provincia);
		}
		
		ventana.setSize(300, 100);
		ventana.setLayout(new FlowLayout());
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.add(choProvincias);
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Ejercicio6();
	}
}
