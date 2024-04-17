package actividad22;

public class Empleados {
	private int id;
	private String DNI;
	private String nombre;
	private double sueldoBase;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
	public double sueldoTotal() {
		double salarioTotal = this.sueldoBase;
		return salarioTotal;
	}

}
