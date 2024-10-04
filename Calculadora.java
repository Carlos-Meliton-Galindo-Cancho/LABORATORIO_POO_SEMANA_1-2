public class Calculadora {
    
    // Este método suma dos números y devuelve el resultado.
    public double sumar(double a, double b) {
        return a + b; // Simplemente sumamos a y b.
    }

    // Este método resta el segundo número del primero.
    public double restar(double a, double b) {
        return a - b; // Restamos b de a.
    }

    // Este método multiplica dos números y devuelve el producto.
    public double multiplicar(double a, double b) {
        return a * b; // Multiplicamos a por b.
    }

    // Este método divide el primer número por el segundo.
    public double dividir(double a, double b) {
        if (b == 0) {
            // Si b es cero, lanza una excepción para evitar la división por cero.
            throw new IllegalArgumentException("Error: División por cero no permitida.");
        }
        return a / b; // Si b no es cero, devuelve el cociente.
    }

    public static void main(String[] args) {
        // Creamos una nueva instancia de la calculadora.
        Calculadora calc = new Calculadora();

        // Definimos dos números para hacer operaciones.
        double a = 10;
        double b = 5;

        // Mostramos el resultado de la suma en la consola.
        System.out.println("Suma: " + calc.sumar(a, b));           // Esto debe mostrar 15.0
        // Mostramos el resultado de la resta.
        System.out.println("Resta: " + calc.restar(a, b));         // Esto debe mostrar 5.0
        // Mostramos el resultado de la multiplicación.
        System.out.println("Multiplicación: " + calc.multiplicar(a, b)); // Esto debe mostrar 50.0
        try {
            // Intentamos hacer la división normal.
            System.out.println("División: " + calc.dividir(a, b)); // Esto debe mostrar 2.0
            // Intentamos hacer una división por cero para ver cómo se maneja el error.
            System.out.println("División por cero: " + calc.dividir(a, 0)); // Esto lanzará una excepción
        } catch (IllegalArgumentException e) {
            // Si se lanza una excepción, mostramos el mensaje de error.
            System.out.println(e.getMessage());
        }
    }
}
