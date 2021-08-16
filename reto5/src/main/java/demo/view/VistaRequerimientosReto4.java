package demo.view;

import java.util.ArrayList;

import demo.controller.*;
import demo.model.vo.*;

public class VistaRequerimientosReto4 {
    
    public static final Controlador control = new Controlador();

    public static void requerimiento1() {
        System.out.println("*** Lideres por salario ***");

        try {
            ArrayList<Liderporsalario> lista = control.requerimiento_1();
            String texto = new String();
            texto = "Nombre y Apellido\t ID_lider\t Salario\n";   
            for (Liderporsalario lider : lista) {
                
                System.out.printf("Nombre El lider %s %s con Id %d Tiene un salario de %d %n", 
                lider.getNombre(),
                lider.getPrimerApellido(),
                lider.getId_lider(),
                lider.getSalario()
                );
            }
            
        } catch (Exception e) {

            System.err.println("Se produjo el siguiente error: "+ e.getMessage());
        }


    }

    public static void requerimiento2() {
        System.out.println("*** Proyectos por tipo ***");

        try {
            ArrayList<Proyectosportipo> lista = control.requerimiento_2();

            for (Proyectosportipo proyecto : lista) {

                System.out.printf("El proyecto de ID_Proyecto %d de la constructora: %s de la ciudad de %s, tiene un estrato asignado de %d %n",
                proyecto.getId_proyecto(),
                proyecto.getConstructora(),
                proyecto.getCiudad(),
                proyecto.getEstrato());
                
            }
        } catch (Exception e) {
            System.out.println("Se produjo el siguiente error: " + e.getMessage());
        }

    }

    public static void requerimiento3() {
        System.out.println("*** Lideres por Nombre ***");

        try {
            ArrayList<Liderpornombre> lista = control.requerimiento_3();

            for (Liderpornombre lider : lista) {

                System.out.printf("El Lider con Id %d se llama %s %s %n",
                lider.getId_lider(),
                lider.getNombre(),
                lider.getApellido()
                );
                
            }



        } catch (Exception e) {
            System.out.println("Se produjo el siguiente error: " + e.getMessage());
        }
    }
}