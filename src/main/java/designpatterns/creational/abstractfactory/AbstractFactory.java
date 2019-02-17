package designpatterns.creational.abstractfactory;

/**
 * 
 * @author duygutemel
 * @date 17/02/2019
 * @project DesignPatterns
 */
public interface AbstractFactory {

	public StringInstrument getStringInstrument();

	public PercussionInstrument getPercussionInstrument();

}
