
package tareau5;

public class TareaU5 {

    public static void main(String[] args) {
    
    double num1 = 20.5;
    double num2 = 30.1;
    double suma = num1 + num2;
    double multi = num1 * num2;
    double resta = num1 - num2;
    double div = num1 / num2;
    
            
     System.out.println("Suma: " + suma);
     System.out.println("Resta: " + resta);
     System.out.println("Multiplicacion: " + multi);
     System.out.println("Division: " + div);
      
    }
     public static double suma(double a, double b) {
        return a + b;
    }
    public static double resta(double a, double b) {
        return a - b;
    }
    public static double multiplicion(double a, double b) {
        return a * b;
    }
    public static double division(double a, double b) {
        return a / b;
     }
}
  

