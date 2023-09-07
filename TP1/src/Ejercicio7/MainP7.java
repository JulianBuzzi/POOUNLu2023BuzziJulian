package Ejercicio7;

import java.util.Scanner;

public class MainP7 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese el coeficiente 'a' del polinomio: ");
    double a = scanner.nextDouble();

    System.out.print("Ingrese el coeficiente 'b' del polinomio: ");
    double b = scanner.nextDouble();

    System.out.print("Ingrese el coeficiente 'c' del polinomio: ");
    double c = scanner.nextDouble();

    Polinomio polinomio = new Polinomio(a, b, c);

    System.out.print("Ingrese el valor de 'y' para calcular el polinomio: ");
    double y = scanner.nextDouble();

    polinomio.mostrarDatos();
    System.out.println("Valor del polinomio para y=" + y + ": " + polinomio.calcularY(y));

    scanner.close();
  }
}
