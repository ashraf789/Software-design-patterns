package abstractFactory;

public class IphoneX implements Smartphone{
	
	private String name   = "Iphone X";
	private String brand  = "Apple";
	private double price  = 800;
	
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
