package org.usfirst.frc.team1711.robot.subsystems;

import org.usfirst.frc.team1711.robot.RobotMap;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveSystem extends Subsystem
{
	CANTalon leftFront;
	CANTalon leftRear;
	CANTalon rightFront;
	CANTalon rightRear;
	
	RobotDrive basicDrive;
	
	public DriveSystem()
	{
		leftFront = new CANTalon(RobotMap.leftMasterDrive);
		rightFront = new CANTalon(RobotMap.rightMasterDrive);
		leftRear = new CANTalon(RobotMap.leftSlaveDrive);
		rightRear = new CANTalon(RobotMap.rightSlaveDrive);
		
		basicDrive = new RobotDrive(leftFront, leftRear, rightFront, rightRear);
	}
	
	public void drive(double speed)
	{
		leftFront.set(speed);
		rightFront.set(speed);
		leftRear.set(speed);
		rightRear.set(speed);
	}
	
	public void arcadeDrive(Joystick stick)
	{
		basicDrive.arcadeDrive(stick);
	}

	@Override
	protected void initDefaultCommand() 
	{
		
	}
}