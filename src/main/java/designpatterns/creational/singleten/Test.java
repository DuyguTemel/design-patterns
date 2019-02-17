package designpatterns.creational.singleten;

/**
 * 
 * @author duygutemel
 * @date 17/02/2019
 * @project DesignPatterns
 */
public class Test {

	public static void main(String[] args) {
		Singleten singleten = Singleten.getInstance();
		singleten.showMessage();
	}
}
