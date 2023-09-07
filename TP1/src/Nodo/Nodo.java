package Nodo;

public class Nodo {
    private Object dato;
    private Nodo proximo = null;

    public  void setDato(Object dato){
        this.dato = dato;
    }

    public Object getDato(){
        return this.dato;
    }

    public  void setProximo(Nodo siguiente){
        this.proximo = siguiente;
    }

    public Nodo getProximo(){
        return this.proximo;
    }
}
