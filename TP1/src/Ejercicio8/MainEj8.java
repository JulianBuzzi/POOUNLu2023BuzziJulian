package Ejercicio8;

import Ejercicio8.Password;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainEj8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese el número de contraseñas que desea generar: ");
    int numPasswords = scanner.nextInt();
    scanner.nextLine(); // Consumir la nueva línea

    System.out.print("Ingrese la longitud deseada para las contraseñas: ");
    int passwordLength = scanner.nextInt();
    scanner.nextLine(); // Consumir la nueva línea

    List<Password> passwords = new ArrayList<>();

    for (int i = 0; i < numPasswords; i++) {
      Password password = new Password(passwordLength);
      passwords.add(password);
    }

    System.out.println("Contraseñas generadas:");

    for (Password password : passwords) {
      System.out.println(password.getPassword() + " - " + password.getPasswordEstado());
    }

    scanner.close();
  }
}
