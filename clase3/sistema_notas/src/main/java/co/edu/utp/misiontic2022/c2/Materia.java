package co.edu.utp.misiontic2022.c2;

public class Materia {
    // 1. Atributos
    private String nombre;
    private Nota nota1; // Declarados pero no inicializados (valor por defecto: null)
    private Nota nota2;
    private Nota nota3;
    private Nota nota4;
    private Nota nota5;
    private Nota mejorNota;
    private Nota peorNota;
    private int promedio;
    private int promedioAjustado;
    private double promedioEscala5;
    private double promedioAjustadoEscala5;
    private String promedioCualitativo;
    private String promedioCualitativoAjustado;

    // 2. Constructores
    Materia(){
        this.nombre = "";
        this.promedio = 0;
        this.promedioEscala5 = 0.0;
        this.promedioAjustado = 0;
        this.promedioAjustadoEscala5 = 0.0;
        this.promedioCualitativo = "";
        this.promedioCualitativoAjustado = "";
        this.nota1 = new Nota();
        this.nota2 = new Nota();
        this.nota3 = new Nota();
        this.nota4 = new Nota();
        this.nota5 = new Nota();
        this.mejorNota = new Nota();
        this.peorNota = new Nota();
    }

    Materia(int pNota1_100, int pNota2_100, int pNota3_100, int pNota4_100, int pNota5_100){
        this.nombre = "Sin nombre";
        this.promedio = 0;
        this.promedioEscala5 = 0.0;
        this.promedioAjustado = 0;
        this.promedioAjustadoEscala5 = 0.0;
        this.promedioCualitativo = "";
        this.promedioCualitativoAjustado = "";
        this.nota1 = new Nota(pNota1_100);
        this.nota2 = new Nota(pNota2_100);
        this.nota3 = new Nota(pNota3_100);
        this.nota4 = new Nota(pNota4_100);
        this.nota5 = new Nota(pNota5_100);
        this.mejorNota = new Nota();
        this.peorNota = new Nota();
    }

    // 3. Metodos

    public void calcularPeorNota(){

        //Suponer que la nota1 es la peor nota;
        this.peorNota = this.nota1;
        this.peorNota = this.nota2.getEscala100() < this.peorNota.getEscala100() ? this.nota2 : this.peorNota;
        this.peorNota = this.nota3.getEscala100() < this.peorNota.getEscala100() ? this.nota3 : this.peorNota;
        this.peorNota = this.nota4.getEscala100() < this.peorNota.getEscala100() ? this.nota4 : this.peorNota;
        this.peorNota = this.nota5.getEscala100() < this.peorNota.getEscala100() ? this.nota5 : this.peorNota;
    }

    public void calcularMejorNota(){

        //Suponer que la nota1 es la peor nota;
        this.mejorNota = this.nota1;
        this.mejorNota = this.nota2.getEscala100() > this.peorNota.getEscala100() ? this.nota2 : this.peorNota;
        this.mejorNota = this.nota3.getEscala100() > this.peorNota.getEscala100() ? this.nota3 : this.peorNota;
        this.mejorNota = this.nota4.getEscala100() > this.peorNota.getEscala100() ? this.nota4 : this.peorNota;
        this.mejorNota = this.nota5.getEscala100() > this.peorNota.getEscala100() ? this.nota5 : this.peorNota;
    }

    public void calcularPromedio(){
        this.promedio = (this.nota1.getEscala100() + this.nota2.getEscala100() + this.nota3.getEscala100() + this.nota4.getEscala100() + this.nota5.getEscala100()) / 5;

        // Dummy object para obtener el promedio cualitativo
        Nota dummy = new Nota(this.promedio);
        this.promedioEscala5 = dummy.getEscala5();
        this.promedioCualitativo = dummy.getCualitativa();
    }

    public void calcularPromedioAjustado(){
        this.calcularPeorNota();
        this.promedioAjustado = (this.nota1.getEscala100() + this.nota2.getEscala100() + this.nota3.getEscala100() + this.nota4.getEscala100() + this.nota5.getEscala100() - this.peorNota.getEscala100()) / 4;

        // Dummy object para obtener el promedio cualitativo ajustado
        Nota dummy = new Nota(this.promedioAjustado);
        this.promedioAjustadoEscala5 = dummy.getEscala5();
        this.promedioCualitativoAjustado = dummy.getCualitativa();
    }

    public void mostrarMateria(){
        System.out.println("************* INFO MATERIA *************");
        System.out.println("Nombre de la materia: " + this.nombre);
        System.out.println("Notas:");
        this.nota1.mostrarInfo();
        this.nota2.mostrarInfo();
        this.nota3.mostrarInfo();
        this.nota4.mostrarInfo();
        this.nota5.mostrarInfo();
        System.out.println("Peor Nota: ");
        this.peorNota.mostrarInfo();
        System.out.println("Mejor Nota: ");
        this.mejorNota.mostrarInfo();
        System.out.println("Promedio: " + this.promedio);
        System.out.println("Promedio en escala de 5: " + this.promedioEscala5);
        System.out.println("Promedio Ajustado: " + this.promedioAjustado);
        System.out.println("Promedio Ajustado en escala de 5: " + this.promedioAjustadoEscala5);
        System.out.println("Promedio Cualitativo: " + this.promedioCualitativo);
        System.out.println("Promedio Cualitativo Ajustado: " + this.promedioCualitativoAjustado);
    }
    

    // 4. Getters
    public String getNombre() {
        return nombre;
    }
    public Nota getMejorNota() {
        return mejorNota;
    }
    public Nota getPeorNota() {
        return peorNota;
    }
    public double getPromedio() {
        return promedio;
    }
    public double getPromedioAjustado() {
        return promedioAjustado;
    }
    
    // 5. Setters

    public void setNota1(Nota nota1) {
        this.nota1 = nota1;
    }
    public void setNota2(Nota nota2) {
        this.nota2 = nota2;
    }
    public void setNota3(Nota nota3) {
        this.nota3 = nota3;
    }
    public void setNota4(Nota nota4) {
        this.nota4 = nota4;
    }
    public void setNota5(Nota nota5) {
        this.nota5 = nota5;
    }
    
}
