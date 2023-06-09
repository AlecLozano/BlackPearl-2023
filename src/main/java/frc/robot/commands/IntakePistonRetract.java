// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.IntakeSubsystem;

public class IntakePistonRetract extends CommandBase {
  IntakeSubsystem IntakeRetract;
  /** Creates a new IntakePistonRetract. */
  public IntakePistonRetract(IntakeSubsystem IntakeRetract) {

    this.IntakeRetract = IntakeRetract;
    // Use addRequirements() here to declare subsystem dependencies.

    addRequirements(IntakeRetract);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    IntakeRetract.IntakePistonRetract();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return true;
  }
  
}
