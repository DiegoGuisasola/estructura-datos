package co.edu.utp.misiontic2022.c2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Nota notaVacia = new Nota();
        // System.out.println("Escala 5: " + notaVacia.getEscala5());
        // System.out.println("Escala 100: " + notaVacia.getEscala100());
        // System.out.println("Cualitativo: " + notaVacia.getCualitativa());
        notaVacia.mostrarInfo();

        Nota notaEscala5 = new Nota(4.2);
        notaEscala5.mostrarInfo();


        Nota notaEscala100 = new Nota(59);
        notaEscala100.mostrarInfo();



    }
}
