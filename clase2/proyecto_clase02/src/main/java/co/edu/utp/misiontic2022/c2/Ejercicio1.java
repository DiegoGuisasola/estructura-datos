package co.edu.utp.misiontic2022.c2;
import java.util.Scanner;

public class Ejercicio1 {
    
    // Interaccion
    public static void saludo(){
        System.out.println("App numero suerte");
    }

    public static String leerFecha(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresar la fecha DD/MM/AAAA: ");
        String fecha = sc.nextLine();
        return fecha;

        // Mas compacto:
        // return sc.nextLine();
    }

    public static void reportarNumeroSuerte(int numeroSuerte){
        System.out.println("El numero de la suerte es: " + numeroSuerte);
    }

    // Logica

    public static int obtenerNumeroSuerteSinTryCatch(String fecha){

        System.out.println("Sin Try Catch");
        // Separar la fecha

        String [] arregloFecha = fecha.split("/",5);
        int dia = Integer.parseInt(arregloFecha[0]);
        int mes = Integer.parseInt(arregloFecha[1]);
        int año = Integer.parseInt(arregloFecha[2]);

        int sumaFecha = dia + mes + año;

        return calcularResultadoFinal(sumaFecha);
    }

    public static int calcularResultadoFinal(int sumaFecha){
        String sumaFechaString = Integer.toString(sumaFecha); // Para poder utilizar .chartAt()

        // Numero de la suerte = suma cifras del resultado. Usando String:
        int millar = Character.getNumericValue(sumaFechaString.charAt(0));
        int centenas = Character.getNumericValue(sumaFechaString.charAt(1));
        int decenas = Character.getNumericValue(sumaFechaString.charAt(2));
        int unidades = Character.getNumericValue(sumaFechaString.charAt(3));

        System.out.println("Test>>>> " + millar + "," + centenas + "," + decenas + "," + unidades);

        return millar + centenas + decenas + unidades;
    }

    public static int obtenerNumeroSuerteConTryCatch(String fecha){

        System.out.println("Con Try Catch");
        // Variable que contiene el resultado
        int sumaFecha = 0;
        
        // Separar la fecha
        String [] arregloFecha = fecha.split("/",5);

        // Longitud arreglo
        int longitudArreglo = arregloFecha.length;
        
        // Store numeros
        int [] fechaNumeros = new int[longitudArreglo];
        
        for (int i = 0; i < longitudArreglo; i++) {
            try {
                fechaNumeros[i] = Integer.parseInt(arregloFecha[i]);
            } catch (Exception e) {
                System.out.println("Error catched");
            }

            sumaFecha += fechaNumeros[i];
        }
        return calcularResultadoFinal(sumaFecha);
    }


    public static void main(String[] args) {

        saludo();
        // Sin Try Catch: 1. Leer fecha, obtener numero suerte, reportar numero suerte.
        int numeroSuerte = obtenerNumeroSuerteSinTryCatch(leerFecha());
        reportarNumeroSuerte(numeroSuerte);
        
        // Con Try Catch: 1. Leer fecha, obtener numero suerte, reportar numero suerte.
        int numeroSuerte2 = obtenerNumeroSuerteConTryCatch(leerFecha());
        reportarNumeroSuerte(numeroSuerte2);
    }
}
