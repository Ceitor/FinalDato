package logeo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class conexion {
    Connection conexion = null;
    public String estatus; 
    public String nombre;

    public String getEstatus() {
        return estatus;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    String Url = "jdbc:sqlserver://SLAG-RJ45\\SERVER:65274;databaseName=Login;user=sa;password=root;";
    public void conectar(){
        try {
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conexion = DriverManager.getConnection(Url);
            //JOptionPane.showMessageDialog(null, "Conetado");  
        }catch (Exception ex){
        JOptionPane.showMessageDialog(null, "error al conectar" + ex.getMessage(), ex.getMessage(), JOptionPane.ERROR_MESSAGE);
        }
    }
    public int logeo(String Usuario, String Clave) throws SQLException {
    Integer resultado = 0;
            Statement ejecutor = conexion.createStatement();
            ResultSet rs = ejecutor.executeQuery("Select * from Usuarios where Usuarios.Usuario =  '"+Usuario+"' and Usuarios.Clave = '"+Clave+"'");
            if (rs.next()) {
              setNombre(rs.getString("Nombre_R"));
              setEstatus(rs.getString("Status"));
              resultado = 1;
            } else {
              JOptionPane.showMessageDialog(null, "Error con Los Datos Ingresados");
              resultado = 0;
        }
            return resultado;
    }
}
