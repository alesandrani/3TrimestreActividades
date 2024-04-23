package actividad23;

import java.util.HashMap;
import java.util.Scanner;

public class _01_HashMap {

	public static void main(String[] args) {
		HashMap <String,String> hashmapAgenda = new HashMap<>();
		Scanner sc = new Scanner(System.in);
        
		while (true) {
            System.out.println("Elige una opción:");
            System.out.println("1. Introducir Persona");
            System.out.println("2. Mostrar Personas");
            System.out.println("3. Buscar Persona por Nombre");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            
            int opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
            case 1: // Introducir Persona
                System.out.println("\nIntroduce la información de la persona:");
                System.out.print("Nombre: ");
                String nombre = sc.nextLine();
                System.out.print("Apellidos: ");
                String apellidos = sc.nextLine();
             // Verificar si el nombre ya existe en el HashMap
                if (hashmapAgenda.containsKey(nombre)&& hashmapAgenda.containsKey(apellidos)) {
                    System.out.println("El nombre ya existe. ¿Quieres sobrescribir? (y/n)");
                    String decision = sc.nextLine();
                    if (!decision.equalsIgnoreCase("y")) {
                        break;
                    }
                }
                System.out.print("Edad: ");
                int edad = sc.nextInt();
                Persona p1 = new Persona(nombre,apellidos,edad);
                hashmapAgenda.put(nombre, apellidos);
                
                System.out.println("\nPersona introducida con éxito.");
                break;
            case 2: // Mostrar Personas
                System.out.println("\nLista de Personas:");
                for (String key : hashmapAgenda.keySet()) {
                    System.out.println(hashmapAgenda.get(key));
                }
                break;
            case 3: // Buscar Persona por Nombre
                if (hashmapAgenda.isEmpty()) {
                    System.out.println("\nEl listín está vacío. No hay personas para buscar.");
                    break;
                }

                System.out.print("\nIntroduce el nombre a buscar: ");
                String nombreBuscar = sc.nextLine();
                
                // Convertir el nombre a buscar a minúsculas para permitir búsquedas más flexibles
                nombreBuscar = nombreBuscar.toLowerCase();
                
                boolean found = false;

                // Buscar en el HashMap
                for (String key : hashmapAgenda.keySet()) {
                    // Compara los nombres ignorando el caso
                    if (key.toLowerCase().equals(nombreBuscar)) {
                        String personaEncontrada = hashmapAgenda.get(key);
                        System.out.println("\nInformación de la persona encontrada:");
                        System.out.println(personaEncontrada);
                        found = true;
                        break;
                    }
                }
                
                if (!found) {
                    System.out.println("\nNo se encontró a nadie con ese nombre.");
                }
                break;
                
            case 4: // Salir
                System.out.println("Saliendo del programa...");
                sc.close();
                return;
                
            default:
                System.out.println("Opción no válida. Por favor, elige otra opción.");
                break;

               
	}
	}
	}
}
