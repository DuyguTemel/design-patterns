/**
 * 
 */
package designpatterns.creational.prototype;

/**
 * @author duygutemel
 * @date 18/02/2019
 * @project DesignPatterns
 */
public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		AddressPrototype city = AddressList.getAddressType("city");
		city.print();

		AddressPrototype district = AddressList.getAddressType("district");
		district.print();

		AddressPrototype street = AddressList.getAddressType("street");
		street.print();
	}

}
