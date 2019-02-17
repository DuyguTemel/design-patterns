/**
 * 
 */
package designpatterns.creational.builder;

/**
 * @author duygutemel
 * @date 17/02/2019
 * @project DesignPatterns
 */
public class OrderManager {

	private OrderBuilder orderBuilder;

	public Car createOrder(String brandName, String modelName, String color, int horsePower) {
		if (brandName.equals("Mercedes"))
			orderBuilder = new MercedesOrderBuilder();
		else if (brandName.equals("Porsche"))
			orderBuilder = new PorscheOrderBuilder();

		orderBuilder.setBrand(brandName);
		orderBuilder.setColor(color);
		orderBuilder.setModel(modelName);
		orderBuilder.setHorsePower(horsePower);

		return orderBuilder.getCar();
	}
	
	public void printOrder() {
		System.out.println("Brand: "+orderBuilder.getCar().getBrand());
		System.out.println("Model: "+orderBuilder.getCar().getModel());
		System.out.println("Color: "+orderBuilder.getCar().getColor());
		System.out.println("Horse Power: "+orderBuilder.getCar().getHorsePower());
	}

}
