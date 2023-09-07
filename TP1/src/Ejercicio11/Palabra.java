package Ejercicio11;

public class Palabra {
  private String palabra;

  private Diccionario diccionario;

  public String getPalabra(){
    return this.palabra;
  }

  public void setPalabra(String palabra){
    this.palabra = palabra;
  }

  public Palabra(String palabra) {
    this.palabra = palabra;
  }

  public int puntaje() {
    int puntaje = 0;
    String pAux = this.palabra.toLowerCase();
    for (int i = 0; i < pAux.length(); i++) {
      char caracter = pAux.charAt(i);
      if (caracter == 'k'
              || caracter == 'z'
              || caracter == 'x'
              || caracter == 'y'
              || caracter == 'w'
              || caracter == 'q'
      ) {
        puntaje += 2;
      } else {
        puntaje += 1;
      }
    }
    return puntaje;
  }

}
