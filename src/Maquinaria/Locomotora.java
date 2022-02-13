package Maquinaria;

import personal.Mecanico;

public class Locomotora {
   protected String matricula;
    protected int potencia;
    protected int antiguedad;
   protected Mecanico mecanico;
  public static int locomotor;

    public Locomotora(String matricula, int potencia, int antiguedad, Mecanico mecanico) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.antiguedad = antiguedad;
        this.mecanico = mecanico;
        locomotor++;
    }

    @Override
    public String toString() {
        return "Locomotora{" +
                "\nmatricula='" + matricula + '\'' +
                "\n potencia=" + potencia +
                "\n antiguedad=" + antiguedad +
                "\n mecanico=" + mecanico +
                '}';
    }

    public void mostrarDatos(){
        System.out.println(toString());
    }
}
