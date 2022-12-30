package frc.robot.subsystems;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
public class ClimberArm extends SubsystemBase {
    private final CANSparkMax c;
    private final DigitalInput digitalSwitch;
    private final RelativeEncoder encoder;
    
    public ClimberArm(){
       //6 4
       this.c = new CANSparkMax(Constants.climberArmMotorPort, MotorType.kBrushless);
       this.encoder = c.getEncoder();
       this.digitalSwitch = new DigitalInput(Constants.angleSwitchPort);

       
    }
    public void resetEncoder(){
      setEncoder(0);
    }
    public void setArmSpeed(double input)
    {
      c.set(input);

    }
    public boolean switchIsPressed(){
      return(digitalSwitch.get());
    }
    public void setEncoder(double val){
      encoder.setPosition(val);
    }
    public double getEncoderPosition(){
      return encoder.getPosition();
      }


}