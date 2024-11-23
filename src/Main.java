import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la inmersión java");

        // Inicializar variables de datos de Matrix
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor película del fin del milenio.
                """;

        System.out.println("Película: " + nombre);
        System.out.println("Sinopsis: " + sinopsis);
        System.out.println("Año: " + fechaDeLanzamiento);
        System.out.println("Puntuación: " + evaluacion);
        System.out.println("Incluido en el plan básico: " + incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3)/3;
        System.out.println("Media de la evaluación de Matrix: " + mediaEvaluacion);

        if (fechaDeLanzamiento >= 2023){
            System.out.println("Película popular en el momento");
        } else {
            System.out.println("Película retro que vale la pena ver");
        }

        // Inicializar variables de cálculo de evaluación, hacer loop while
        int i = 0;
        double suma = 0;
        double promedio = 0;
        while (i < 3){
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darías a Matrix: ");
            double numero = teclado.nextDouble();
            suma = suma + numero;
            i ++;
        }
        promedio = suma / 3;
        System.out.println("Promedio de evaluaciones de Matrix calculado por el usuario: " + promedio);
    }
}
