package Ejercicio9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fecha {
  private LocalDate fecha;

  public LocalDate obtenerFecha(){
    return this.fecha;
  }
  public void setFecha(String fechaIngresada, String formatoDiaPrimero) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatoDiaPrimero);
    this.fecha = LocalDate.parse(fechaIngresada, formatter);
  }

  public boolean entreDos(LocalDate fechaMenor, LocalDate fechaMayor){
    return this.fecha.isAfter(fechaMenor) && this.fecha.isBefore(fechaMayor);
  }

  public boolean esMayor(LocalDate fecha){
    return this.fecha.isAfter(fecha);
  }

  public boolean esMenor(LocalDate fecha){
    return this.fecha.isBefore(fecha);
  }
}
