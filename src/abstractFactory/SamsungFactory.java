package abstractFactory;
/**
 * This factory will create Samsung smartphone
 * @author Ashraf789
 */
public class SamsungFactory extends AbstractFactory{
	
	@Override
	public Smartphone getSmartPhone(String name) {
		
		if(name.equalsIgnoreCase("s10")) {
			return new SamsungS10();
		}
		
		if(name.equalsIgnoreCase("s20")) {
			return new SamsungS20();
		}
		
		return null;
	}
}
