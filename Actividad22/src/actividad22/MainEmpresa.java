package actividad22;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEmpresa {
	 private static ArrayList<Empleados> listaEmpleados = new ArrayList<>();
	 private static Scanner scanner = new Scanner(System.in);
	 
	public static void main(String[] args) {
		int opcion;
		        do {
		            System.out.println("*Menú:*");
		            System.out.println("1. Dar de alta empleado");
		            System.out.println("2. Mostrar empleados");
		            System.out.println("3. Calcular salario de empleado");
		            System.out.println("4. Calcular costes totales de la empresa");
		            System.out.println("5. Salir del programa");
		            System.out.print("Seleccione una opción: ");
		            opcion = scanner.nextInt();
		            scanner.nextLine(); 
		            switch(opcion) {
		            case 1:
	                    darDeAltaEmpleado();
	                    break;
	                case 2:
	                    mostrarEmpleados();
	                    break;
	                case 3:
	                    calcularSalarioEmpleado();
	                    break;
	                case 4:
	                    calcularCostesTotales();
	                    break;
	                case 5:
	                    System.out.println("Saliendo del programa...");
	                    break;
	                default:
	                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
		            }
		        } while (opcion != 5);
		    }

	private static void calcularCostesTotales() {
		// TODO Auto-generated method stub
		
	}

	private static void calcularSalarioEmpleado() {
		// TODO Auto-generated method stub
		
	}

	private static void mostrarEmpleados() {
		// TODO Auto-generated method stub
		
	}

	private static void darDeAltaEmpleado() {
		// TODO Auto-generated method stub
		
	
}
}
