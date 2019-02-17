package designpatterns.creational.factory;

/**
 * 
 * @author duygutemel
 * @date 17/02/2019
 * @project DesignPatterns
 */
public class Test {

	public static void main(String[] args) {

		CarFactory mercedes = new MercedesFactory();
		CarFactory porsche = new PorscheFactory();

		for (final Car car : mercedes.getCarList()) {
			System.out.println(car.getBrand() + " " + car.getModel() + ", " + car.getHorsepower());
		}

		System.out.println("-------------------");

		for (final Car car : porsche.getCarList()) {
			System.out.println(car.getBrand() + " " + car.getModel() + ", " + car.getHorsepower());
		}

	}

}
