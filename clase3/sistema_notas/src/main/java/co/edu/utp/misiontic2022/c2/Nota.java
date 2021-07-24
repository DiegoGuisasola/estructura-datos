package co.edu.utp.misiontic2022.c2;

public class Nota {

    // 1. Atributos
    private int escala100;
    private double escala5;
    private String cualitativa;

    // 2. Constructores
    Nota(){
        this.escala5 = 0.0;
        this.escala100 = 0;
        this.cualitativa = "";
    }
    Nota(double pEscala5){
        this.escala5 = pEscala5;
        this.escala100 = (int)pEscala5 * 20;
        this.cualitativa = this.escala5 >= 2.95 ? "Aprobado" : "Desaprobado";
    }
    Nota(int pEscala100){
        this.escala100 = pEscala100;
        this.escala5 = pEscala100 / 20.0;
        this.cualitativa = this.escala100 >= 59 ? "Aprobado" : "Desaprobado";
    }

    // 3. Metodos
    // Mostrar info, convertir notas, etc...
    public void mostrarInfo(){
        System.out.println("Escala 5: " + this.getEscala5());
        System.out.println("Escala 100: " + this.getEscala100());
        System.out.println("Cualitativo: " + this.getCualitativa());
    }

    // 4. Getters
    public double getEscala5() {
        return escala5;
    }
    public int getEscala100() {
        return escala100;
    }
    public String getCualitativa() {
        return cualitativa;
    }

    // 5. Setters
    public void setEscala5(double escala5) {
        this.escala5 = escala5;
    }
    public void setEscala100(int escala100) {
        this.escala100 = escala100;
    }
    public void setCualitativa(String cualitativa) {
        this.cualitativa = cualitativa;
    }
}