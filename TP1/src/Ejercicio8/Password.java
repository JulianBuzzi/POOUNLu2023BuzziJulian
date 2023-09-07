package Ejercicio8;

import java.util.Random;

public class Password {
  private static final int LARGO_DEFAULT = 8;
  private static final int MIN_MAYUS = 2;
  private static final int MIN_MINUS = 1;
  private static final int MIN_DIGITOS = 2;

  private String password;
  private int longitud;

  public Password() {
    this(LARGO_DEFAULT);
  }

  public Password(int longitud) {
    this.longitud = longitud;
    generatePassword();
  }

  public String getPassword() {
    return password;
  }

  public int getLongitud() {
    return longitud;
  }

  public void setLongitud(int longitud) {
    this.longitud = longitud;
    generatePassword();
  }

  public boolean esPasswordSegura() {
    int mayusContador = 0;
    int minusContador = 0;
    int digitosContador = 0;

    for (char c : password.toCharArray()) {
      if (Character.isUpperCase(c)) {
        mayusContador++;
      } else if (Character.isLowerCase(c)) {
        minusContador++;
      } else if (Character.isDigit(c)) {
        digitosContador++;
      }
    }

    return mayusContador >= MIN_MAYUS &&
            minusContador >= MIN_MINUS &&
            digitosContador >= MIN_DIGITOS;
  }

  public void regenerate() {
    generatePassword();
  }

  private void generatePassword() {
    StringBuilder randomPassword = new StringBuilder(longitud);
    Random random = new Random();

    for (int i = 0; i < longitud; i++) {
      char randomChar = generarCaracterRandom(random);
      randomPassword.append(randomChar);
    }

    password = randomPassword.toString();
  }

  private char generarCaracterRandom(Random random) {
    String todosLosCaracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    int indiceRandom = random.nextInt(todosLosCaracteres.length());
    return todosLosCaracteres.charAt(indiceRandom);
  }

  public String getPasswordEstado() {
    return esPasswordSegura() ? "Fuerte" : "Débil";
  }
}


