package org.usfirst.frc.team1711.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team1711.robot.subsystems.*;
import org.usfirst.frc.team1711.robot.commands.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	public static OI oi;
	public static DriveSystem driveSystem;
	
	public static RawJoystickDrive teleopCommand;

	Command autonomousCommand;
	SendableChooser<Command> chooser = new SendableChooser<>();

	@Override
	public void robotInit() {
		RobotMap.init(); //this line first
		oi = new OI();
		
		driveSystem = new DriveSystem();
		
		teleopCommand = new RawJoystickDrive();
		
		SmartDashboard.putData("Auto mode", chooser);
	}

	@Override
	public void disabledInit() {

	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void autonomousInit() {
		autonomousCommand = chooser.getSelected();

		if (autonomousCommand != null)
			autonomousCommand.start();
	}

	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() 
	{
		if (autonomousCommand != null)
			autonomousCommand.cancel();
		
		teleopCommand.start();
	}

	@Override
	public void teleopPeriodic() 
	{		
		Scheduler.getInstance().run();
	}

	@Override
	public void testPeriodic() 
	{
		LiveWindow.run();
	}
}
