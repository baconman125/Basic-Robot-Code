package frc.robot.commands;
import frc.robot.Constants; //(class for constants, explained in subsystem slides, might not use for this class rn)
import frc.robot.RobotContainer;// (this is how you access joysticks and other controllers)
import frc.robot.controllers.FlightJoystickController;
import frc.robot.subsystems.ClimberArm; //(subsystem class)
import edu.wpi.first.wpilibj2.command.CommandBase; //(parent class/super class)
import edu.wpi.first.wpilibj.Joystick;

public class ControlArm extends CommandBase{
    public ClimberArm climb;
    

    public ControlArm(ClimberArm climb){
        this.climb = climb;
        
        addRequirements(climb);
    }
    @Override
    public void initialize() {
    }
    @Override
    public void execute(){
        if(RobotContainer.primaryJoystick.joystick.getPOV() == 90){
            
        }
    } 
    @Override
    public void end(boolean interrupted) {
  
    }
    @Override
    public boolean isFinished() {
        return true;//Idk what to put, so this will do
  }

}
