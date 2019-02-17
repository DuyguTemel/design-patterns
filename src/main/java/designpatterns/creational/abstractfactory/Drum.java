package designpatterns.creational.abstractfactory;

/**
 * 
 * @author duygutemel
 * @date 17/02/2019
 * @project DesignPatterns
 */
public class Drum implements PercussionInstrument {

	@Override
	public String getType() {
		return "Drum";
	}

}
