/**
 * 
 */
package designpatterns.creational.prototype;

/**
 * @author duygutemel
 * @date 18/02/2019
 * @project DesignPatterns
 */

public class District extends AddressPrototype {
	
	public District() {
		setType("District");
	}

	public void print() {

		System.out.println("Print->District");
	}
}