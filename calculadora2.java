import java.util.Scanner;

public class calculadora2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Esta calculadora únicamente responde operaciones básicas,\n dentro de las opciones: Suma, Resta, Multiplicación, División, Exponenciación y Módulo.");
        System.out.println("Introduce el primer número: ");
        int num1 = sc.nextInt();
        System.out.println("Introduce el segundo número: ");
        int num2 = sc.nextInt();
        System.out.println("Introduce la operación a realizar: ");
        String operacion = sc.next();
        switch (operacion) {
            case "suma":
                System.out.println("El resultado de la suma es: " + (num1 + num2));
                break;
            case "resta":
                System.out.println("El resultado de la resta es: " + (num1 - num2));
                break;
            case "multiplicacion":
                System.out.println("El resultado de la multiplicación es: " + (num1 * num2));
                break;
            case "division":
                if (num2 != 0) {
                    System.out.println("El resultado de la división es: " + division(num1, num2));
                } else {
                    System.out.println("Error: División por cero.");
                }
                break;
            case "exponenciacion":
                System.out.println("El resultado de la exponenciación es: " + exponenciacion(num1, num2));
                break;
            case "modulo":
                System.out.println("El resultado del módulo es: " + modulo(num1, num2));
                break;
            default:
                System.out.println("Operación no válida");
        }
        sc.close();
    }

    public static double suma(double a, double b) {
        return a + b;
    }

    public static double resta(double a, double b) {
        return a - b;
    }

    public static double multiplicacion(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static double exponenciacion(double a, double b) {
        return Math.pow(a, b);
    }

    public static double modulo(double a, double b) {
        return a % b;
    }

}
