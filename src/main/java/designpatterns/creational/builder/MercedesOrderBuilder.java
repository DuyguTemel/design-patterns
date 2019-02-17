/**
 * 
 */
package designpatterns.creational.builder;

/**
 * @author duygutemel
 * @date 17/02/2019
 * @project DesignPatterns
 */
public class MercedesOrderBuilder extends OrderBuilder {

	@Override
	public void setBrand(String brandName) {
		getCar().setBrand(new Brand(brandName));

	}

	@Override
	public void setModel(String modelName) {
		getCar().setModel(new Model(modelName));
	}

	@Override
	public void setColor(String color) {
		getCar().setColor(color);
	}

	@Override
	public void setHorsePower(int horsePower) {
		getCar().setHorsePower(horsePower);
	}

}
