package abstractFactory;

public class IphoneFactory extends AbstractFactory{

	@Override
	public Smartphone getSmartPhone(String type) {
		
		if(type.equalsIgnoreCase("x")) {
			return new IphoneX();
		}
		
		if(type.equalsIgnoreCase("12")) {
			return new Iphone12();
		}
		
		
		return null;
	}

}
