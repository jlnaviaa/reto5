package demo.model.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import demo.model.vo.*;
import demo.util.JDBCUtilities;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Proyectosportipo_dao {
    
    public ArrayList<Proyectosportipo> requerimiento2() throws SQLException {

    ArrayList<Proyectosportipo> respuesta = new ArrayList<Proyectosportipo>();
    Connection conexion = JDBCUtilities.getConnection();

    try {
        String consulta = "SELECT p.ID_Proyecto, p.Constructora, p.Ciudad, t.Estrato FROM Tipo t INNER JOIN Proyecto p on t.ID_Tipo = p.ID_Tipo WHERE p.Ciudad = 'Cartagena' ORDER BY Estrato ASC ";
        PreparedStatement statement = conexion.prepareStatement(consulta);
        ResultSet resultado = statement.executeQuery();

        while (resultado.next()) {
            
            Proyectosportipo proyectos = new Proyectosportipo();
            proyectos.setCiudad(resultado.getString("Ciudad"));
            proyectos.setConstructora(resultado.getString("Constructora"));
            proyectos.setEstrato(resultado.getInt("Estrato"));
            proyectos.setId_proyecto(resultado.getInt("ID_Proyecto"));
            respuesta.add(proyectos);
        }
        resultado.close();
        statement.close();


    } catch (Exception e) {
        System.out.println("Se produjo el siguiente error: " + e.getMessage());
    } finally {
        if (conexion != null) {
            conexion.close();
        }
    }
    return respuesta;
    }
}
