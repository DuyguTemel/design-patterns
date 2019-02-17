/**
 * 
 */
package designpatterns.creational.builder;

import lombok.NoArgsConstructor;

/**
 * @author duygutemel
 * @date 17/02/2019
 * @project DesignPatterns
 */

@NoArgsConstructor
public abstract class OrderBuilder {

	private Car car;

	public Car getCar() {
		if (car == null)
			car = new Car();
		return car;
	}

	public abstract void setBrand(String brandName);

	public abstract void setModel(String modelName);

	public abstract void setColor(String color);

	public abstract void setHorsePower(int horsePower);

}
