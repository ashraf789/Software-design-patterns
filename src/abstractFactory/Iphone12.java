package abstractFactory;

public class Iphone12 implements Smartphone{
	
	private String name   = "Iphone 12";
	private String brand  = "Apple";
	private double price  = 1600;
	
	@Override
	public String name() {
		return this.name;
	}

	@Override
	public String brand() {
		return this.brand;
	}

	@Override
	public double price() {
		return this.price;
	}

	@Override
	public String details() {
		return "Name: "+ this.name() + "\t Brand: "+this.brand() + "\t Price: "+this.price()+" USD";
	}
}
