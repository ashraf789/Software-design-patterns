package abstractFactory;
/**
 * Factory generator will generate new factory according to client request.
 * @author Ashraf789
 */
public class FactoryGenerator {
	
	public static AbstractFactory getFactory(String type) {
		
		if(type.equalsIgnoreCase("samsung")) {
			return new SamsungFactory();
		}
		
		if(type.equalsIgnoreCase("nokia")) {
			return new NokiaFactory();
		}
		
		if(type.equalsIgnoreCase("iphone")) {
			return new IphoneFactory();
		}
		
		return null;
	};
}
