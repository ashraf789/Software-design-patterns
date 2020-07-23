package factory;

/**
 * 
 * @author Ashraf789
 *
 */
public class Main {

	public static void main(String[] args) {
		//--------------------- Factory pattern implementation -----------------------
		Factory factory = new Factory();
		
		// products
		Computer dell = factory.getComputer("dell");
		Computer hp = factory.getComputer("hp");
		Computer macbook = factory.getComputer("macbook");
		
		// Display output
		System.out.println("--------------- computer details ---------------");
		System.out.println(dell.details());
		System.out.println(hp.details());
		System.out.println(macbook.details());
	}
}
