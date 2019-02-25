package lift;

import org.usfirst.frc.team5608.robot.*;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Command;

/**The actual lifting program for Talos. */
public class TalosLifting extends Command {

	//Motor Initiations...
	private static SpeedController lift_motor1 = PartsMap.liftMotor1;
	private static SpeedController lift_motor2 = PartsMap.liftMotor2;
	
	//Solenoid Initiations...
	private static Solenoid sol1 = PartsMap.s1;
	private static Solenoid sol2 = PartsMap.s2;
	private static Solenoid sol3 = PartsMap.s3;
	private static Solenoid sol4 = PartsMap.s4;
	
	//Joystick Initiations...
	private static Joystick liftLeft = PartsMap.liftLeft;
	private static Joystick liftRight = PartsMap.liftRight;
	
	
	/**The method called that does the actual lifting. */
		public void lift() {
			if(liftRight.getRawButton(1)) {
				lift_motor1.set(.3);
				lift_motor2.set(.3);
				
			}else if (liftLeft.getRawButton(1)) {
				lift_motor1.set(-.3);
				lift_motor2.set(-.3);
				
			}else if (liftRight.getRawButton(3)) {
				lift_motor1.set(.5);
				lift_motor2.set(.5);
				
			}else if (liftLeft.getRawButton(3)) {
				lift_motor1.set(-.5);
				lift_motor2.set(-.5);
				
			}else {
				lift_motor1.set(0);
				lift_motor2.set(0);
				
			}
			
		}
		
		/**The method called for operating the claw on the lift. */
		public void claw() {
			if (liftLeft.getRawButton(3)) {
				sol1.set(true);
				sol2.set(true);
				
			}else if (liftLeft.getRawButton(2)) {
				sol1.set(false);
				sol2.set(false);
				
			}
			if (liftRight.getRawButton(3)) {
				sol3.set(true);
				sol4.set(true);
				
			}else if (liftRight.getRawButton(2)) {
				sol3.set(false);
				sol4.set(false);
				
			}
			
		}
	
	protected void initialize() {
		
	}

	protected void execute() {
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


