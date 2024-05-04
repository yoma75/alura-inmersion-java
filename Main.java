import modelo.Pelicula;
import modelo.Principal;
import modelo.Serie;

public class Main {

  public static void main(String[] args) {

    Principal principal = new Principal();
    principal.muestraElMenu();

    
    Pelicula matrix = new Pelicula();   // crear o instanciar un nuevo objeto de pelicula    
    matrix.setNombre("Matrix");  // acceder a los atributos de la clase titulo
    matrix.setTiempoDeDuracionEnMinutos(120);  // clase titulo
    matrix.setFechaDeLanzamiento(1999);               // clase titulo
    matrix.muestraFichaTecnica();  // Llamo el metodo creado en la clase Titulo  


    Serie friends = new Serie();  // instanciar un nuevo objeto de serie
    friends.setNombre("Friends");                     // clase titulo
    friends.setFechaDeLanzamiento(1996);  // clase titulo
    friends.setTemporadas(10);                                      // clase serie
    friends.setEpisodiosPorTemporada(22);                // clase serie
    friends.setDuracionEnMinutosPorEpisodio(30);  // clase serie
    friends.muestraFichaTecnica();  // metodo heredado de la clase titulo

  }  // public static
}  // class Main
