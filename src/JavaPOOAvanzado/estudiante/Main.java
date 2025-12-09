package JavaPOOAvanzado.estudiante;

public class Main {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante();
        Estudiante est2 = new Estudiante("Nico", "Munevar", 1234);

        //est2.nombre;
        System.out.println(est2.nombre);
        System.out.println("El nombre del estudiante es: "+ est2.getNombre());

        est1.setNombre("sofi");
        est1.setApellido("salas");
        est1.setCodigo(25014);

        System.out.println("El nombre del estudiante es: "+ est1.getNombre());
        System.out.println("El apellido del estudiante es: "+ est1.getApellido());
        System.out.println("El codigo del estudiante es: "+ est1.getCodigo());
    }
}
