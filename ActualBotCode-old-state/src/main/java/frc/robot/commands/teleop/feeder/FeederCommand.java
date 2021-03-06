// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.teleop.feeder;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.RobotContainer;
import frc.robot.subsystems.FeederSubsystem;
import frc.robot.Constants.FeederConstants;
import frc.robot.Constants.OIConstants;

public class FeederCommand extends CommandBase {
  private FeederSubsystem feederSubsystem;
  /** Creates a new FeederCommand. */
  public FeederCommand(FeederSubsystem feederSubsystem) {
    this.feederSubsystem = feederSubsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(this.feederSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // this.feederSubsystem.setFeederSpeed();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    this.feederSubsystem.setFeederSpeed(FeederConstants.feederSpeed);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return !RobotContainer.joyD.getRawButton(OIConstants.feeder_X_ButtonNumber);
  }
}
