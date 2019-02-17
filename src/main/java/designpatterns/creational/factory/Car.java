package designpatterns.creational.factory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author duygutemel
 * @date 17/02/2019
 * @project DesignPatterns
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Car {

	private String brand;
	private String model;
	private int horsepower;

}
