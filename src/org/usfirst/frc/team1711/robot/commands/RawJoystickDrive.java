import org.usfirst.frc.team1711.robot.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

public class RawJoystickDrive extends Command
{
	Joystick stick;
	
	public RawJoystickDrive(Joystick stick)
	{
		this.stick = stick;
	}

	protected void initialize()
	{
		Robot.driveSystem.drive(0);
	}
	
	protected void execute()
	{
		
	}
	
	protected void end()
	{
		
	}
	
	protected void interrupted()
	{
		
	}
	
	@Override
	protected boolean isFinished() 
	{
		return false;
	}
}