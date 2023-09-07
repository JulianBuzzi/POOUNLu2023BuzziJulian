package Ejercicio2;

import NodoDobleEnlace.NodoDoble;

public class ListaDoblementeEnlazada {
    private NodoDoble inicio = null;

    public void agregar(Object dato){
        NodoDoble newNodo = new NodoDoble();
        newNodo.setDato(dato);
        if (this.inicio == null){
            this.inicio = newNodo;
        } else {
            NodoDoble nodoAux = this.inicio;
            while (nodoAux.getProximo() != null){
                nodoAux = nodoAux.getProximo();
            }
            nodoAux.setProximo(newNodo);
            newNodo.setAnterior(nodoAux);
        }
    }
    public boolean esVacia(){
        return this.inicio == null;
    }

    public String toString(){
        String resultado = "";
        NodoDoble newNodo = this.inicio;
        if (newNodo == null){
            resultado = "Lista vacia";
        } else {
            while (newNodo.getProximo() != null){
                resultado += " " + newNodo.getDato();
                newNodo = newNodo.getProximo();
            }
            resultado += " " + newNodo.getDato();
        }
        return resultado;
    }

    public int longitud(){
        int resultado = 0;
        NodoDoble newNodo = this.inicio;
        if (newNodo != null){
            while (newNodo != null){
                resultado++;
                newNodo = newNodo.getProximo();
            }
        }
        return resultado;
    }

    public void eliminar(int posicion){
        if (esVacia()) return;

        if (posicion < 1 || posicion > longitud()) {
            System.out.println("\nPosicion no valida\n");
            return;
        }

        NodoDoble newNodo = this.inicio;
        if (posicion == 1){
            this.inicio = this.inicio.getProximo();
            this.inicio.setAnterior(null);
        } else {
            for (int i = 0; i < posicion - 2; i++){
                newNodo = newNodo.getProximo();
            }
            NodoDoble nodoAux = newNodo.getProximo();
            if (posicion == longitud()){
                newNodo.setProximo(null);
            } else {
                newNodo.setProximo(nodoAux.getProximo());
                nodoAux.getProximo().setAnterior(newNodo);
            }
        }
    }

    public Object recuperar(int posicion) {
        if (esVacia()) return null;
        if (posicion < 1 || posicion > longitud()) {
            System.out.println("\nPosicion no valida\n");
            return null;
        }
        if (posicion == 1) return this.inicio.getDato();
        NodoDoble newNodo = this.inicio;
        for (int i = 0; i < posicion - 2; i++) {
            newNodo = newNodo.getProximo();
        }
        return newNodo.getProximo().getDato();
    }

    public void insertar(Object dato, int posicion){
        if (posicion < 1 || posicion > longitud() + 1){
            System.out.println("\nPosicion No Valida");
            return;
        }
        NodoDoble newNodo = new NodoDoble();
        newNodo.setDato(dato);
        if (posicion == 1){
            newNodo.setProximo(this.inicio);
            this.inicio = newNodo;
        } else {
            NodoDoble nodoAux = this.inicio;
            for (int i = 0; i < posicion - 2; i++){
                nodoAux = nodoAux.getProximo();
            }
            newNodo.setProximo(nodoAux.getProximo());
            nodoAux.setProximo(newNodo);
            newNodo.setAnterior(nodoAux);
        }
    }
}
