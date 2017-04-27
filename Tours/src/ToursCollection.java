import java.util.*; 
public class ToursCollection {

	public static void main(String[] args) {

		List<Tour> list = new ArrayList<Tour>();	
		
		Tour vilniusShoppingOneDayBus = new ShoppingTour("Shopping", "Vilnius", 1, 10.5, "Bus", "BB", "Galleria");
		Tour bahamasCruise5DaysShipTitanic = new CruiseTour("Cruise", "Bahamas", 5, 125.9, "Ship", "AI", "Titanic");

		list.add(vilniusShoppingOneDayBus);
		list.add(vahamasCruise5DaysShipTitanic);
		
		for(Tour t:list) {
		System.out.println(t.toString() + t.calculateFullPrice());
		}
		
	}

}
 