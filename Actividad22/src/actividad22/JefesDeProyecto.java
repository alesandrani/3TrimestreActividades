package actividad22;

public class JefesDeProyecto extends Empleados {
	private double incentivo;

	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}

	@Override
	public double sueldoTotal() {
		double salarioTotal = this.getSueldoBase()+ this.getIncentivo();
		return salarioTotal;
	}
	
 
}
