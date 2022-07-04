public class Main {

    public static void main(String[] args) {
        int valor1 = 10;
        int valor2 = 15;
        int valor3 = 11;

        var d = suma(valor1, valor2, valor3);
        var e = resta(valor1, valor2, valor3);
        var f = multiplicacion(valor1, valor2, valor3);

        System.out.println("La suma de valor1, valor2 y valor 3 es: " + d);
        System.out.println("La Resta de valor1, valor2 y valor 3 es: " + e);
        System.out.println("La Multiplicacion de valor1, valor2 y valor 3 es: " + f);
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

    public static int resta(int a, int b, int c) {
        return a - b - c;
    }

    public static int multiplicacion(int a, int b, int c) {
        return a * b * c;
    }
}
