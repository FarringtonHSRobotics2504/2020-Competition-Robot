/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class DriveSubsytem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.


  public PWMVictorSPX leftAD = new PWMVictorSPX(RobotMap.leftADPort);
  public PWMVictorSPX leftFD = new PWMVictorSPX(RobotMap.leftFDPort);
  public PWMVictorSPX rightAD = new PWMVictorSPX(RobotMap.rightADPort);
  public PWMVictorSPX rightFD = new PWMVictorSPX(RobotMap.rightFDPort);

  public DifferentialDrive lDrive = new DifferentialDrive(leftAD, leftFD);

  public DifferentialDrive rDrive = new DifferentialDrive(rightAD, rightFD);

  public DifferentialDrive drive = new DifferentialDrive(lDrive, rDrive);
  
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
