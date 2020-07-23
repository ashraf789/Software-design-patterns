package abstractFactory;

public class NokiaN95 implements Smartphone{
	
	private String name   = "Nokia N95";
	private String brand  = "Nokia";
	private double price  = 650;
	
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
		return "Name: "+ this.name() + "\t\t Brand: "+this.brand() + "\t Price: "+this.price()+" USD";
	}
}
