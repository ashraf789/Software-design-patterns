package abstractFactory;

public class NokiaFactory extends AbstractFactory{
	
	@Override
	public Smartphone getSmartPhone(String name) {
		
		if(name.equalsIgnoreCase("N70")) {
			return new NokiaN70();
		}
		
		if(name.equalsIgnoreCase("N95")) {
			return new NokiaN95();
		}
		
		return null;
	}
}
