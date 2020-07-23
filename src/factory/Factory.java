package factory;

/**
 * This factory is responsible to return a computer object according to computer type.
 * In case of invalid product type factory will return null
 * @author Ashraf789
 */
public class Factory {
	public Computer getComputer(String type) {
		
		if(type.equalsIgnoreCase("Dell")) {
			return new Dell();
		} 
		
		if(type.equalsIgnoreCase("Hp")) {
			return new Hp();
		} 
		
		if(type.equalsIgnoreCase("Macbook")) {
			return new MacBook();
		} 
		
		return null;
	}
}
