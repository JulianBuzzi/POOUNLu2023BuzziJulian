package Pila;

import Nodo.Nodo;

public class Pila {
    private Nodo tope = null;

    public boolean esVacia(){
        return this.tope == null;
    }

    public void apilar(Object dato){
        Nodo newNodo = new Nodo();
        newNodo.setDato(dato);
        if (esVacia()){
            this.tope = newNodo;
        } else {
            newNodo.setProximo(this.tope);
            this.tope = newNodo;
        }
    }

    public Nodo recuperar(){
        if (esVacia()){
            return null;
        }
        return this.tope;
    }

    public Nodo desapilar(){
        if (esVacia()){
            return null;
        }
        Nodo newNodo = this.tope;
        this.tope = this.tope.getProximo();
        return newNodo;
    }

    public String toString(){
        if (esVacia()) return null;
        Nodo newNodo = this.tope;
        String resultado = " ";
        while (newNodo.getProximo() != null){
            resultado += newNodo.getDato() + " ";
            newNodo = newNodo.getProximo();
        }
        resultado += newNodo.getDato() + " ";
        return resultado;
    }

}
