package ConectarBD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conectar {
    Connection conexion;
    
    
    public Connection getConexion()
    {
       return conexion;
    }
 
/**
* Método utilizado para establecer la conexión con la base de datos
* @return estado regresa el estado de la conexión, true si se estableció la conexión,
* falso en caso contrario
*/
    public boolean crearConexion()
        {
           try {
              Class.forName("com.mysql.jdbc.Driver");
              conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_dipromacom","root","");
           } catch (SQLException ex) {
              ex.printStackTrace();
              return false;
           } catch (ClassNotFoundException ex) {
              ex.printStackTrace();
              return false;
           }

           return true;
        }

/**
*
*Método utilizado para realizar las instrucciones: INSERT, DELETE y UPDATE
*@param sql Cadena que contiene la instrucción SQL a ejecutar
*@return estado regresa el estado de la ejecución, true(éxito) o false(error)
*
*/
    public boolean ejecutarSQL(String sql)
    {
       try {
          Statement sentencia = conexion.createStatement();
          sentencia.executeUpdate(sql);
       } catch (SQLException ex) {
          ex.printStackTrace();
       return false;
       }

       return true;
    }
 
/**
*
*Método utilizado para realizar la instrucción SELECT
*@param sql Cadena que contiene la instrucción SQL a ejecutar
*@return resultado regresa los registros generados por la consulta
*
*/
    public ResultSet ejecutarSQLSelect(String sql)
    {
       ResultSet resultado;
       try {
          Statement sentencia = conexion.createStatement();
          resultado = sentencia.executeQuery(sql);
       } catch (SQLException ex) {
          ex.printStackTrace();
          return null;
       }

       return resultado;
    }
    
    
    public static void main(String[] args) {
        
        try { 
            Conectar con = new Conectar();
            con.crearConexion();
            String sentencia ="SELECT * FROM bd_dipromacom.tdi_clientes";
            ResultSet rs = con.ejecutarSQLSelect(sentencia);         
            while (rs.next()){
                System.out.println(rs.getString("cli_nombre"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
