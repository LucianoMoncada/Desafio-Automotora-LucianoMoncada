package cl.praxis.desafio;

public class Minibus extends Bus {

    private String tipoViaje;

      public Minibus(String color, String patente, int cantidadDeAsientos, String tipoViaje) {
        super(color, patente, cantidadDeAsientos);
        this.tipoViaje = tipoViaje;
    }

    public String getTipoViaje() {
        return tipoViaje;
    }

    public void setTipoViaje(String tipoViaje) {
        this.tipoViaje = tipoViaje;
    }

    public void imprimeBus() {
        System.out.println("color" + super.getColor());
        System.out.println("patente" + super.getPatente());
        System.out.println("cantidad de asientos" + super.getCantidadDeAsientos());
        System.out.println("tipo viaje" + getTipoViaje());
    }

}
