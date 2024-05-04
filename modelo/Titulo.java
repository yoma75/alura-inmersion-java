package modelo;

public class Titulo {

  // Encapsular los atributos para que otros usuarios no tengan acceso
  private String nombre;
  private int fechaDeLanzamiento;
  private int tiempoDeDuracionEnMinutos;

  // GETTER: método que te permite obtener el valor de una propiedad de un objeto
  // SETTER: método que te permite modificar el valor de una propiedad en un objeto.
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getFechaDeLanzamiento() {
    return fechaDeLanzamiento;
  }

  public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
    this.fechaDeLanzamiento = fechaDeLanzamiento;
  }

  public int getTiempoDeDuracionEnMinutos() {
    return tiempoDeDuracionEnMinutos;
  }

  public void setTiempoDeDuracionEnMinutos(int tiempoDeDuracionEnMinutos) {
    this.tiempoDeDuracionEnMinutos = tiempoDeDuracionEnMinutos;
  }

  // METODOS: se utilizan para no repetir codigo al crear nuevos objetos de
  // pelicula
  // VOID: no retorna nada
  public void muestraFichaTecnica() {
    System.out.println(" \n*****  Ficha técnica *****".toUpperCase());
    System.out.println("Nombre: " + nombre);
    System.out.println("Duracion: " + getTiempoDeDuracionEnMinutos() + " minutos");  // @override, clase serie
    System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento + "\n");
  }

}
