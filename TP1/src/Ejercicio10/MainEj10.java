package Ejercicio10;

import Lista.Lista;
import Tarea.Tarea;

import java.time.LocalDate;

public class MainEj10 {
    public static void main(String[] args) {
        LocalDate fechaHoy = LocalDate.of(2023, 9, 6);
        LocalDate fechaAyer = LocalDate.of(2023, 9, 5);
        LocalDate fechaManiana = LocalDate.of(2023, 9, 7);
        Lista toDoList = new Lista();

        TareaEj10 first = new TareaEj10(
                "Ir al supermercado mañana",
                1,
                false,
                fechaHoy,
                fechaAyer
        );

        TareaEj10 second = new TareaEj10(
                "Consultar repuesto del auto",
                1,
                true,
                fechaAyer,
                fechaManiana
        );

        TareaEj10 third = new TareaEj10(
                "Ir al cine a ver la nueva película de Marvel",
                2,
                false,
                fechaAyer,
                fechaHoy
        );

        //Agrego las tareas pedidas a la lista de tareas.
        toDoList.agregar(first);
        toDoList.agregar(second);
        toDoList.agregar(third);

        //Se muestran las tareas existentes en la lista.
        TareaEj10 tarea;
        for (int i = 1; i <= toDoList.longitud(); i++){
            tarea = (TareaEj10) toDoList.recuperar(i);
            tarea.mostrarTarea();
        }
    }
}