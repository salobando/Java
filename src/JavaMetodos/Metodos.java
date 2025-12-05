package JavaMetodos;

public class Metodos {

    //modificador-tiporetorno-nombre-parametros
    public static double calcularIntereses(double capital,double tasas, int tiempo){
        return capital*(tasas/100)*tiempo;
    }

    public static void validarEmail(String email){
        if(email.length()>5 && email.contains("@") && email.contains(".")){
            System.out.println("Ingrese email valido");
        }
    }

    public static String validarPassword(String passsword){
        if(passsword.length()>=0){
            return "password correcta";
        }
        return "password incorrecta";
    }

}
