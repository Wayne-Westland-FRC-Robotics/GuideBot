// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.PneumaticsSubsystem;

public class PneumaticsCommand extends CommandBase {
  private final PneumaticsSubsystem m_pneumatics;
  private final Boolean m_setForward;
  /** Creates a new PneumaticsCommand. */
  public PneumaticsCommand(PneumaticsSubsystem pneumatics, Boolean setForward) {
    m_pneumatics = pneumatics;
    m_setForward = setForward;
    addRequirements(m_pneumatics);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    if (m_setForward) {
      m_pneumatics.forward();
    } else {
      m_pneumatics.reverse();
    }    
  }
}
