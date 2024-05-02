import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("\n*****  Bienvenidos a la inmersión en Java  *****\n".toUpperCase());
    
    // Declaración de variables
    int fechaDeLanzamiento = 1999;
    double evaluacion = 4.5;
    boolean incluidoEnElPlanBasico = true;
    String nombre = "Matrix";
    double mediaEvaluacionUsuario = 0;
    // String sinopsis = """
    // La mejor película del fin del milenio
    // """;

    System.out.println("Película: " + nombre);
    System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
    System.out.println("Evaluación: " + evaluacion);
    System.out.println("Plan basico: " + incluidoEnElPlanBasico);
    // System.out.println(sinopsis);

    double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
    System.out.printf("Media de la evaluación de " + nombre + ": %.2f%n", mediaEvaluacion);

    if (fechaDeLanzamiento >= 2024) {
      System.out.println("Película Popular en el momento\n");
    } else {
      System.out.println("Película Retro que vale la pena ver\n");
    }

    
    try (Scanner teclado = new Scanner(System.in)) {
      int x = 0;
      while (x < 3) {
        System.out.print("Ingresa la nota # " + (x + 1) + " que le darías a Matrix: ");

        // Validar que el número sea de tipo decimal, o sino muestra el enunciado
        while (!teclado.hasNextDouble()) {
          System.out.println("Por favor, ingresa un número decimal válido.");
          teclado.next(); // Limpia el búfer del scanner para no tener en cuenta el número errado
        }
        
        double notaMatrix = teclado.nextDouble();
        mediaEvaluacionUsuario += notaMatrix;

        x++;
      }

      System.out
          .printf("La media de la película " + nombre + " calculada por el usuario es: %.2f%n \n", mediaEvaluacionUsuario / 3);

    }  // try Scanner
  }  // public static
}  // class Main
