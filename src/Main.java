
import Maquinaria.Locomotora;
import Maquinaria.Mercancia;
import Maquinaria.Tren;
import Maquinaria.Vagon;
import personal.Especialidad;
import personal.JefeDeEstacion;
import personal.Maquinista;
import personal.Mecanico;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Datos del maquinista Pepe:");
        Maquinista pepe = new Maquinista("Pepe","1111111P",42000.0,"1");
        pepe.mostrarDatos();
        System.out.println("Datos del maquinista Marta:");
        Maquinista Marta = new Maquinista("Marta","2222222M",42000.0,"1");
        Marta.mostrarDatos();

        System.out.println("Datos del mécánico F. Frenador");
        Mecanico f = new Mecanico("F. Frenador","389177612",Especialidad.FRENOS);
        f.mostrarDatos();
        System.out.println("Datos del mécánico H. Hidráulico");
        Mecanico h = new Mecanico("H.Hidraulico","389177612",Especialidad.HIDRAULICA);
        h.mostrarDatos();
        System.out.println("Datos del mécánico E. Electricista");
        Mecanico e = new Mecanico("E. Electricista","389177612",Especialidad.ELECTRICIDAD);
        e.mostrarDatos();
        System.out.println("Datos del mécánico M. Motorista");
        Mecanico m = new Mecanico("M.Motorista","389177612",Especialidad.MOTOR);
        m.mostrarDatos();

        System.out.println("Datos del jefe de estación:");
        JefeDeEstacion boss = new JefeDeEstacion("El Boss","1552", LocalDate.of(1111,04,02));
        boss.mostrarDatos();

        System.out.println("======================================================");
        Locomotora locomotora1 = new Locomotora("M3085",350,2020,f);
        locomotora1.mostrarDatos();

        System.out.println("Datos del tren:");
        Tren tren1 = new Tren(locomotora1,null);
        tren1.mostrarDatos();

        System.out.println("Añadimos 5 vagones al tren y tratamos de añadir uno más: ");
        System.out.println("*************************************************");

       /** System.out.println("Creando vagon");
        Vagon vagon1= new Vagon(122,200, tren1.ElegircargaMax(),tren1.elegirMercancia());
        System.out.println("Creando vagon");
        Vagon vagon2= new Vagon(133,250, tren1.ElegircargaMax(),tren1.elegirMercancia());
        System.out.println("Creando vagon");
        Vagon vagon3= new Vagon(144,300, tren1.ElegircargaMax(),tren1.elegirMercancia());
        System.out.println("Creando vagon");
        Vagon vagon4= new Vagon(155,350, tren1.ElegircargaMax(),tren1.elegirMercancia());
        System.out.println("Creando vagon");
        Vagon vagon5= new Vagon(166,400, tren1.ElegircargaMax(),tren1.elegirMercancia());
        System.out.println("Creando vagon");
        Vagon vagon6= new Vagon(177,450, tren1.ElegircargaMax(),tren1.elegirMercancia());**/


        tren1.añadirvagon();
        System.out.println(Vagon.vagon);
        tren1.añadirvagon();
        System.out.println(Vagon.vagon);
        tren1.añadirvagon();
        System.out.println(Vagon.vagon);
        tren1.añadirvagon();
        System.out.println(Vagon.vagon);
        tren1.añadirvagon();
        System.out.println(Vagon.vagon);
        tren1.añadirvagon();
        System.out.println(Vagon.vagon);
        tren1.mostrarDatos();

        System.out.println("***** Le asignamos un maquinista*****");

        tren1.setMaquinista(pepe);
        tren1.mostrarDatos();

        System.out.println("****Quitamos un vagón *****");

        tren1.quitarVagon();
        tren1.mostrarDatos();

        System.out.println("Mi estación se compone de");
        System.out.println("Jefe de estacion: " + JefeDeEstacion.JefeDeEstacion);
        System.out.println("Maquinista: "+ Maquinista.Maquinista);
        System.out.println("Mecanico: " + Mecanico.Mecanico);
        System.out.println("Locomotora: "+ Locomotora.locomotor);
        System.out.println("Tren: " + Tren.tren );




    }



    }


