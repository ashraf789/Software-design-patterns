package factory;

public class Hp implements Computer{
	private double price = 700.99;
	private String brand = "Hp";
	private String name  = "Spectre x360 ";

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
