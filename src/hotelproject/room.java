
package hotelproject;

public class room implements Comparable<room>{
    
    protected int roomNo;
    protected double price;
    
    public room(int roomNumber,double RoomPrice){
        
        roomNo = roomNumber;
        price = RoomPrice;
    }
    
    public room(){
        
    }
   
    public String getRoomInfo(){
        return "";
    }
    
    public int compareTo(room other){
        return Double.compare(price, other.price);
    }
}
