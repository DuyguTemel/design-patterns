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

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Brand {
	private String brandName;

	@Override
	public String toString() {
		return brandName;
	}

}
