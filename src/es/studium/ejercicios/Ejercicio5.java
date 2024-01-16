package es.studium.ejercicios;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Ejercicio5
{

	Frame ventana = new Frame("Vehículos");
	Label lblPrimera = new Label("Tipo de motorización: ");
	Label lblSegunda = new Label("Número de puertas: ");
	Label lblTercera = new Label("Pintura metalizada: ");
	Button btnCalcular = new Button("Calcular presupuesto");
	CheckboxGroup chgMotor = new CheckboxGroup();
	Checkbox chkGasolina = new Checkbox("Gasolina", false, chgMotor);
	Checkbox chkDiesel = new Checkbox("Diésel", false, chgMotor);
	Checkbox chkHibrido = new Checkbox("Híbrido", false, chgMotor);
	Checkbox chkElectrico = new Checkbox("Eléctrico", false, chgMotor);
	CheckboxGroup chgPuertas = new CheckboxGroup();
	Checkbox chk3Puertas = new Checkbox("3 Puertas", false, chgPuertas);
	Checkbox chk4Puertas = new Checkbox("4 Puertas", false, chgPuertas);
	Checkbox chk5Puertas = new Checkbox("5 Puertas", false, chgPuertas);
	CheckboxGroup chgMetalizada = new CheckboxGroup();
	Checkbox chkSi= new Checkbox("Sí", false, chgMetalizada);
	Checkbox chkNo = new Checkbox("No", false, chgMetalizada);

	
	public Ejercicio5()
	{
		ventana.setSize(430, 200);
		ventana.setResizable(false);
		ventana.setLocationRelativeTo(null);
		ventana.setLayout(new FlowLayout());
		ventana.add(lblPrimera);
		ventana.add(chkGasolina);
		ventana.add(chkDiesel);
		ventana.add(chkHibrido);
		ventana.add(chkElectrico);
		ventana.add(lblSegunda);
		ventana.add(chk3Puertas);
		ventana.add(chk4Puertas);
		ventana.add(chk5Puertas);
		ventana.add(lblTercera);
		ventana.add(chkSi);
		ventana.add(chkNo);
		ventana.add(btnCalcular);
		
		ventana.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Ejercicio5();
	}

}
