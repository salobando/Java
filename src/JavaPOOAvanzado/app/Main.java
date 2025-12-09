package JavaPOOAvanzado.app;

public class Main {
    public static void main(String[] args) {

        Reserva reserva1 = new Reserva();
        try{
            reserva1.setPasajeros(0);
        }catch (IllegalArgumentException e){
            System.out.println("La cantidad para crear la reserva debe ser: " + e.getMessage());
        }
        System.out.println("Si ven, si sigue funcionando");

//        try{
//            int num = 10/0;
//        }catch(ArithmeticException e){
//            System.out.println("Error: no puedo dividir entre 0");
//        }
//        System.out.println("la app sigue funcionando despues de la excepcion");
    }
}
