package demo.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import demo.model.dao.*;
import demo.model.vo.*;

public class Controlador {
    
    private final Liderporsalario_dao _lidersalario;
    private final Proyectosportipo_dao _proyectos;
    private final Liderpornombre_dao _lidernombre;

    public Controlador() {
        _lidersalario = new Liderporsalario_dao();
        _proyectos = new Proyectosportipo_dao();
        _lidernombre = new Liderpornombre_dao();
    }

    public ArrayList<Liderporsalario> requerimiento_1() throws SQLException {

        return _lidersalario.requerimiento1();
        
    }

    public ArrayList<Proyectosportipo> requerimiento_2() throws SQLException {

        return _proyectos.requerimiento2();

    }

    
    public ArrayList<Liderpornombre> requerimiento_3() throws SQLException {

        return _lidernombre.requerimiento3();

    }
}
