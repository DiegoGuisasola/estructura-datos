public class Ejercicio2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int result = 0;
        // Verificacion:
        if (a < b) {
            result = a;
        } else {
            result = b;
        }

        System.out.println("1: " + result);

        // If else compacto. Operador ternario: http://lineadecodigo.com/java/el-operador-ternario-en-java/
        int result2 = (a < b) ? b : a;

        System.out.println("2: " + result2);


    }
}
