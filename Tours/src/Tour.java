
abstract class Tour implements Tourable { 

	private final String type;
	private final String destination;
	private final int numberOfDays;
	private final double pricePerDay;
	private final String transportation;
	private final String meals;
	
	public Tour(String type, String destination, int numberOfDays, double pricePerDay, String transportation, String meals) {
	    this.type = type;
	    this.destination = destination;
	    this.numberOfDays = numberOfDays;
	    this.pricePerDay = pricePerDay;
	    this.transportation = transportation;
	    this.meals = meals;
	}
	
	public String type() {
	    return type;
	}
	
	public String destination () {
	    return destination;
	}

	public int numberOfDays () {
		return numberOfDays;
	}
	
	public double pricePerDay () {
		return pricePerDay;
	}
	
	public String transportation () {
		return transportation;
	}

	public String meals () {
		return meals;
	}
	
	public double calculateFullPrice () {
		
		return numberOfDays * pricePerDay;
	}

	public String toString() {
		   return "Tour[type=" + type + ",destination=" + destination + ",numberOfDays=" + numberOfDays + ",pricePerDay=" + pricePerDay + ",transportation=" + transportation + ",meals=" + meals + "]";
	}

	@Override
	public int hashCode() {
		int result = 19;
		result += type.hashCode() * result;
		result += destination.hashCode() * result;
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Tour)) return false;
		Tour o = (Tour) obj;
		
		if((!o.type.equals(this.type))) {
			return false;
		}
		
		if(!(o.destination.equals(this.destination))) {
			return false;
		}
		
		
		return true;
	}
	
	
	
}


