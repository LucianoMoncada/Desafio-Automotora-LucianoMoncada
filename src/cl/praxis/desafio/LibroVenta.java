package cl.praxis.desafio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LibroVenta {
    private String nombreVenta;
    private String fechaVenta;

    // Constructor con parámetros para inicializar los atributos
    public LibroVenta(String nombreVenta, String fechaVenta) {
        this.nombreVenta = nombreVenta;
        this.fechaVenta = fechaVenta;
    }

    // Getters y Setters para los atributos
    public String getNombreVenta() {
        return nombreVenta;
    }

    public void setNombreVenta(String nombreVenta) {
        this.nombreVenta = nombreVenta;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public boolean guardarVenta(Cliente cliente, Vehiculo vehiculo) {
        File directorio = new File("ficheros");
        if (!directorio.exists()) {
            directorio.mkdirs();
        }

        File archivoVenta = new File(directorio, nombreVenta + ".txt");
        if (!archivoVenta.exists()) {
            try {
                archivoVenta.createNewFile();
                try (PrintWriter pw = new PrintWriter(new FileWriter(archivoVenta))) {
                    // Se declara la variable fechaNumerica
                    long fechaNumerica;
                    try {
                        // Se intenta convertir la fecha de "DDMMAAAA" a un número
                        fechaNumerica = Long.parseLong(fechaVenta);
                    } catch (NumberFormatException e) {
                        System.out.println("Formato de fecha inválido para conversión numérica: " + fechaVenta);
                        // SE retorna false si la conversión falla
                        return false;
                    }

                    pw.println("Patente del vehículo: " + vehiculo.getPatente());
                    pw.println("Edad del cliente: " + cliente.getEdad());
                    pw.println("Fecha de la fenta: " + fechaNumerica); // Guarda como número
                    pw.println("Nombre de la venta: " + nombreVenta);
                    return true;
                }
            } catch (IOException e) {
                System.out.println("Error al crear o escribir en el archivo: " + e.getMessage());
            }
        } else {
            System.out.println("Error: El archivo ya existe.");
        }
        return false;
    }

}

