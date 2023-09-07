package Ejercicio9;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainP9 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    System.out.print("Ingrese la primera fecha (dd-MM-yyyy): ");
    String fecha1Str = scanner.nextLine();
    LocalDate fecha1 = LocalDate.parse(fecha1Str, formatter);

    System.out.print("Ingrese la segunda fecha (dd-MM-yyyy): ");
    String fecha2Str = scanner.nextLine();
    LocalDate fecha2 = LocalDate.parse(fecha2Str, formatter);

    if (fecha1.isEqual(fecha2)) {
      System.out.println("Las dos fechas son iguales.");
    } else if (fecha1.isBefore(fecha2)) {
      System.out.println("La primera fecha es anterior a la segunda fecha.");
    } else {
      System.out.println("La primera fecha es posterior a la segunda fecha.");
    }

    scanner.close();
  }
}
