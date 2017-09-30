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
		leftMasterDrive = 0; 
		rightMasterDrive = 1;
		leftSlaveDrive = 2; 
		rightSlaveDrive = 3; 
		
		driverController = new Joystick(0);
	}
	
}
