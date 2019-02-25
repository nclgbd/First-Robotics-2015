package drive;

import org.usfirst.frc.team5608.robot.*;
import edu.wpi.first.wpilibj.*;

/**Driving Code for Talos.*/
public class TalosDriving {
	
	//Motor Initiations...
	private static SpeedController rightMotor = PartsMap.right;
	private static SpeedController leftMotor = PartsMap.left;

	//Joystick Initiations...
	private static Joystick left_stick = PartsMap.leftStick;
	private static Joystick right_stick = PartsMap.rightStick;
	
	/** Method called for driving. */
	public void drive() {
		if (Math.abs(right_stick.getY()) > 0) {
			rightMotor.set(right_stick.getY()/2);
			
		}else {
			rightMotor.set(0);
			
		}
			
		if (Math.abs(left_stick.getY()) > 0) {
			leftMotor.set(left_stick.getY()/2);
			
		}else {
			leftMotor.set(0);
			
		}
		
	}
	
}


