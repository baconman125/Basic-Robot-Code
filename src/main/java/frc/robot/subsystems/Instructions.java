package frc.robot.subsystems;
import frc.robot.Constants;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
public class Instructions extends SubsystemBase {
    private final RelativeEncoder frontLeftEncoder;
    private final RelativeEncoder frontRightEncoder;
    private final RelativeEncoder rearLeftEncoder;
    private final RelativeEncoder rearRightEncoder;
    private final CANSparkMax frontLeft;
    private final CANSparkMax frontRight;
    private final CANSparkMax rearLeft;
    private final CANSparkMax rearRight;
    
    public Instructions(){
        this.frontLeft = new CANSparkMax(Constants.frontLeftMotorPort, MotorType.kBrushless);
        this.frontRight = new CANSparkMax(Constants.frontRightMotorPort, MotorType.kBrushless);
        this.rearLeft = new CANSparkMax(Constants.rearLeftMotorPort, MotorType.kBrushless);
        this.rearRight = new CANSparkMax(Constants.rearRighttMotorPort, MotorType.kBrushless);
        this.frontLeftEncoder = this.frontLeft.getEncoder();
        this.frontRightEncoder = this.frontRight.getEncoder();
        this.rearLeftEncoder = this.rearLeft.getEncoder();
        this.rearRightEncoder = this.rearRight.getEncoder();
    }
    public void resetEncoder(){
         
  }

}
