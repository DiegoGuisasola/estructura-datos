public class Ejercicio1 {

    //Logica
    // Scope (quien lo puede utilizar) + Es necesario instanciar? (Sí: dynamic, No: static . Amplia a public) + Que retorna + nombre (que recibe)
    public static String saludo (String nombre) {
        String cadenaSaludo = "Hola " + nombre;
        return cadenaSaludo;
    }

    /* 

    // public: Auemnta el alcance para ser utilizado en las otras clases del proyecto.
    // Sin static: Toca instanciar. Sólo se podría usar en este archivo. Copiar todo en los demas archivos que necesiten esta funcion
    nombreClase instancia = new nombreClase();
    instancia.nombreMetodoALlamar();
    
    // Con static: No toca instanciar. Libera la función para ser utilizada en otro  lugar. Aumenta el alcance.
    nombreClase.nombreMetodoALlamar();
    */
    
    public static void main(String[] args) {
        String nombre = "Tripulante P61";

        String saludoCompleto = saludo(nombre);

        System.out.println(saludoCompleto);
    }
} 

