package FlujodeControl;

public class ProcesarPedido {
    public static void aplicarTarifaEnvio(double valorPedido, boolean esClientePremium) {
        System.out.println("\n 2. Taria con IF- else");
        double costoEnvio = 15;

        if (esClientePremium) {
            System.out.println("Envio gratis");
            costoEnvio = 0;
        } else {
            System.out.println("Vamos a calcular el valor del envio");
            if (valorPedido >= 100) {
                costoEnvio = 5;
                System.out.println("El envio te queda en 5 dolares");
            } else if (valorPedido >= 50) {
                costoEnvio *= 0.5;
                System.out.println("Tiene un descuento de 15% en el envio: " + costoEnvio);
            } else {
                System.out.println("Tu envio seria de 15");
            }
        }
    }

    public static String manejarEstadoPedido(String estadoActual) {
        System.out.println("\n 3. Switch");
        String estado = estadoActual.toUpperCase();
        String mensaje = "";

        switch (estado) {
            case "CREADO" -> {
                System.out.println("El pedido ha sido creado");
                mensaje = "El pedido ha sido creado";
            }
            case "PROCESADO", "PAGADO" -> {
                System.out.println("Procesando el pedido y el pago");
                mensaje = "Procesando el pedido y el pago";
            }
            case "ENVIADO" -> {
                System.out.println("Enviar guia");
                mensaje = "Enviar guia";
            }
            case "ENTREGADO" -> {
                System.out.println("El pedido fue entregado");
                mensaje = "El pedido fue entregado";
            }
            default -> System.out.println("Error del pedido");
        }
        return mensaje;
    }
}
