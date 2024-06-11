import cl.praxis.desafio.Cliente;
import cl.praxis.desafio.LibroVenta;
import cl.praxis.desafio.Vehiculo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Ingrese el nombre del cliente:");
        String nombreCliente = scanner.nextLine();
        System.out.println("Ingrese la edad del cliente:");
        int edadCliente = scanner.nextInt();
        scanner.nextLine();

        //Ingresar datos de vehiculo//
        String patenteVehiculo;
        while (true) {
            System.out.println("Ingrese la patente del vehículo (ej. XXXX22):");
            patenteVehiculo = scanner.nextLine();
            if (patenteVehiculo.matches("^[A-Z]{4}\\d{2}$")) {
                // Salir del bucle si la patente tiene el formato correcto
                break;
            } else {
                System.out.println("Formato de patente inválido. Por favor, ingrese la patente en el formato correcto.");
            }
        }

        // Se ingresan datos de la venta //
        System.out.println("Ingrese el nombre de la venta:");
        String nombreVenta = scanner.nextLine();

        // Se valida la fecha de la venta //

        System.out.println("Ingrese la fecha de la venta (DDMMAAAA):");
        String fechaVenta= "";
        boolean fechaValida = false; // Variable de control para la validez de la fecha

        while (!fechaValida) { // Continúa mientras la fecha no sea válida
            fechaVenta = scanner.nextLine();
            if (fechaVenta.matches("\\d{8}")) {
                // Si la fecha es válida, cambia el estado y sale del bucle
                fechaValida = true;
            } else {
                System.out.println("Formato de fecha inválido. Por favor, ingrese la fecha en el formato DDMMAAAA.");
            }
        }

        Cliente cliente = new Cliente(nombreCliente, edadCliente);
        Vehiculo vehiculo = new Vehiculo(patenteVehiculo);


        LibroVenta libroVenta = new LibroVenta(nombreVenta, fechaVenta);
        boolean archivoCreado = libroVenta.guardarVenta(cliente, vehiculo);
        if (archivoCreado) {
            System.out.println("El archivo ha sido creado exitosamente.");
        } else {
            System.out.println("No se pudo crear el archivo.");
        }

        scanner.close();
    }
}


