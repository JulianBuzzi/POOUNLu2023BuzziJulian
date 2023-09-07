package Ejercicio13;
import Ejercicio12.ListaTareasEj12;
import Ejercicio13.TareaEj13;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class MainEj13 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ListaTareasEj13 toDoList = new ListaTareasEj13();

    while (true) {
      System.out.println("Opciones:");
      System.out.println("1. Agregar tarea");
      System.out.println("2. Marcar tarea como realizada");
      System.out.println("3. Listar tareas no vencidas");
      System.out.println("4. Buscar tarea por título");
      System.out.println("5. Agregar colaborador a tarea");
      System.out.println("6. Marcar tarea como finalizada por colaborador");
      System.out.println("7. Ver tareas realizadas por colaborador");
      System.out.println("8. Salir");
      System.out.print("Seleccione una opción: ");
      int opcion = scanner.nextInt();
      scanner.nextLine();

      switch (opcion) {
        case 1 -> {
          System.out.print("Ingrese la descripción de la tarea: ");
          String descripcion = scanner.nextLine();
          System.out.print("Ingrese la prioridad (1: Alta, 2: Media, 3: Baja): ");
          int prioridad = scanner.nextInt();
          scanner.nextLine();
          boolean estado;
          while (true) {
            System.out.print("¿La tarea está completada? (si/no): ");
            String estadoInput = scanner.nextLine().toLowerCase();
            if (estadoInput.equals("si")) {
              estado = true;
              break;
            } else if (estadoInput.equals("no")) {
              estado = false;
              break;
            } else {
              System.out.println("Entrada no válida. Por favor, ingrese 'si' o 'no'.");
            }
          }
          System.out.print("Ingrese la fecha límite (AAAA-MM-DD): ");
          LocalDate fechaLimite = LocalDate.parse(scanner.nextLine());
          System.out.print("Ingrese la fecha de recordatorio (AAAA-MM-DD): ");
          LocalDate fechaRecordatorio = LocalDate.parse(scanner.nextLine());
          TareaEj13 nuevaTarea = new TareaEj13(descripcion, prioridad, estado, fechaLimite, fechaRecordatorio);
          while (true) {
            System.out.print("¿Desea agregar un colaborador a esta tarea? (si/no): ");
            String agregarColaborador = scanner.nextLine().toLowerCase();
            if (agregarColaborador.equals("si")) {
              System.out.print("Ingrese el nombre del colaborador: ");
              String colaborador = scanner.nextLine();
              nuevaTarea.agregarColaborador(colaborador);
            } else if (agregarColaborador.equals("no")) {
              break;
            } else {
              System.out.println("Entrada no válida. Por favor, ingrese 'si' o 'no'.");
            }
          }
          toDoList.agregarTarea(nuevaTarea);
        }
        case 2 -> {
          System.out.print("Ingrese el título de la tarea que desea marcar como realizada: ");
          String titulo = scanner.nextLine();
          toDoList.marcarTarea(titulo, LocalDate.now());
        }
        case 3 -> {
          System.out.println("Listado de tareas no vencidas:");
          toDoList.mostrarTareas(toDoList.getTareas());
        }
        case 4 -> {
          System.out.print("Ingrese el título de la tarea que desea buscar: ");
          String titulo = scanner.nextLine();
          List<TareaEj13> tareasEncontradas = toDoList.buscarPorTitulo(titulo);
          System.out.println("Tareas encontradas:");
          toDoList.mostrarTareas(tareasEncontradas);
        }
        case 5 -> {
          System.out.print("Ingrese el título de la tarea a la que desea agregar un colaborador: ");
          String tituloTarea = scanner.nextLine();
          System.out.print("Ingrese el nombre del colaborador a agregar: ");
          String colaborador = scanner.nextLine();
          toDoList.agregarColaborador(tituloTarea, colaborador);
        }
        case 6 -> {
          System.out.print("Ingrese el título de la tarea que desea marcar como finalizada: ");
          String tituloTarea = scanner.nextLine();
          System.out.print("Ingrese el nombre del colaborador: ");
          String colaboradorTarea = scanner.nextLine();
          System.out.print("Ingrese la fecha de finalización (AAAA-MM-DD): ");
          LocalDate fechaFinalizacion = LocalDate.parse(scanner.nextLine());
          toDoList.marcarTareaConColaborador(tituloTarea, fechaFinalizacion, colaboradorTarea);
        }
        case 7 -> {
          System.out.print("Ingrese el nombre del colaborador para ver sus tareas realizadas: ");
          String colaborador = scanner.nextLine();
          List<TareaEj13> tareasRealizadas = toDoList.getTareasPorColaborador(colaborador);
          System.out.println("Tareas realizadas por '" + colaborador + "':");
          toDoList.mostrarTareas(tareasRealizadas);
        }
        case 8 -> {
          System.out.println("Saliendo del programa.");
          scanner.close();
          System.exit(0);
        }
        default -> System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
      }
    }
  }
}
