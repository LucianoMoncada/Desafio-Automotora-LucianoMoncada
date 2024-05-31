package cl.praxis.desafio;

public class Taxi extends Vehiculo {

    private int valorPasaje;

    public Taxi (String color, String patente, int valorPasaje) {
        super(color, patente);
        this.valorPasaje = valorPasaje;
    }

    public int getValorPasaje() {
        return valorPasaje;
    }

    public void setValorPasaje(int valorPasaje) {
        this.valorPasaje = valorPasaje;
    }

    public int pagarPasaje(int monto) {
        int vuelto = 0;
        if(monto >= getValorPasaje()){
            vuelto = getValorPasaje() - monto;
        }
        return vuelto;
    }

}
