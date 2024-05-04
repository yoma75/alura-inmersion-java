package modelo;

// extends: es una herencia, la clase Pelicula hereda de la clase Titulo

public class Pelicula extends Titulo {
  
  private String director;
  

  public String getDirector() {
    return director;
  }

  public void setDirector(String director) {
    this.director = director;
  }
  
}



