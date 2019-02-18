/**
 * 
 */
package designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author duygutemel
 * @date 18/02/2019
 * @project DesignPatterns
 */
public class AddressList {
	
	private static Map<String,AddressPrototype> addressMap =new HashMap<>();

	static {
		addressMap.put("city", new City());
		addressMap.put("district", new District());
		addressMap.put("street", new Street());
	}
	
	public static AddressPrototype getAddressType(String addressType) throws CloneNotSupportedException {
		return (AddressPrototype) addressMap.get(addressType).clone();
	}
}
