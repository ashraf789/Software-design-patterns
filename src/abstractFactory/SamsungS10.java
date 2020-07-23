package abstractFactory;

public class SamsungS10 implements Smartphone{
	
	private String name   = "Samsung S10";
	private String brand  = "Samsung";
	private double price  = 600;
	
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
