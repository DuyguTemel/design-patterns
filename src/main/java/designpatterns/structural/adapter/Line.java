/**
 * 
 */
package designpatterns.structural.adapter;

/**
 * @author duygutemel
 * @date 18/02/2019
 * @project DesignPatterns
 */
public class Line {
	
	public void draw(int x1,int y1, int x2, int y2) {
		System.out.println("Line from point A(" + x1 + ";" + y1 + "), to point B(" + x2 + ";" + y2 + ")");
	}

}
