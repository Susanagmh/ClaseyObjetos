package Maquinaria;

public class Vagon {

    protected int id;
    protected double cargaActual;
    protected double cargamax;
    Mercancia mercancia;
    public static int vagon;

    public Vagon(int id, double cargaActual, double cargamax, Mercancia mercancia) {
        this.id = id;
        this.cargaActual = cargaActual;
        this.cargamax = cargamax;
        this.mercancia = mercancia;
        vagon++;
    }

    @Override
    public String toString() {
        return "Vagon{" +
                "\nid=" + id +
                "\n cargaActual=" + cargaActual +
                "\n cargamax=" + cargamax +
                "\n mercancia=" + mercancia +
                '}';
    }
    public void mostrarDatos(){
        System.out.println(toString());
    }
}

