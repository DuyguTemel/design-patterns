package designpatterns.creational.factory;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

/**
 * 
 * @author duygutemel
 * @date 17/02/2019
 * @project DesignPatterns
 */

public abstract class CarFactory {

	private @Getter @Setter ArrayList<Car> carList = new ArrayList<>();

	public CarFactory() {
		createAuto();
	}

	public abstract void createAuto();

}
