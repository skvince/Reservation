
package reservationhotel;



import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Room  {
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
            int RoomNo = rs.getInt("RoomNo");
            String RoomType = rs.getString("RoomType");
            String Bed = rs.getString("Bed");
            int Price = rs.getInt("Price");
            String Status = rs.getString("Status");
            rooms.add(new RoomM(RoomNo,RoomType,Bed,Price,Status));
        }
   
    } catch (SQLException e) { 
        e.printStackTrace();
       
    }
        return rooms;
}

public int update(RoomM room) {
    try {
        String sql = "UPDATE roommanagement SET RoomType=?, Bed=?, Price=?, Status=? WHERE RoomNo=?";
        PreparedStatement stmt = connection.prepareStatement(sql);

        stmt.setString(1, room.getRoomType());
        stmt.setString(2, room.getBed());
        stmt.setInt(3, room.getPrice());
        stmt.setString(4, room.getStatus());
        stmt.setInt(5, room.getRoomNo()); // WHERE RoomNo = ?

        stmt.executeUpdate();
        return 1;

    } catch (SQLException e) {
        e.printStackTrace();
        return 0;
        }
    }
    public int delete(int RoomNo) {
   try {
        String sql = "DELETE FROM roommanagement WHERE RoomNo=?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        
        stmt.setInt(1,RoomNo);
        int rows = stmt.executeUpdate();  // number of deleted rows
        return rows;

    } catch (SQLException e) {
        e.printStackTrace();
        return 0;
        }
    }
}