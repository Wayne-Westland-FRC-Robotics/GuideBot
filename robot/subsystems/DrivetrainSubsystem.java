// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DrivetrainSubsystem extends SubsystemBase {
  private final CANSparkMax m_leftSpark1 = new CANSparkMax(1, MotorType.kBrushless);
  private final CANSparkMax m_leftSpark2 = new CANSparkMax(2, MotorType.kBrushless);
  private final CANSparkMax m_rightSpark1 = new CANSparkMax(3, MotorType.kBrushless);
  private final CANSparkMax m_rightSpark2 = new CANSparkMax(4, MotorType.kBrushless);

  private final MotorControllerGroup m_leftSparks = new MotorControllerGroup(
    m_leftSpark1, 
    m_leftSpark2
  );
  private final MotorControllerGroup m_rightSparks = new MotorControllerGroup(
    m_rightSpark1, 
    m_rightSpark2
  );

  private final DifferentialDrive m_drive = new DifferentialDrive(m_leftSparks, m_rightSparks);

  /** Creates a new DrivetrainSubsystem. */
  public DrivetrainSubsystem() {}

  public void drive(double leftSpeed, double rightSpeed) {
    m_drive.tankDrive(leftSpeed, rightSpeed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
