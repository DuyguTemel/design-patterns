package designpatterns.creational.abstractfactory;

/**
 * 
 * @author duygutemel
 * @date 17/02/2019
 * @project DesignPatterns
 */
public class ConcreteFactoryImpl implements AbstractFactory {

	@Override
	public StringInstrument getStringInstrument() {
		return new Violin();
	}

	@Override
	public PercussionInstrument getPercussionInstrument() {
		return new Drum();
	}

}
