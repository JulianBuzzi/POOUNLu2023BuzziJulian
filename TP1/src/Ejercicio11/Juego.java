package Ejercicio11;

public class Juego {
  public static void main(String[] args) {
    Diccionario diccionario = new Diccionario();

    // Agregar palabras válidas al diccionario
    diccionario.agregarPalabra(new Palabra("gato"));
    diccionario.agregarPalabra(new Palabra("perro"));
    diccionario.agregarPalabra(new Palabra("pato"));

    // Crear dos jugadores
    Jugador jugador1 = new Jugador(diccionario);
    Jugador jugador2 = new Jugador(diccionario);

    jugador1.agregarPalabra(new Palabra("gato"));
    jugador2.agregarPalabra(new Palabra("pato"));

    // Determinar el ganador
    if (jugador1.getPuntaje() > jugador2.getPuntaje()) {
      System.out.println("Jugador 1 es el ganador. Ganó con " + jugador1.getPuntaje() + " Puntos");
    } else if (jugador2.getPuntaje() > jugador1.getPuntaje()) {
      System.out.println("Jugador 2 es el ganador. Ganó con " + jugador2.getPuntaje() + " Puntos");
    } else {
      System.out.println("Es un empate.");
    }
  }
}

