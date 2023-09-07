package Tarea;
import Lista.Lista;
import Nodo.Nodo;

import java.time.LocalDate;

public class Tarea {
    private String descripcion; //Descripcion de la tarea

    private String prioridad; //Prioridad de la tarea. Puede ser "Alta", "Media" o "Baja.

    private boolean estado; //El estado de la tarea. Si es true fue completada, caso contrario, está incompleta.

    private LocalDate fechaLimite; //Ejercicio9.Fecha límite para la realización de la tarea.

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Método que recibe un entero, y en base a este, sabe la prioridad de la tarea.
    // Prioridades:
    // 1 --> Prioridad Alta
    // 2 --> Prioridad Media
    // 3 --> Prioridad Baja
    public void setPrioridad(int prioridad) {
        this.prioridad = (prioridad == 1) ? "Alta" : (prioridad == 2) ? "Media" : "Baja";
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setFechaLimite(LocalDate fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    // Constructor
    public Tarea(String descripcion, int prioridad, boolean estado, LocalDate fechaLimite) {
        this.descripcion = descripcion;
        this.prioridad = (prioridad == 1) ? "Alta" : (prioridad == 2) ? "Media" : "Baja";
        this.estado = estado;
        this.fechaLimite = fechaLimite;
    }

    // Método que muestra los detalles de la instancia tarea por consola.
    public void mostrarTarea(){
        System.out.println("Tarea: " + this.descripcion);
        System.out.println("Prioridad: " + this.prioridad);
        System.out.println("Tarea: " + (this.estado ? "Completa" : "Incompleta"));
        System.out.println("fecha Limite: " + this.fechaLimite);
        System.out.println("----------------------------");
    }

}
