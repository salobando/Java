package JavaBasicos;

public class Operadores {
    public static void operadores(){
        boolean tieneDinero = true;
        boolean tieneTarjeta = true;
        boolean estaHaciedoFrio = true;
        //AND
        boolean puedeComprar = tieneDinero && tieneTarjeta;

        int edad= 15;
        boolean puedeEntrar = (edad >= 18) && estaHaciedoFrio;
        estaHaciedoFrio = false;
        boolean puedeEntrar2 = (edad >= 18) || estaHaciedoFrio;
    }
}
