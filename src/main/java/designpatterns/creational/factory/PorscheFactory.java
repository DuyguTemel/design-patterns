package designpatterns.creational.factory;

/**
 * 
 * @author duygutemel
 * @date 17/02/2019
 * @project DesignPatterns
 */
public class PorscheFactory extends CarFactory {

	@Override
	public void createAuto() {
		getCarList().add(new Cayman718(350));
	}

}
