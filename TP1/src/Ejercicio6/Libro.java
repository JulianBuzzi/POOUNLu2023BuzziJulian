package Ejercicio6;

public class Libro {
  private String titulo;
  private String autor;
  private int numPaginas;
  private int cantEjemplares;

  private int cantPrestados;

  public void setNumPaginas(int numPaginas) {
    this.numPaginas = numPaginas;
  }

  public int getNumPaginas() {
    return numPaginas;
  }

  public Libro(String titulo, String autor, int numPaginas, int cantEjemplares, int cantPrestados) {
    this.titulo = titulo;
    this.autor = autor;
    this.cantEjemplares = cantEjemplares;
    this.cantPrestados = cantPrestados;
    this.numPaginas = numPaginas;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getAutor() {
    return autor;
  }

  public int getCantEjemplares() {
    return cantEjemplares;
  }

  public int getCantPrestados() {
    return cantPrestados;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public void setCantEjemplares(int cantEjemplares) {
    this.cantEjemplares = cantEjemplares;
  }

  public void setCantPrestados(int cantPrestados) {
    this.cantPrestados = cantPrestados;
  }
}
