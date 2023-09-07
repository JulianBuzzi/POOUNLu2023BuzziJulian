package Ejercicio12;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class MainEj12 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ListaTareasEj12 toDoList = new ListaTareasEj12();

    while (true) {
      System.out.println("Opciones:");
      System.out.println("1. Agregar tarea");
      System.out.println("2. Marcar tarea como realizada");
      System.out.println("3. Listar tareas no vencidas");
      System.out.println("4. Buscar tarea por título");
      System.out.println("5. Salir");
      System.out.print("Seleccione una opción: ");
      int opcion = scanner.nextInt();
      scanner.nextLine();

      switch (opcion) {
        case 1 -> {
          System.out.print("Ingrese la descripción de la tarea: ");
          String descripcion = scanner.nextLine();
          System.out.print("Ingrese la prioridad (1: Alta, 2: Media, 3: Baja): ");
          int prioridad = scanner.nextInt();
          scanner.nextLine(); // Limpiar el búfer de entrada
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
          TareaEj12 nuevaTarea = new TareaEj12(descripcion, prioridad, estado, fechaLimite, fechaRecordatorio);
          toDoList.agregarTarea(nuevaTarea);
        }
        case 2 -> {
          System.out.print("Ingrese el título de la tarea que desea marcar como realizada: ");
          String titulo = scanner.nextLine();
          toDoList.marcarTarea(titulo);
        }
        case 3 -> {
          System.out.println("Listado de tareas no vencidas:");
          toDoList.mostrarTareas(toDoList.getTareas());
        }
        case 4 -> {
          System.out.print("Ingrese el título de la tarea que desea buscar: ");
          String titulo = scanner.nextLine();
          List<TareaEj12> tareasEncontradas = toDoList.buscarPorTitulo(titulo);
          System.out.println("Tareas encontradas:");
          toDoList.mostrarTareas(tareasEncontradas);
        }
        case 5 -> {
          System.out.println("Saliendo del programa.");
          scanner.close();
          System.exit(0);
        }
        default -> System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
      }
    }
  }
}
