package Ejercicio11;

public class Jugador {
  private int puntaje = 0;
  private Diccionario diccionario;
  public Jugador(Diccionario diccionario){
    this.diccionario = diccionario;
  }
  public void setPuntaje(int puntaje) {
    this.puntaje = puntaje;
  }

  public int getPuntaje() {
    return puntaje;
  }

  public void agregarPalabra(Palabra palabra){
    if (this.diccionario.buscarPalabra(palabra.getPalabra())){
      this.puntaje += palabra.puntaje();
    }
  }
}
