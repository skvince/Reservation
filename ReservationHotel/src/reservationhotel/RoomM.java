
package reservationhotel;

public class RoomM {
    private int RoomNo;
    private String RoomType;
    private String Bed;
    private int Price;
    private String Status;

   
    public RoomM(int RoomNo, String RoomType, String Bed, int Price, String Status) {
        this.RoomNo = RoomNo;
        this.RoomType = RoomType;
        this.Bed = Bed;
        this.Price = Price;
        
        this.Status = Status;
    }

   // Getters and Setters
    public int getRoomNo() {
        return RoomNo;
    }

    public void setRoomNo(int RoomNo) {
        this.RoomNo = RoomNo;
    }

    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String RoomType) {
        this.RoomType = RoomType;
    }

    public String getBed() {
        return Bed;
    }

    public void setBed(String Bed) {
        this.Bed = Bed;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }
    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
}