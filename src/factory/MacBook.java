package factory;

public class MacBook implements Computer{
	private double price = 1001;
	private String brand = "Apple";
	private String name  = "Macbook pro 2020";

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
