
package hotelproject;

public class singleRoom extends room{
    
    private String bedType;
    private boolean smoking;
    
    public singleRoom(int roomNumber,double RoomPrice, String roomBedType,boolean smokingAllowed){
        
        super(roomNumber, RoomPrice);
        bedType = roomBedType;
        smoking = smokingAllowed;
    }
    
    @Override
    public String getRoomInfo() {
        
        String info = "Room " + roomNo + "\t$" + price + "\t\t"+ bedType + "\t\t";
        
        if(smoking)
            return info + "Smoking" + "\n";
        else
            return info + "No Smoking" + "\n";
    }
    
}
