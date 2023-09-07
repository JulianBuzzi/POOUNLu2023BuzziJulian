package NodoDobleEnlace;

public class NodoDoble {
    private Object dato;
    private NodoDoble proximo = null;
    private NodoDoble anterior = null;

    public  void setDato(Object dato){
        this.dato = dato;
    }

    public Object getDato(){
        return this.dato;
    }

    public  void setProximo(NodoDoble siguiente){
        this.proximo = siguiente;
    }

    public NodoDoble getProximo(){
        return this.proximo;
    }

    public void setAnterior(NodoDoble anterior) { this.anterior = anterior;}

    public NodoDoble getAnterior() {return this.anterior;}
}
