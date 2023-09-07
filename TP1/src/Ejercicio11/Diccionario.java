package Ejercicio11;

public class Diccionario {
  private Palabra[] diccionario;
  public Diccionario() {
    // Inicializa el diccionario con un array vacío
    this.diccionario = new Palabra[0];
  }

  public void setDiccionario(Palabra[] diccionario) {
    this.diccionario = diccionario;
  }

  public Palabra[] getDiccionario() {
    return diccionario;
  }

  public void agregarPalabra(Palabra palabra){
    Palabra[] newDiccionario = new Palabra[this.diccionario.length + 1];
    System.arraycopy(this.diccionario, 0, newDiccionario, 0, this.diccionario.length);
    newDiccionario[newDiccionario.length - 1] = palabra;
    this.diccionario = newDiccionario;
  }

  public boolean buscarPalabra(String palabra){
    boolean resultado = false;
    for (int i = 0; i < this.diccionario.length; i++){
      if (this.diccionario[i].getPalabra().equals(palabra)) {
        resultado = true;
        break;
      }
    }
    if (resultado){
      System.out.println("Se encuentra " + palabra);
    } else {
      System.out.println("No se encuentra " + palabra);
    };
    return resultado;
  }
}
