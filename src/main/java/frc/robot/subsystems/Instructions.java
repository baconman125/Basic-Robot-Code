package frc.robot.subsystems;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
public class Instructions extends SubsystemBase {
    public final CANSparkMax c;
    public final DigitalInput digitalSwitch;
    
    public Instructions(){
       this.c = new CANSparkMax(Constants.climberArmMotorPort, MotorType.kBrushless);
       this.digitalSwitch = new DigitalInput(Constants.angleSwitchPort);
    }
    public void resetEncoder(){
         
  }
    public void setArmSpeed(double input)
    {
      c.set(input);

    }
    public boolean switchIsPressed(){
      return(digitalSwitch.get());
    }


}
