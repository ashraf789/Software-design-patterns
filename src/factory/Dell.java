package factory;

/**
 * 
 * @author Ashraf789
 *
 */
public class Dell implements Computer{
	
	private double price = 500.88;
	private String brand = "Dell";
	private String name = "Vostro 3000";

	@Override
	public double price() {
		return this.price;
	}

	@Override
	public String brand() {
		return this.brand;
	}

	@Override
	public String name() {
		return this.name;
	}

	@Override
	public String details() {
		return "Name: "+ this.name() + "\t Brand: "+this.brand() + "\t Price: "+this.price()+" USD";
	}

}
