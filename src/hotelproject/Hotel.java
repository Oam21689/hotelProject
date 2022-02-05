//Student name: Olame Akim Muliri
//LSU ID: 898449565
//Lab Section:001
package hotelproject;
import java.util.ArrayList;
import java.util.Collections;

public class Hotel implements Comparable<Hotel>{
    
    private String name;
    private int stars;
    private double googleRating;
    private double averageRoomPrice;
    private int count = 0;
    
    public Hotel(){
        
    }
    
    public Hotel (String hotelName, int hotelStars){
        
        name = hotelName;
        stars = hotelStars;
    }
    
    public void setGoogleRating(double hotelGoogleRating){
        
        googleRating = hotelGoogleRating;
    }
    
    public void setRoomPrice (double hotelAverageRoomPrice){
        
        averageRoomPrice = hotelAverageRoomPrice;
    }
    
    
     ArrayList<room> rooms = new ArrayList<>();
    //assignment suggest ArrayList<Room> while class suggested to create is named "room"
    
    public double getAverageRoomPrice()
    {
        double average = 0;
        for(room r:rooms)
            average+=r.price;
        return average/rooms.size();
    }
    
    public void addRoom(room r){
        rooms.add(r);   
    }
    
    public void listRooms(){
        Collections.sort(rooms);
        for(room r:rooms)
            System.out.print(r.getRoomInfo());
        
    }
    
    
    public String printInfo(){
        
        return String.format("%-12s%5d%8s%-10.2f%5.2f", name,stars,"$",getAverageRoomPrice(),googleRating);
    }
    
    public int compareTo(Hotel other){
        
        if(Double.compare(averageRoomPrice, other.averageRoomPrice) != 0)
            return Double.compare(averageRoomPrice, other.averageRoomPrice); 
        
        else if(Integer.compare(stars, other.stars) != 0)
            return -1 * Integer.compare(stars, other.stars);
                    
        else 
            return -1 * Double.compare(googleRating, other.googleRating);
    }
    
    //Assignment5
    
   
    
    
}
