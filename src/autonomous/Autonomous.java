package autonomous;

import org.usfirst.frc.team5608.robot.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Command;

/**Code for autonomous. Should only move forward for 2 seconds. Currently under construction due to the whole "lost laptop" fiasco.*/
public class Autonomous extends Command {

	//Motor Initiations...
	private static SpeedController right_motor = PartsMap.right;
	private static SpeedController left_motor = PartsMap.left;
	
	//Misc Initiations...
	private static Timer time = new Timer();
	private static boolean timeCheck = false;
	
	protected void initialize() {
		time.start();
		
	}
	
	protected void execute() {
		initialize();
		while(time.get() < 3){
			right_motor.set(0);
			left_motor.set(.0);
			
		}
		timeCheck = true;
		isFinished();
		
	}
	
	protected boolean isFinished() {
		return timeCheck;
		
	}
	
	protected void end() {
		
	}
	
	protected void interrupted() {

	}
	
}
