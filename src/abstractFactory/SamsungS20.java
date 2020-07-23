package abstractFactory;

public class SamsungS20 implements Smartphone{

	private String name   = "Samsung S20";
	private String brand  = "Samsung";
	private double price  = 900;
	
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
