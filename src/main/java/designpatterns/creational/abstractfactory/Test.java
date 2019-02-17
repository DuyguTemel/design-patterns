package designpatterns.creational.abstractfactory;

/**
 * 
 * @author duygutemel
 * @date 17/02/2019
 * @project DesignPatterns
 */
public class Test {

	public static void main(String[] args) {
		AbstractFactory abstractFactory = new ConcreteFactoryImpl();
		PercussionInstrument percussionInstrument = abstractFactory.getPercussionInstrument();
		StringInstrument stringInstrument = abstractFactory.getStringInstrument();

		System.out.println("Type of Percussion Instrument: " + percussionInstrument.getType());
		System.out.println("Type of String Instrument: " + stringInstrument.getType());
	}
}
