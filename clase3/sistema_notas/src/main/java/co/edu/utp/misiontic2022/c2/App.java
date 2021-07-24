package co.edu.utp.misiontic2022.c2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Nota notaVacia = new Nota();
        // notaVacia.mostrarInfo();

        Nota notaEscala5 = new Nota(2.96);
        notaEscala5.mostrarInfo();

        Nota notaEscala100 = new Nota(79);
        notaEscala100.mostrarInfo();
    }
}



/*abstract
1. Identificar sustantivos, verbos y adjetivos.
Sustantivos: representan objetos o sus atributos.
Verbos: representan métodos o relaciones.
Adjetivos: representan valores de los atributos.

Sustantivos:
    1. Objetos: empleado, cliente.
    2. Atributos: nombre, edad, sueldoBruto, categoria, suborbinado, directivo.


Tipos de relacion:
Agregación (o--): 
Composición (*--): Relación muy fuerte, si no existe uno, no existe el otro.
Asociación (): 
    Directivo "1" -- "*" Empleado: UN directivo tiene MUCHOS empleados asociados.
Dependencia (<..):
    Directivo <.. Empleado: El empleado depende del directivo.

*/