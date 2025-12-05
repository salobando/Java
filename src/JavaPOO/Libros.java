package JavaPOO;

public class Libros {
        String titulo;
        String autor;
        boolean leido;

        public Libros(){
        }

        public Libros(String titulo, String autor){
            this.titulo = titulo;
            this.autor = autor;
            this.leido = false;
        }

        void mostrarInfo(){
            System.out.println(titulo + " de "+ autor +" leido: " + leido);
        }

        void mostrarComoLeido(){

        }
}
