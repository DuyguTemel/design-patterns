/**
 * 
 */
package designpatterns.creational.builder;

/**
 * @author duygutemel
 * @date 17/02/2019
 * @project DesignPatterns
 */
public class Test {

	public static void main(String[] args) {
		OrderManager orderManager = new OrderManager();
		orderManager.createOrder("Mercedes", "A-Series", "Black", 230);
		orderManager.printOrder();

		System.out.println("-----------");

		orderManager = new OrderManager();
		orderManager.createOrder("Porsche", "718-Cayman", "White", 270);
		orderManager.printOrder();
	}

}
