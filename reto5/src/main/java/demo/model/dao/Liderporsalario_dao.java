package demo.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import demo.model.vo.Liderporsalario;
import demo.util.JDBCUtilities;

public class Liderporsalario_dao {
    
    public ArrayList<Liderporsalario> requerimiento1() throws SQLException {
        
    ArrayList<Liderporsalario> respuesta = new ArrayList<Liderporsalario>();
    Connection conexion = JDBCUtilities.getConnection();

    try {
    
        String consulta = "SELECT ID_Lider, Nombre, Primer_Apellido, Salario FROM Lider l WHERE Salario <= 500000 ORDER BY Salario ";
        PreparedStatement statement = conexion.prepareStatement(consulta);            
        ResultSet resultado = statement.executeQuery();
    
        while (resultado.next()) {
    
            Liderporsalario liderporsalario = new Liderporsalario();
            liderporsalario.setNombre(resultado.getString("Nombre"));
            liderporsalario.setPrimerApellido(resultado.getString("Primer_Apellido"));
            liderporsalario.setId_lider(resultado.getInt("ID_Lider"));
            liderporsalario.setSalario(resultado.getInt("Salario"));
            respuesta.add(liderporsalario);            
        }
        resultado.close();
        statement.close();
        
        
    } catch (SQLException e) {
        System.out.println("Se produjo el siguiente error: " + e);
    } finally {

        if (conexion != null) {
            conexion.close();
        }
    }
    return respuesta;
    }
}



