package designpatterns.creational.singleten;

/**
 * 
 * @author duygutemel
 * @date 17/02/2019
 * @project DesignPatterns
 */
public class Singleten {
	private static Singleten instance = new Singleten();

	private Singleten() {

	}

	public static Singleten getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello From Singleten Design Pattern !");
	}

}
