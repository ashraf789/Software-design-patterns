package abstractFactory;

public class NokiaN70 implements Smartphone{
	
	private String name   = "N70";
	private String brand  = "Nokia";
	private double price  = 550;
	
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
