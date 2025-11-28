package FlujodeControl;

import LabJavaOperadores.ValidadorPerfilUsuario;

public class Main {
    public static void main(String[] args) {
        int stockDisponible = 50;
        int cantSolicitada = 3;

        System.out.println("\n 1. IF");

        if(cantSolicitada <= stockDisponible){
            System.out.println("Puede continuar con la compra");
        }
        System.out.println("Siguiente paso de la compra");

        //!metodo aplicartarifa envio
        ProcesarPedido.aplicarTarifaEnvio(100,true);
        ProcesarPedido.aplicarTarifaEnvio(60,false);
        ProcesarPedido.aplicarTarifaEnvio(120,false);

        //!metodo manejarEstado envio
        ProcesarPedido.manejarEstadoPedido("creado");

    }
}
