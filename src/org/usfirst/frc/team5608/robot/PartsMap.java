package org.usfirst.frc.team5608.robot;

import edu.wpi.first.wpilibj.*;

/**
 * The PartsMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class PartsMap {
	
	//Joystick(and Button) Initiations
	/**Left Joystick for operating the left side of the drive.*/
	public static Joystick leftStick = new Joystick(1);
	/**Right Joystick for operating the right side of the drive.*/
    public static Joystick rightStick = new Joystick(5);
    /**Left side Joystick for operating the lift.*/
    public static Joystick liftLeft = new Joystick(2);
    /**Right side joystick for operating the lift.*/
    public static Joystick liftRight = new Joystick(3);
    
    //Motor Initiations
    /**Right motor*/
    public static SpeedController right = new Talon(1);
    /**Left motor*/
	public static SpeedController left = new Talon(0);
	/**Lift motor for the first port.*/
	public static SpeedController liftMotor1 = new Talon(2);
	/**Lift motor for the second port.*/
	public static SpeedController liftMotor2 = new Talon(3);
	
	
	//Compressor Initiation
	/**Main compressor*/
	public static Compressor mainCompressor = new Compressor();
	
	
	//Solenoid Initiation
	public static Solenoid s1 = new Solenoid(0);
	public static Solenoid s2 = new Solenoid(1);
	public static Solenoid s3 = new Solenoid(2);
	public static Solenoid s4 = new Solenoid(3);
	
	
}


