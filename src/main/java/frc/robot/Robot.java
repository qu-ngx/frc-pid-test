
package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.TimedRobot;

public class Robot extends TimedRobot {
  //Variables
  //Wheels' velocity
  double leftSlow = 0.25;
  double rightSlow = 0.24;

  //Rotation Speed
  double rotateSpeed = 0.35;
  double rotateSpeedSlow = 0.25; 

  //Inputs
  AnalogGyro gyro = new AnalogGyro(0); //(The changing to NavX to test later) (Max of the example gyro is 300 deg)
  
  //Outputs:
  WPI_TalonSRX leftMotor = new WPI_TalonSRX(0);
  WPI_TalonSRX rightMotor = new WPI_TalonSRX(1);
  Servo camera = new Servo(2);


  @Override
  public void robotInit() {
    CameraServer.startAutomaticCapture(0);
    gyro.reset();
    //Reset everytime the robot is turned on, the Camera starts and the gyro reset
  }


  @Override
  public void robotPeriodic() {
  }

  @Override
  public void autonomousInit() {
  }

  
  @Override
  public void autonomousPeriodic() {
  
  }

  @Override
  public void teleopInit() {}

  @Override
  public void teleopPeriodic() {}

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void testInit() {}

  @Override
  public void testPeriodic() {}

  @Override
  public void simulationInit() {}

  @Override
  public void simulationPeriodic() {}
}
