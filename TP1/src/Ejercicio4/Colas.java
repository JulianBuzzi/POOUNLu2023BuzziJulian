package Ejercicio4;

import Nodo.Nodo;

public class Colas {
    private Nodo fr = null;
    private Nodo fi = null;

    public boolean esVacia(){
        return this.fr == null;
    }
    public void encolar(Object dato){
        Nodo newNodo = new Nodo();
        newNodo.setDato(dato);
        if (esVacia()){
            this.fr = newNodo;
            this.fi = newNodo;
        } else {
            this.fi.setProximo(newNodo);
            this.fi = this.fi.getProximo();
        }
    }

    public String toString(){
        if (esVacia()) return null;
        Nodo newNodo = this.fr;
        String resultado = " ";
        while (newNodo.getProximo() != null){
            resultado += newNodo.getDato() + " ";
            newNodo = newNodo.getProximo();
        }
        resultado += newNodo.getDato() + " ";
        return resultado;
    }

    public Nodo desencolar(){
        if (esVacia()) return null;
        Nodo newNodo = this.fr;
        if (newNodo.getProximo() == null){
            this.fr = null;
        } else {
            this.fr = this.fr.getProximo();
        }
        return newNodo;
    }

    public Nodo recuperar(){
        if (esVacia()) return null;
        return this.fr;
    }
}
