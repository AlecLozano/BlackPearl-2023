// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class HoodSubsystem extends SubsystemBase {
  public Solenoid TurretHood = new Solenoid(PneumaticsModuleType.REVPH, 15);
  /** Creates a new HoodSubsystem. */
  public HoodSubsystem() {}

  public void HoodUp(){
    TurretHood.set(true);
  }

  public void HoodDown(){
    TurretHood.set(false);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
