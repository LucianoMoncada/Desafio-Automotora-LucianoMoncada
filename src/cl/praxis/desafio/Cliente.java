package cl.praxis.desafio;

public class Cliente  extends Persona {

    private int edad;

    public Cliente(String rut, String nombre, String edad, int edad2) {
        super(rut, nombre, edad);
        this.edad = edad2;
    }

}
