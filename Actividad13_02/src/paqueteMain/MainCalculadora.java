package paqueteMain;

import java.util.Scanner;

import actividad13.Calculadora;

public class MainCalculadora {

	public static void main(String[] args) {
		int opcion = 0;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("........................");
			System.out.println("........................");
			System.out.println("Calculadora basica ");
			System.out.println("--Para sumar pulse 1");
			System.out.println("--Para restar pulse 2");
			System.out.println("--Para multiplicar pulse 3");
			System.out.println("--Para dividir pulse 4");
			opcion = sc.nextInt();
			System.out.println("Introduce un numero");
			double operador1 = sc.nextDouble();
			System.out.println("Introdue otro numero");
			double operador2 = sc.nextDouble();
			switch (opcion) {
			case 1:
				System.out.println("Resultado: " + Calculadora.sumar(operador1, operador2));
				break;
			case 2:
				System.out.println("Resultado: " + Calculadora.restar(operador1, operador2));
				break;
			case 3:
				System.out.println("Resultado: " + Calculadora.multiplicar(operador1, operador2));
				break;
			case 4:
				System.out.println("Resultado: " + Calculadora.dividir(operador1, operador2));
				break;
			default:
				System.out.println("Opcion incorrecta, vuelve a intentarlo");
				break;
			}
		} while (opcion != 4);
	}

}
