/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;


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
  public static int leftFDPort = 1;
  public static int leftADPort = 2;
  public static int rightFDPort = 3;
  public static int rightADPort = 4;

  //shooter
  public static int lShooter = 5;
  public static int rShooter = 6;

  // intake & conveyer (Mechanical team said it's all just one)
  public static int iTPort = 5;

  //port
  public static int joyStickPort = 0;
  public static int joyStickPortTwo = 1;

  

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
