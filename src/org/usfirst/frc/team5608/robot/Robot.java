package org.usfirst.frc.team5608.robot;

//Self-made packages containing the code for programming particular parts of the robot like lifting, driving, autonomous, etc
import drive.*;
import lift.*;
import autonomous.*;

//Boring imports...
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.CameraServer;

/** The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 * 
 * ADDED: This is the actual robot code for operating the robot. Everything is going 
 * to be called here. Currently trying to configure the webcam so the drivers can see
 * what they're doing better while they're driving.*/
public class Robot extends IterativeRobot {

	//Driving Commands...
	TalosDriving talosdrive = new TalosDriving();
	GeoffDriving geoffdrive = new GeoffDriving();
	KitDriving kitdrive = new KitDriving();
	
	//Lifting Commands...
	TalosLifting taloslift = new TalosLifting();
	GeoffLifting geofflift = new GeoffLifting();
	JoshLifting joshlift = new JoshLifting();
	AllJoshLift joshLift2 = new AllJoshLift();
	KitLifting kitLift = new KitLifting();
	//Misc Commands...
	Autonomous autonomousCommand = new Autonomous();
	CameraServer camera;
	
	public Robot() {
		//camera = CameraServer.getInstance();
		//camera.setQuality(50);
		//camera.startAutomaticCapture("cam0");
		
	}
    /** This function is run when the robot is first started up and should be
     * used for any initialization code. */
    public void robotInit() {
		
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        if (autonomousCommand != null) autonomousCommand.start();
        
    }

    /** This function is called periodically during autonomous. */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
        if (autonomousCommand != null) autonomousCommand.cancel();
        Timer.delay(0.005);	
        //talosdrive.drive();
        //taloslift.lift();
        
        //geoffdrive.start();
        //geofflift.start();
        
        //joshlift.start();
        //joshLift2.start();
        
        kitdrive.start();
        
        //kitLift.start();
        
        
        
    }

    /** This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down. */
    public void disabledInit() {

    }

    /** This function is called periodically during operator control. */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
    
    /** This function is called periodically during test mode.  */
    public void testPeriodic() {
        LiveWindow.run();
    }
}

