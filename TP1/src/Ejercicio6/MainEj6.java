package Ejercicio6;

public class MainEj6 {
  public static void main(String[] args){
    Biblioteca biblioteca = new Biblioteca();
    biblioteca.registrarLibro(new Libro("PEPE", "Tato", 15, 4, 1));
    biblioteca.registrarLibro(new Libro("PIPO", "Tita", 12, 9, 3));
    biblioteca.mostrarLibros();
    biblioteca.prestarLibro("PEPE");
    biblioteca.mostrarLibros();
    biblioteca.prestarLibro("PEPE");
    biblioteca.mostrarLibros();
    biblioteca.prestarLibro("PEPE");
    biblioteca.mostrarLibros();
  }
}
