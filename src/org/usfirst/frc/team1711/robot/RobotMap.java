package org.usfirst.frc.team1711.robot;

import edu.wpi.first.wpilibj.Joystick;

public class RobotMap {
		
	//motors
	public static int leftMasterDrive ;
	public static int rightMasterDrive;
	public static int leftSlaveDrive;
	public static int rightSlaveDrive;
	
	public static Joystick driverController;
	
	public static void init()
	{
		leftMasterDrive = 1; 
		rightMasterDrive = 0;
		leftSlaveDrive = 3; 
		rightSlaveDrive = 2; 
		
		driverController = new Joystick(0);
	}
	
}
