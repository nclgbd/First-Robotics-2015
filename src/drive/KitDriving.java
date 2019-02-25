package drive;

import org.usfirst.frc.team5608.robot.*;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;

public class KitDriving extends Command {

	
	//Motor Initiations...
		private static SpeedController rightMotor = PartsMap.right;
		private static SpeedController leftMotor = PartsMap.left;

		//Joystick Initiations...
		private static Joystick left_stick = PartsMap.leftStick;
		private static Joystick right_stick = PartsMap.rightStick;
		
		/** Method called for driving. */
		public void drive() {
			if (Math.abs(right_stick.getY(Hand.kRight)) > 0) {
				rightMotor.set(right_stick.getY());
				
				
			}else {
				rightMotor.set(0);
				
			}
				
			if (Math.abs(left_stick.getY(Hand.kLeft)) > 0) {
				leftMotor.set(left_stick.getY());
				
			}else {
				
			}
				leftMotor.set(0);
			
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
