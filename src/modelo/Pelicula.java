public class Pelicula {
    String nombre;
    int fechaDeLanzamiento;
    double evaluacion;
    boolean incluidoEnElPlanBasico;
    String sinopsis;
    int tiempoDeDuracionEnMinutos;

    void muestraFichaTecnica(){
        System.out.println("***FICHA TECNICA***");
        System.out.println(nombre);
        System.out.println("Año: " + fechaDeLanzamiento);
        System.out.println("Duración: " + tiempoDeDuracionEnMinutos + " minutos");
    }
}
