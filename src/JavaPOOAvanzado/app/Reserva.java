package JavaPOOAvanzado.app;

public class Reserva {
    private int pasajeros;

    public  Reserva(){
    }

    public Reserva(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        if (pasajeros <= 0){
            throw new IllegalArgumentException("Minimo un pasajero");
        }
        this.pasajeros = pasajeros;
    }
}
