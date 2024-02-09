// package frc.robot.subsystems.swervedrive;
// import com.revrobotics.CANSparkMax;
// import com.revrobotics.CANSparkMaxLowLevel.MotorType;
// import edu.wpi.first.wpilibj.AddressableLED;
// import edu.wpi.first.wpilibj.AddressableLEDBuffer;
// import edu.wpi.first.wpilibj.DigitalInput;
// import edu.wpi.first.wpilibj.DigitalOutput;
// import edu.wpi.first.wpilibj.Joystick;
// import edu.wpi.first.wpilibj.XboxController;
// import edu.wpi.first.wpilibj2.command.SubsystemBase;
// import edu.wpi.first.wpilibj2.command.Command;
// import edu.wpi.first.wpilibj2.command.Commands; 

// public class intake extends SubsystemBase {
//     private CANSparkMax intake;
 
    

//     public intake() {
//         intake = new CANSparkMax(9, com.revrobotics.CANSparkLowLevel.MotorType.kBrushless);
//         intake.restoreFactoryDefaults();
//         intake.setInverted(true);

        
//     }
    
//     public void turnOnIndicator() {} 

//     public void turnOffIndicator() {  }

    


//     public void setSpeed(double speed) {  }


//     public void runIntake(Joystick joystick){
//         if (joystick.getRawButton(XboxController.Button.kRightBumper.value)) {
         
//             intake.set(-1);

        

    

   

    
//     }
// }
// public Command intakecmd(Joystick joystick1){

//     return run(
        
    
//     ()-> runIntake(joystick1)
    
//     );
// }


// }
