package Ejercicio7;

// Polinomio grado 2
public class Polinomio {
    private double a; // Coeficiente grado 2
    private double b; // Coeficiente grado 1
    private double c; // Coeficiente grado 0

    public double getA() {
      return a; // Consigue el coeficiente grado 2
    }

    public double getB() {
      return b;  // Consigue el coeficiente grado 1
    }

    public double getC() {
      return c; // Consigue el coeficiente grado 0
    }

    public void setA(double a) {
      this.a = a; // Setea el coeficiente grado 2
    }

    public void setB(double b) {
      this.b = b; // Setea el coeficiente grado 1
    }

    public void setC(double c) {
      this.c = c; // Setea el coeficiente grado 0
    }

    // Constructor
    public Polinomio(double a, double b, double c) {
      this.a = a;
      this.b = b;
      this.c = c;
    }

    public double discriminante(){
      return Math.pow(b, 2) - (4 * a * c); // Método que calcula el discriminante
    }

    // Método que calcula las raices. El booleano que llega por parámetro indica cual de las raices se calcula
    public double calcularRaiz(boolean raizPositiva){
      double discriminante = discriminante();
      if (discriminante < 0){
        return Double.NaN;
      }
      return raizPositiva ? ((-b + Math.sqrt(discriminante)) / (2 * a)) : ((-b - Math.sqrt(discriminante)) / (2 * a));
    }

    // Método que, dado un valor de X, calcula el valor del polinomio
    public double calcularY(double x) {
      return (this.a * Math.pow(x, 2)) + (this.b * x) + (this.c);
    }

    public void mostrarDatos(){
      System.out.println("Coeficiente a: " + this.a);
      System.out.println("Coeficiente b: " + this.b);
      System.out.println("Coeficiente c: " + this.c);
      System.out.println("Discriminante: " + this.discriminante());
      System.out.println("Raiz positiva: " + this.calcularRaiz(true));
      System.out.println("Raiz negativa: " + this.calcularRaiz(false));
      System.out.println("---------------");
    }
}
