package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.Robot;

public class DriveSubsystem extends SubsystemBase {

    public PWMVictorSPX LFD;
    public PWMVictorSPX LAD;
    public PWMVictorSPX RFD;
    public PWMVictorSPX RAD;
   
    
    @Override
    public void init(Robot robot)) {
        //Getting Motor
      LFD = new PWMVictorSPX(Constants.leftFDPort);
      LAD = new PWMVictorSPX(Constants.leftADPort);
      RFD = new PWMVictorSPX(Constants.rightFDPort); 
      RAD = new PWMVictorSPX(Constants.rightADPort); 

    }








}






