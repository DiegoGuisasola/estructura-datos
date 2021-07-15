import java.util.Scanner;


// Programa que lea dos variables enteras N y m y le quite a N sus m últimas cifras.
// Por ejemplo, si N = 123456 y m = 2 el nuevo valor de N será 1234.

public class Ejercicio3 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el primer numero: ");
        int N = sc.nextInt();
        System.out.println("Digite el numero de cifras a retirar del primer numero: ");
        int m = sc.nextInt();

        int resultado = (int)(N/Math.pow(10, m));

        System.out.println(resultado);
    }
}