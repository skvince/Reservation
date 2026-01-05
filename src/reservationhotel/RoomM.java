package reservationhotel;

public class RoomM {

    private final int RoomNo;
    private final String RoomType;
    private final String Bed;
    private final int Price;
    private final String Status;
    
    // Setters
    public RoomM(int RoomNo, String RoomType, String Bed, int Price, String Status) {
        this.RoomNo = RoomNo;
        this.RoomType = RoomType;
        this.Bed = Bed;
        this.Price = Price;
        this.Status = Status;
    }

    // Getters
    public int getRoomNo() {
        return RoomNo;
    }

    public String getRoomType() {
        return RoomType;
    }

    public String getBed() {
        return Bed;
    }

    public int getPrice() {
        return Price;
    }

    public String getStatus() {
        return Status;
    }

}
