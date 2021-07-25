package co.edu.utp.misiontic2022.c2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        // Interactuar con la materia
        Materia fisica = new Materia(40, 50, 39, 76, 96);

        // Utilizar el comportamiento de la materia
        fisica.calcularMejorNota();
        fisica.calcularPeorNota();
        fisica.calcularPromedio();
        fisica.calcularPromedioAjustado();
        
        // Ver información de la materia
        fisica.mostrarMateria();
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
Composición (*--): Relación muy fuerte, si no existe uno, no existe el otro. Por ejemplo: La materia construye a las Notas.
    Solo existe si la principal se crea. El rombo oscuro va pegado a la clase principal.
Asociación (): 
    Directivo "1" -- "*" Empleado: UN directivo tiene MUCHOS empleados asociados.
Dependencia (<..):
    Directivo <.. Empleado: El empleado depende del directivo.

*/