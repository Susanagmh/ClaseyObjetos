package personal;

public class Mecanico {
   /** Mecánicos: su nombre, teléfono (para contactar en caso de urgencia) y en qué
    especialidad desarrollan su trabajo (esta puede ser: frenos, hidráulica,
                                         electricidad o motor).**/

  private String nombre ;
  private String telefono;
  public Especialidad especialidad;
 public static int Mecanico;

    public Mecanico(String nombre, String telefono, Especialidad especialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad;
        Mecanico++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Mecanico{" +
                "\n nombre='" + nombre + '\'' +
                "\n telefono='" + telefono + '\'' +
                "\n especialidad=" + especialidad +
                '}';
    }

    public void mostrarDatos(){
        System.out.println(toString());
    }
}


