package lift;

import org.usfirst.frc.team5608.robot.*;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Command;

public class KitLifting extends Command{

	
	//Motor Initiations...
		private static SpeedController lift_motor1 = PartsMap.liftMotor1;
		//private static SpeedController lift_motor2 = PartsMap.liftMotor2;
		
	//Solenoid Initiations...
		private static Solenoid sol1 = PartsMap.s1;
		private static Solenoid sol2 = PartsMap.s2;
		private static Solenoid sol3 = PartsMap.s3;
		
		//Joystick Initiations...
		private static Joystick left_stick = PartsMap.leftStick;
		
		/**Left side Joystick for operating the lift.*/
	    public static Joystick liftLeft = new Joystick(1);
	    /**Right side joystick for operating the lift.*/
	    public static Joystick liftRight = new Joystick(5);
		
		
		/**This is the "method" called to operate the claw of the lift.*/
		public void claw() {
			
			if (left_stick.getRawButton(2)) {
				sol1.set(true);
				
				
			}else if (left_stick.getRawButton(3)) {
				sol2.set(true);
				
			}
			if (left_stick.getRawButton(1)) {
				sol3.set(true);
				
			}else if (left_stick.getRawButton(0)) {
				sol3.set(false);
				sol1.set(false);
				sol2.set(false);
				
			}
		}
			
			
				/**Method called in "execute" method to operate the lift.**/
				public void lift() {
					if (liftLeft.getPOV()  < 180) {
						lift_motor1.set(-.8);//moves lift down
						//lift_motor2.set(-.8);//moves lift down
						
					}else if (liftRight.getPOV() > 180) {
						lift_motor1.set(.3);//moves lift up
						//lift_motor2.set(.3);//moves lift up 
					
					}else {
						lift_motor1.set(0);//keeps from moving down
						//lift_motor2.set(0);//keeps from moving down
						
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
