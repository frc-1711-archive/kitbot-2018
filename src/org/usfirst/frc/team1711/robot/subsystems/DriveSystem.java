import org.usfirst.frc.team1711.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveSystem extends Subsystem
{
	CANTalon leftMaster;
	CANTalon leftSlave;
	CANTalon rightMaster;
	CANTalon rightSlave;
	
	RobotDrive basicDrive;
	
	public DriveSystem()
	{
		leftMaster = new CANTalon(RobotMap.leftMasterDrive);
		rightMaster = new CANTalon(RobotMap.rightMasterDrive);
	
		//initialize left slave here
		//initialize right slave here
	}
	
	public void drive(double speed)
	{
		leftMaster.set(speed);
		//set right master here
		//set left slave here
		//set right slave here
	}

	@Override
	protected void initDefaultCommand() 
	{
		
	}
}