
public class ShoppingTour extends Tour {
        
    private double shoppingTax;

    public ShoppingTour(String type, String destination, int numberOfDays, double pricePerDay, String transportation, String meals, double shoppingTax) {
	   super (type, destination, numberOfDays, pricePerDay, transportation, meals);
	   this.shoppingTax = shoppingTax;
	}

	public double calculateFullPrice() {
	
		return super.calculateFullPrice() + shoppingTax;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

 
	
	
  
}  