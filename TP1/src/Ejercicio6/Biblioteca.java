package Ejercicio6;

import Ejercicio11.Palabra;

public class Biblioteca {
  private Libro[] libros;
  private int cantLibrosPrestados;

  public Biblioteca(){
    this.libros = new Libro[0];
  }

  public void registrarLibro(Libro libro){
    Libro[] newLibros = new Libro[libros.length + 1];
    System.arraycopy(this.libros, 0, newLibros, 0, this.libros.length);
    newLibros[newLibros.length - 1] = libro;
    this.libros = newLibros;
  }

  public void prestarLibro(String tituloLibro){
    boolean prestamoOk = false;
    for (int i = 0; i < libros.length; i++){
      if (libros[i].getTitulo().equals(tituloLibro)){
        if ((libros[i].getCantEjemplares() - libros[i].getCantPrestados()) > 1){
          libros[i].setCantPrestados(libros[i].getCantPrestados() + 1);
          this.cantLibrosPrestados += 1;
          System.out.println("Se ha prestado un ejemplar de: " + libros[i].getTitulo() + ", quedan " + (libros[i].getCantEjemplares() - libros[i].getCantPrestados() - 1) + " para prestar");
          break;
        }
      }
    }
    if (!prestamoOk){
      System.out.println("No se puede prestar el libro, ya sea por no estar o por falta de ejemplares para prestar.");
    }
    System.out.println("--------------------------------");
  }

  public void mostrarLibros(){
    for (int i = 0; i < libros.length; i++){
      System.out.println("Titulo - " + libros[i].getTitulo());
      System.out.println("Autor - " + libros[i].getAutor());
      System.out.println("Nro Paginas - " + libros[i].getNumPaginas());
      System.out.println("Cantidad de Ejemplares - " + libros[i].getCantEjemplares());
      System.out.println("Cantidad de Prestados - " + libros[i].getCantPrestados());
      System.out.println("---------------------------");
    }
  }
}
