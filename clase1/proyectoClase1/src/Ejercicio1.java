public class Ejercicio1 {

    //Logica
    // Scope (quien lo puede utilizar) + Es necesario instanciar? (Sí: dynamic, No: static . Amplia a public) + Que retorna + nombre (que recibe)
    public static String saludo (String nombre) {
        String cadenaSaludo = "Hola " + nombre;
        return cadenaSaludo;
    }
    public static void main(String[] args) {
        String nombre = "Tripulante P61";

        String saludoCompleto = saludo(nombre);

        System.out.println(saludoCompleto);
    }
}
