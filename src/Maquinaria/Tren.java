package Maquinaria;

import personal.Especialidad;
import personal.Maquinista;

import java.util.ArrayList;
import java.util.Scanner;

public class Tren {
    static Scanner sc = new Scanner(System.in);
    protected Locomotora locomotora;
    protected Maquinista maquinista;
    ArrayList<Vagon> vagones = new ArrayList<>();
    public static int tren;

    public Tren(Locomotora locomotora, Maquinista maquinista, ArrayList<Vagon> vagones) {
        this.locomotora = locomotora;
        this.maquinista = maquinista;
        this.vagones = vagones;
        tren++;
    }

    public Tren(Locomotora locomotora, Maquinista maquinista) {
        this.locomotora = locomotora;
        this.maquinista = maquinista;
        tren++;
    }

    public Mercancia elegirMercancia () {
        System.out.println("¿Que tipo de mercancia tiene? \n- a)Perecedera\n- b)No perecedera\n- c)Peligrosa\n- d)Fragil\n- e)Dimencional");
        sc.nextLine();
         String m = sc.nextLine();

        switch (m){

            case "a" :
                return Mercancia.PERECEDERA;

            case "b" :
                return Mercancia.NOPERECEDERA;


            case "c":
                return Mercancia.PELIGROSA;


            case "d":
                return Mercancia.FRAGIL;


            case "e" :

              return Mercancia.DIMENCIONAL;

            default:
                System.out.println("Mercancia no encontarada");

        }

      añadirvagon();
       return  null;
    }

    public void setMaquinista(Maquinista maquinista) {
        this.maquinista = maquinista;
    }

    public int ElegircargaMax (){
        System.out.println("¿Cual es la carga maxima?");
        int cargam = sc.nextInt();

        return cargam;
    }

    public void añadirvagon() {

        if (vagones.size() < 5){
            Vagon vagon = new Vagon(Vagon.vagon + 1,1,ElegircargaMax(),elegirMercancia());
            vagones.add(vagon);
        }else {
            System.out.println("No se puede añadir más vagones al tren.");
        }



    }

    public void quitarVagon(){

        vagones.remove(4);
    }


    @Override
    public String toString() {
        return "Tren{" +
                "\nlocomotora=" + locomotora +
                "\n maquinista=" + maquinista +
                "\n vagones=" + vagones +
                '}';
    }

    public void mostrarDatos(){
        System.out.println(toString());
    }
}



