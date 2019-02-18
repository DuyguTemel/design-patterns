/**
 * 
 */
package designpatterns.creational.prototype;

/**
 * @author duygutemel
 * @date 18/02/2019
 * @project DesignPatterns
 */

public class City extends AddressPrototype {
	
	public City() {
		setType("City");
	}

	public void print() {

		System.out.println("Print->City");
	}
}