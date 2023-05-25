import java.util.Scanner;

public class calculadora2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
                System.out.println("El resultado de la división es: " + (num1 / num2));
                break;
            default:
                System.out.println("Operación no válida");
        }
    }

}
