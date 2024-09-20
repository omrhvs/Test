package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import oracle.jdbc.OracleDriver;

public class conexion {
    static Connection con;
    static String cadena;

    public Connection conecta(){
        cadena = "jdbc:oracle:thin:@localhost:1521:xe"; // Cambia esta cadena de conexión según tu configuración
        try {
            DriverManager.registerDriver(new OracleDriver());
            con = DriverManager.getConnection(cadena, "bdllantas1", "database200327");
            System.out.println("Conexión exitosa");
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void main(String[] args) {
        conexion myconexion = new conexion();
        myconexion.conecta();
    }
}