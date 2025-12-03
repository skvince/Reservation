
package reservationhotel;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import static javax.swing.UIManager.getInt;
import static javax.swing.UIManager.getString;

public class Room {
    private Connection connection;

    public Room() throws SQLException, ClassNotFoundException {
        connection = DbConnection.getConnection();
    }

public int insert(RoomM room) {
    try {
        String sql = "INSERT INTO roommanagement(RoomNo, RoomType, Bed, Price, Status) VALUES(?,?,?,?,?)";
        PreparedStatement stmt = connection.prepareStatement(sql);

        stmt.setInt(1, room.getRoomNo());
        stmt.setString(2, room.getRoomType());
        stmt.setString(3, room.getBed());
        stmt.setInt(4, room.getPrice());
        stmt.setString(5, room.getStatus()); 

        stmt.executeUpdate();
        
        return 1;

    } catch (SQLException e) { 
        
        return 0;
    }
}
public List <RoomM> getRooms() {
    List<RoomM> rooms = new ArrayList<>();
    try {
        String sql = "Select * From roommanagement";
        PreparedStatement stmt = connection.prepareStatement(sql);

        

       ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            int RoomNo = getInt("RoomNo");
            String RoomType = getString("RoomType");
            String Bed = getString("Bed");
            int Price = getInt("Price");
            String Status = getString("Status");
            rooms.add(new RoomM(RoomNo,RoomType,Bed,Price,Status));
        }
        

    } catch (SQLException e) { 
        e.printStackTrace();
       
    }
        return rooms;
}
}