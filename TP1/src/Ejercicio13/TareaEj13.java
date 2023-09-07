package Ejercicio13;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TareaEj13 {
    private String descripcion; //Descripcion de la tarea

    private String prioridad; //Prioridad de la tarea. Puede ser "Alta", "Media" o "Baja.

    private boolean estado; //El estado de la tarea. Si es true fue completada, caso contrario, está incompleta.

    private LocalDate fechaLimite; //Ejercicio9.Fecha límite para la realización de la tarea.

    private LocalDate fechaRecordatorio;
    private List<String> colaboradores; // Lista de colaboradores
    private LocalDate fechaFinalizacion; // Fecha de finalización

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public boolean isEstado() {
        return estado;
    }

    public LocalDate getFechaLimite() {
        return fechaLimite;
    }

    public LocalDate getFechaRecordatorio() {
        return fechaRecordatorio;
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
    public TareaEj13(String descripcion, int prioridad, boolean estado, LocalDate fechaLimite, LocalDate fechaRecordatorio) {
        if (fechaRecordatorio.isBefore(LocalDate.now()) || fechaRecordatorio.isEqual(LocalDate.now())){
            this.descripcion = descripcion;
            this.prioridad = "Alta";
        } else {
            this.descripcion = descripcion;
            this.prioridad = (prioridad == 1) ? "Alta" : (prioridad == 2) ? "Media" : "Baja";
        }
        this.estado = estado;
        this.fechaLimite = fechaLimite;
        this.fechaRecordatorio = fechaRecordatorio;
        this.colaboradores = new ArrayList<>();
        this.fechaFinalizacion = null;
    }
    public List<String> getColaboradores() {
        return colaboradores;
    }

    public LocalDate getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void agregarColaborador(String colaborador) {
        colaboradores.add(colaborador);
    }

    public void marcarTarea(LocalDate fechaFinalizacion) {
        this.estado = true;
        this.fechaFinalizacion = fechaFinalizacion;
    }
    public void marcarTareaConColaborador(LocalDate fechaFinalizacion, String colaborador) {
        this.estado = true;
        this.fechaFinalizacion = fechaFinalizacion;
        this.colaboradores.add(colaborador);
    }

    public void mostrarTarea(){
        System.out.println("\n----------------------------");
        System.out.println("Tarea: " + this.descripcion);
        System.out.println("Prioridad: " + this.prioridad);
        System.out.println("Tarea: " + (this.estado ? "Completa" : "Incompleta"));
        System.out.println("Fecha Limite: " + this.fechaLimite);
        System.out.println("Fecha Recordatorio: " + this.fechaRecordatorio +  " - Por vencer");
        System.out.println("Colaboradores: " + this.colaboradores);
        if (this.fechaFinalizacion != null){
            System.out.println("Fecha Finalizada: " + this.fechaFinalizacion) ;
        }
        System.out.println("----------------------------\n");
    }

}
