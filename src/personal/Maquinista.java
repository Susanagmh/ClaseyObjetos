package personal;

public class Maquinista {

    //Maquinistas: su nombre, DNI, sueldo y el rango que tienen adquirido.
   private  String nombre;
   private String dni;
   private double sueldo;
   private String rango;
  public static int Maquinista;

    public Maquinista(String nombre, String dni, double sueldo, String rango) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldo = sueldo;
        this.rango = rango;
        Maquinista++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "Maquinista{" +
                "\n nombre='" + nombre + '\'' +
                "\n dni='" + dni + '\'' +
                "\n sueldo=" + sueldo +
                "\n rango='" + rango + '\'' +
                '}';
    }

    public void mostrarDatos(){
        System.out.println(toString());
    }
}



