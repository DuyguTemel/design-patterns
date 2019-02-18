/**
 * 
 */
package designpatterns.creational.prototype;

/**
 * @author duygutemel
 * @date 18/02/2019
 * @project DesignPatterns
 */

public class Street extends AddressPrototype {
	
	public Street() {
		setType("Street");
	}

	public void print() {

		System.out.println("Print->Street");
	}
}