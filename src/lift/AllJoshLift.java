package lift;

import org.usfirst.frc.team5608.robot.*;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Command;


/**This is the current code for the way that Josh wants the lift to work, It hasn't been approved by Mr. Ruggerio, however I made if anyways just in case since this is very
 *close to the original configuration of the Talos. */
public class AllJoshLift extends Command {

	//Motor Initiations...
	private static SpeedController lift_motor1 = PartsMap.liftMotor1;
	private static SpeedController lift_motor2 = PartsMap.liftMotor2;
	
	//Solenoid Initiations...
	private static Solenoid sol1 = PartsMap.s1;
	private static Solenoid sol2 = PartsMap.s2;
	private static Solenoid sol3 = PartsMap.s3;
	private static Solenoid sol4 = PartsMap.s4;
	
	//Joystick Initiations...
	private static Joystick rightStick = PartsMap.rightStick;
	private static Joystick leftStick = PartsMap.leftStick;
	
	/**Method called in "execute" method to operate the lift.**/
	public void lift() {
		if(rightStick.getRawButton(1)) {
			lift_motor1.set(.3);//moves lift down
			lift_motor2.set(.3);//moves lift down
			
		}else if (leftStick.getRawButton(1)) {
			lift_motor1.set(-.8);//moves lift up
			lift_motor2.set(-.8);//moves lift up 
		
		}else {
			lift_motor1.set(-.15);//keeps from moving down
			lift_motor2.set(-.15);//keeps from moving down
			
		}
		
	}
	
	/**This is the "method" called to operate the claw of the lift.*/
	public void claw() {
		if (rightStick.getRawButton(3)) {
			sol1.set(true);
			sol2.set(true);
			
		}else if (rightStick.getRawButton(2)) {
			sol1.set(false);
			sol2.set(false);
			
		}
		if (leftStick.getRawButton(3)) {
			sol3.set(true);
			sol4.set(true);
			
		}else if (leftStick.getRawButton(2)) {
			sol3.set(false);
			sol4.set(false);
			
		}
		
	}

	protected void initialize() {
		
	}

	protected void execute() {
		claw();
		lift();
		
	}

	protected boolean isFinished() {
		return false;
	}

	protected void end() {
		
	}

	protected void interrupted() {
		
	}
	
}




