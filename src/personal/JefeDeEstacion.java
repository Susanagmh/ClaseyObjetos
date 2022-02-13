package personal;

import java.time.LocalDate;

public class JefeDeEstacion {

    //Jefes de estación: su nombre, DNI y la fecha en que fue nombrado jefe de estación.
  private   String nombre;
  private   String dni;
  private LocalDate fechaDeNom;
  public static int JefeDeEstacion;
            //LocalDate.of(2001,02,01);


    public JefeDeEstacion(String nombre, String dni, LocalDate fechaDeNom) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaDeNom = fechaDeNom;

        JefeDeEstacion++;
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

    public LocalDate getFechaDeNom() {
        return fechaDeNom;
    }

    public void setFechaDeNom(LocalDate fechaDeNom) {
        this.fechaDeNom = fechaDeNom;
    }

    @Override
    public String toString() {
        return "JefeDeEstacion{" +
                "\n nombre='" + nombre + '\'' +
                "\n dni='" + dni + '\'' +
                "\n fechaDeNom=" + fechaDeNom +
                '}';
    }
    public void mostrarDatos(){
        System.out.println(toString());

    }
}
