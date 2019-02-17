package designpatterns.creational.factory;

/**
 * 
 * @author duygutemel
 * @date 17/02/2019
 * @project DesignPatterns
 */
public class MercedesFactory extends CarFactory {

	@Override
	public void createAuto() {
		getCarList().add(new A180(180));
		getCarList().add(new B180(200));
		getCarList().add(new C200(200));
	}

}
