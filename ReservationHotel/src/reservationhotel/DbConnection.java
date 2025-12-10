
package reservationhotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    public static Connection getConnection()throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/reservation";
        String user = "root";
        String password = "";
        
        return DriverManager.getConnection(url, user, password);
    }
}
