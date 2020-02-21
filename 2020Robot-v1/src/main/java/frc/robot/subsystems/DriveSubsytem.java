/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;


import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;
import frc.robot.commands.DriveManuallyCommand;


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

  public SpeedControllerGroup lDrive = new SpeedControllerGroup(leftAD, leftFD);
  public SpeedControllerGroup rDrive = new SpeedControllerGroup(rightAD, rightFD);

  public DifferentialDrive drive = new DifferentialDrive(lDrive, rDrive);

  public DriveSubsytem(){
    //Hmmm.. This is a constructor function the beta wolves uses for thier robot I am not quite 100% sure if we need it or not... 
    // OH nevermind we dont need it hahahahha


  }

  public void manualDrive(double move, double turn){

    if(move > .5) move = 0.5;
    //Lets robot move at half speed, we can use this if statement and apply it to other things like Conveyer Belt

    drive.arcadeDrive(move, turn);
    //Instant editing if changes needed in robot thats why its in subsystem and called later

  }
  
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new DriveManuallyCommand());
  }
}
