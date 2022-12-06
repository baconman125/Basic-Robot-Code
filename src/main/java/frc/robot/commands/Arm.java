// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import frc.robot.Constants;
import frc.robot.subsystems.ClimberArm;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import frc.robot.RobotContainer;
import frc.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj2.command.CommandBase;

/**
 * Drive the robot manually (during teleop).
 */
public class Arm extends CommandBase {
    private static ClimberArm c;
    
        
    @Override
    public void addRequirements(ClimberArm c){
        this.c = ClimberArm;
    }

    @Override
    public void initialize() {
    }
    
    


    }
     

    @Override
    public boolean isFinished() {
        return false;
    }
}