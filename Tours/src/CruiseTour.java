
public class CruiseTour extends Tour {
        
    private String shipName;

    public CruiseTour(String type, String destination, int numberOfDays, double pricePerDay, String transportation, String meals, String shipName) {
	   super (type, destination, numberOfDays, pricePerDay, transportation, meals);
	   this.shipName = shipName;
	}   
       
    
    
}