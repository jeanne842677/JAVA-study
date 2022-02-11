package Programming;

import Programming.org.opentutorials.iot.Lighting;

import javax.swing.JOptionPane;

import Programming.org.opentutorials.iot.DimmingLights;
import Programming.org.opentutorials.iot.Elevator;
import Programming.org.opentutorials.iot.Security;

public class OkJavaGoInHomeInput {

	//parameter, 매개변수
	public static void main(String[] args) {
		
		String id = JOptionPane.showInputDialog("Enter a id");
		String bright = JOptionPane.showInputDialog("Enter a Bright level");
		
		//Elevator call 
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1);
		
		//Security off
		Security mySecurity = new Security(id);
		mySecurity.off();
		
		//Light on
		Lighting hallLamp = new Lighting(id + " / Hall Lamp");
		hallLamp.on();
		
		Lighting floorLamp = new Lighting(id + " / floorLamp");
		floorLamp.on();
		
		DimmingLights moodLamp = new DimmingLights(id + " moddLamp");
		moodLamp.setBright(Double.parseDouble(bright));
		moodLamp.on();
		
		
	}

}
