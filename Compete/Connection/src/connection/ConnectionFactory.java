package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "@\"Data Source=DESKTOP-1BGOTO3;Initial Catalog=Sistema;Integrated Security=True\"";
    private static final String USER = "";
    private static final String PASS = "";

    public static Connection GetConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conecção!", ex);
        }
    }

    
    

public static void CloseConnection(Connection con){
    if(con != null){
        try{
            con.close();
        } catch(SQLException ex){
            System.err.println("Error: "+ex);
        }
    }
    CloseConnection(con);
}

}
