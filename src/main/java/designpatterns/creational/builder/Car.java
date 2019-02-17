/**
 * 
 */
package designpatterns.creational.builder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author duygutemel
 * @date 17/02/2019
 * @project DesignPatterns
 */
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Car {

	private Brand brand;
	private Model model;
	private String color;
	private int horsePower;

}
