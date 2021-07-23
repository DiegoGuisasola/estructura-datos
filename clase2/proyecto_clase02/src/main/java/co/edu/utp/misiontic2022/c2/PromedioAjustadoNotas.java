package co.edu.utp.misiontic2022.c2;

public class PromedioAjustadoNotas {
    // Logica

    public static void nota_quices(String codigo, int nota1, int nota2, int nota3, int nota4, int nota5){
        // Variable contiene el resultado del computo
        double promedioAjustado = 0;

        // Algoritmo
        // 1. Identificar cual es la peor nota.
        // 2. Elimina la peor nota.
        // 3. Promediar notas restantes.
        // 4. Hacer la conversión de 0 a 5.

        // 1.
        int peorNota = nota1;
        if (nota2 < peorNota){ // peorNota = nota2 < peorNota ? nota2 : peorNota;
            peorNota = nota2;
        }
        if (nota3 < peorNota){
            peorNota = nota3;
        }
        if (nota4 < peorNota){
            peorNota = nota4;
        }
        if (nota5 < peorNota){
            peorNota = nota5;
        }

        // 2.
        int sumatoriaNotasAjustado = (nota1 + nota2 + nota3 + nota4 + nota5) - peorNota;

        // 3.
        promedioAjustado = sumatoriaNotasAjustado / 4.0;

        // 4.
        promedioAjustado /= 20;

        System.out.println(promedioAjustado);

    }

    // Seccion principal

    public static void main(String[] args) {
        nota_quices("12345", 40, 50, 39, 76, 96);
    }
}
