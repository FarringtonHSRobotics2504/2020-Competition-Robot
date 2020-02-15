/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;
import edu.wpi.first.wpilibj.PWMVictorSPX;


/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 * 
 * 
 */


public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.

  // drivetrain
  PWMVictorSPX leftFrontDrive = new PWMVictorSPX(1);
  PWMVictorSPX leftAftDrive = new PWMVictorSPX(2);
  PWMVictorSPX rightFrontDrive = new PWMVictorSPX(3);
  PWMVictorSPX rightAftDrive = new PWMVictorSPX(4);

  // intake
  PWMVictorSPX intakeMotor = new PWMVictorSPX(5);

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}