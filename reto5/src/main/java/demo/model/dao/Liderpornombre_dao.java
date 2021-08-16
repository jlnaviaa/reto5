package demo.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import demo.model.vo.Liderpornombre;
import demo.util.JDBCUtilities;

public class Liderpornombre_dao {
    
    public ArrayList<Liderpornombre> requerimiento3() throws SQLException {

    ArrayList<Liderpornombre> respuesta = new ArrayList<Liderpornombre>();
    Connection conexion = JDBCUtilities.getConnection();

    try {
        
        String consulta = "SELECT ID_Lider , Nombre , Primer_Apellido FROM Lider l WHERE Primer_Apellido LIKE '%z' ORDER BY Nombre ASC ";
        PreparedStatement statement = conexion.prepareStatement(consulta);
        ResultSet resultado = statement.executeQuery();

        while (resultado.next()) {
            
            Liderpornombre liderpornombre = new Liderpornombre();
            liderpornombre.setId_lider(resultado.getInt("ID_Lider"));
            liderpornombre.setNombre(resultado.getString("Nombre"));
            liderpornombre.setApellido(resultado.getString("Primer_Apellido"));
            respuesta.add(liderpornombre);
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
