package modelo;

import java.util.Scanner;

public class Principal {
  
  // METODO
  public void muestraElMenu() {

    int opcion = 0;
    try (Scanner teclado = new Scanner(System.in)) {
      while (opcion != 3) {  // mientras que opcion sea diferente a 9
        
          String menu = """
            Bienvenido(a) a Screenmatch
            1. Registrar nueva pelicula  
            2. Registrar nueva serie
            3. Salir          
          """;
          System.out.println(menu);
          opcion = teclado.nextInt();
          teclado.nextLine();  // permite leer cadenas de texto

          switch (opcion) {
            case 1:
              System.out.print("Ingrese el nombre de la pelicula: ");
              String nombre = teclado.nextLine();

              System.out.print("Ingrese el año de lanzamiento: ");
              int yearDeLanzamiento = teclado.nextInt();
              teclado.nextLine();

              System.out.print("Ingrese la duracion en minutos: ");
              int duracionEnMinutos = teclado.nextInt();
              teclado.nextLine();

              // Crear nueva instancia de pelicula
              Pelicula peliculaUsuario = new Pelicula();
              peliculaUsuario.setNombre(nombre);
              peliculaUsuario.setFechaDeLanzamiento(yearDeLanzamiento);
              peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
              peliculaUsuario.muestraFichaTecnica();              
            break;
            
            case 3:
              System.out.println("Saliendo del programa");
            break;
          
            default:
              System.out.println("Opción no valida");
            break;
          }

        }
      }

  }
}
