import Tarea.Tarea;
import Lista.Lista;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate fechaHoy = LocalDate.of(2023, 9, 6);
        LocalDate fechaAyer = LocalDate.of(2023, 9, 5);
        Lista toDoList = new Lista();

        Tarea first = new Tarea(
                "Ir al supermercado mañana",
                1,
                false,
                fechaHoy
        );

        Tarea second = new Tarea(
                "Consultar repuesto del auto",
                1,
                true,
                fechaAyer
        );

        Tarea third = new Tarea(
                "Ir al cine a ver la nueva película de Marvel",
                2,
                false,
                fechaAyer
        );

        //Agrego las tareas pedidas a la lista de tareas.
        toDoList.agregar(first);
        toDoList.agregar(second);
        toDoList.agregar(third);

        //Se muestran las tareas existentes en la lista.
        Tarea tarea;
        for (int i = 1; i <= toDoList.longitud(); i++){
            tarea = (Tarea) toDoList.recuperar(i);
            tarea.mostrarTarea();
        }
    }
}