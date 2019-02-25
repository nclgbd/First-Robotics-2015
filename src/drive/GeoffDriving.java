package drive;

import org.usfirst.frc.team5608.robot.*;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Command;

/**This is the current code for driving the robot during practice. It should be similar to the actual code for Talos, however it will be 
 * different since this code is configured for Geoff.*/
public class GeoffDriving extends Command {
	
	//Motor Initiations...
	private static SpeedController rightMotor = PartsMap.right;
	private static SpeedController leftMotor = PartsMap.left;

	//Joystick Initiations...
	private static Joystick left_stick = PartsMap.leftStick;
	private static Joystick right_stick = PartsMap.rightStick;
	
	/**Method called to actually drive the robot.*/
	public void drive() {
		if (Math.abs(right_stick.getY()) > 0){
			rightMotor.set(-right_stick.getY());
			
		}else {
			rightMotor.set(0);
			
		}
		if (Math.abs(left_stick.getY()) > 0) {
			leftMotor.set(left_stick.getY());
			
		}else {
			leftMotor.set(0);
			
		}
		
	}

	protected void initialize() {
		
	}

	protected void execute() {
		drive();
		
	}

	protected boolean isFinished() {
		return false;
		
	}

	protected void end() {
		
	}

	protected void interrupted() {
		
	}
	
}



