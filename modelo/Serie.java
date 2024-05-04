package modelo;

// La clase Serie, hereda (extends) todo de la clase Titulo
public class Serie extends Titulo {
  
  // Atributos de la clase Serie
  private int temporadas;
  private int episodiosPorTemporada;
  private int duracionEnMinutosPorEpisodio;


  @Override  // es una anotacion
  public int getTiempoDeDuracionEnMinutos() {
    return duracionEnMinutosPorEpisodio * episodiosPorTemporada * temporadas;
  }
  
  
  public int getTemporadas() {
    return temporadas;
  }

  public void setTemporadas(int temporadas) {
    this.temporadas = temporadas;
  }


  public int getEpisodiosPorTemporada() {
    return episodiosPorTemporada;
  }

  public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
    this.episodiosPorTemporada = episodiosPorTemporada;
  }


  public int getDuracionEnMinutosPorEpisodio() {
    return duracionEnMinutosPorEpisodio;
  }

  public void setDuracionEnMinutosPorEpisodio(int duracionEnMinutosPorEpisodio) {
    this.duracionEnMinutosPorEpisodio = duracionEnMinutosPorEpisodio;
  }



}
