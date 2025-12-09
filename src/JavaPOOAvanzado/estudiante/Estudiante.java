package JavaPOOAvanzado.estudiante;

public class Estudiante {
    public String nombre;
    private String apellido;
    private int codigo;

    public Estudiante(){
    }

    public Estudiante(String nombre, String apellido, int codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        if (codigo<0){
            //System.out.println("valor incorrecto");
            throw new IllegalArgumentException("El cod no debe ser menor a 0");
        }
        this.codigo = codigo;
    }

    public void mostrarNombre(){
        System.out.println("mi nombre es: "+nombre);
    }
}
