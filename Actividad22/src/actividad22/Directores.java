package actividad22;

import java.util.ArrayList;

public class Directores extends Empleados {
	private ArrayList<Empleados> listaEmpleados;

	@Override
	public double sueldoTotal() {
		double salarioTotal = 0.0;
		salarioTotal = listaEmpleados.size() * 100;
		return salarioTotal;
	}

}
