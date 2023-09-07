package Ejercicio13;

import Ejercicio13.TareaEj13;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListaTareasEj13 {
  private List<TareaEj13> tareasLista;

  public ListaTareasEj13() {
    this.tareasLista = new ArrayList<>();
  }
  public void agregarTarea(TareaEj13 tarea){
    tareasLista.add(tarea);
    System.out.println("\nLa tarea: " + tarea.getDescripcion() + " ha sido agregada!\n");
  }
  public void marcarTarea(String tituloTarea, LocalDate fechaFinalizacion) {
    for (TareaEj13 tarea : tareasLista) {
      if (tarea.getDescripcion().equals(tituloTarea)) {
        tarea.marcarTarea(fechaFinalizacion);
        System.out.println("\nLa tarea '" + tituloTarea + "' ha sido marcada como finalizada por el colaborador.");
        System.out.println("Fecha de finalización: " + fechaFinalizacion + "\n");
        break;
      }
    }
  }

  public void marcarTareaConColaborador(String tituloTarea, LocalDate fechaFinalizacion, String colaborador) {
    for (TareaEj13 tarea : tareasLista) {
      if (tarea.getDescripcion().equals(tituloTarea)) {
        tarea.marcarTarea(fechaFinalizacion);
        System.out.println("\nLa tarea '" + tituloTarea + "' ha sido marcada como finalizada por el colaborador " + colaborador);
        System.out.println("Fecha de finalización: " + fechaFinalizacion + "\n");
        break;
      }
    }
  }

  public List<TareaEj13> getTareasPorColaborador(String colaborador) {
    List<TareaEj13> tareasRealizadasPorColaborador = new ArrayList<>();
    for (TareaEj13 tarea : tareasLista) {
      if (tarea.getColaboradores().contains(colaborador) && tarea.isEstado()) {
        tareasRealizadasPorColaborador.add(tarea);
      }
    }
    return tareasRealizadasPorColaborador;
  }
  public List<TareaEj13> getTareas() {
    List<TareaEj13> tareasNoVencidas = new ArrayList<>();
    LocalDate fechaActual = LocalDate.now();

    for (TareaEj13 tarea : tareasLista) {
      if (!tarea.isEstado() && tarea.getFechaLimite().isAfter(fechaActual)) {
        tareasNoVencidas.add(tarea);
      }
    }

    Collections.sort(tareasNoVencidas, Comparator.comparing(TareaEj13::getPrioridad)
            .thenComparing(TareaEj13::getFechaLimite));

    return tareasNoVencidas;
  }
  public List<TareaEj13> buscarPorTitulo(String titulo) {
    List<TareaEj13> tareasEncontradas = new ArrayList<>();

    for (TareaEj13 tarea : tareasLista) {
      if (tarea.getDescripcion().equals(titulo)) {
        tareasEncontradas.add(tarea);
      }
    }
    return tareasEncontradas;
  }
  public void agregarColaborador(String tituloTarea, String colaborador) {
    for (TareaEj13 tarea : tareasLista) {
      if (tarea.getDescripcion().equals(tituloTarea)) {
        tarea.agregarColaborador(colaborador);
        System.out.println("\nEl colaborador '" + colaborador + "' ha sido agregado a la tarea '" + tituloTarea + "'.\n");
        break;
      }
    }
  }

  public void mostrarTareas(List<TareaEj13> tareas) {
    if (tareas.isEmpty()){
      System.out.println("\nNo hay tareas.\n");
    } else {
      for (TareaEj13 tarea : tareas) {
        tarea.mostrarTarea();
      }
    }
  }

}
