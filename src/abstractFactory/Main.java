package abstractFactory;
/**
 * 
 * @author Ashraf789
 *
 */
public class Main {

	public static void main(String[] args) {
		//---------------------  Abstract Factory pattern implementation ---------------
		
		// Create all factory
		AbstractFactory samsungFactory 	= FactoryGenerator.getFactory("samsung");
		AbstractFactory nokiaFactory 	= FactoryGenerator.getFactory("nokia");
		AbstractFactory iphoneFactory 	= FactoryGenerator.getFactory("iphone");

		// All smart phone
		Smartphone samsungS10 = samsungFactory.getSmartPhone("s10");				
		Smartphone samsungS20 = samsungFactory.getSmartPhone("s20");				
		
		Smartphone nokiaN70 = nokiaFactory.getSmartPhone("n70");
		Smartphone nokiaN95 = nokiaFactory.getSmartPhone("n95");
		
		Smartphone iphone12 = iphoneFactory.getSmartPhone("12");
		Smartphone iphoneX = iphoneFactory.getSmartPhone("x");
		
		// Display all products
		System.out.println("--------------- Smartphone details ---------------");
		System.out.println(samsungS10.details());
		System.out.println(samsungS20.details());
		System.out.println(nokiaN70.details());
		System.out.println(nokiaN95.details());
		System.out.println(iphone12.details());
		System.out.println(iphoneX.details());
	}
}
