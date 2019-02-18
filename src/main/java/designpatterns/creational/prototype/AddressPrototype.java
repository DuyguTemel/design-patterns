/**
 * 
 */
package designpatterns.creational.prototype;

import lombok.Getter;
import lombok.Setter;

/**
 * @author duygutemel
 * @date 18/02/2019
 * @project DesignPatterns
 */

public abstract class AddressPrototype implements Cloneable {

	private @Getter @Setter String id;
	private @Getter @Setter String type;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	abstract void print();

}
