package Ejercicio12;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
public class ListaTareasEj12 {
  private List<TareaEj12> tareasLista;

  public ListaTareasEj12() {
    this.tareasLista = new ArrayList<>();
  }
  public void agregarTarea(TareaEj12 tarea){
    tareasLista.add(tarea);
    System.out.println("\nLa tarea: " + tarea.getDescripcion() + " ha sido agregada!\n");
  }
  public void marcarTarea(String titulo){
    for (TareaEj12 tarea : tareasLista) {
      if (tarea.getDescripcion().equals(titulo)){
        tarea.setEstado(true);
        System.out.println("\nLa tarea: " + titulo + " ha sido realizada!\n");
        break;
      }
    }
  }
  public List<TareaEj12> getTareas() {
    List<TareaEj12> tareasNoVencidas = new ArrayList<>();
    LocalDate fechaActual = LocalDate.now();

    for (TareaEj12 tarea : tareasLista) {
      if (!tarea.isEstado() && tarea.getFechaLimite().isAfter(fechaActual)) {
        tareasNoVencidas.add(tarea);
      }
    }

    Collections.sort(tareasNoVencidas, Comparator.comparing(TareaEj12::getPrioridad)
            .thenComparing(TareaEj12::getFechaLimite));

    return tareasNoVencidas;
  }
  public List<TareaEj12> buscarPorTitulo(String titulo) {
    List<TareaEj12> tareasEncontradas = new ArrayList<>();

    for (TareaEj12 tarea : tareasLista) {
      if (tarea.getDescripcion().equals(titulo)) {
        tareasEncontradas.add(tarea);
      }
    }
    return tareasEncontradas;
  }

  public void mostrarTareas(List<TareaEj12> tareas) {
    if (tareas.isEmpty()){
      System.out.println("\nNo hay tareas.\n");
    } else {
      for (TareaEj12 tarea : tareas) {
        tarea.mostrarTarea();
      }
    }
  }

}
