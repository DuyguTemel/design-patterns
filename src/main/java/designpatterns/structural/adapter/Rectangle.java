/**
 * 
 */
package designpatterns.structural.adapter;

/**
 * @author duygutemel
 * @date 18/02/2019
 * @project DesignPatterns
 */
public class Rectangle {
	
	public void draw(int x,int y, int width, int height) {
		System.out.println("Rectangle at point (" + x + ";" + y + "), width: " + width
                + ", height: " + height);
	}

}
