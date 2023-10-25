package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.VictorSP;

public class Drivetrain extends SubsystemBase{
private VictorSP leftVictor, rightVictor;
public Drivetrain(){
    leftVictor = new VictorSP(0);//num that coresponds there;)
    rightVictor = new VictorSP(3);//jdaldfjaldsfjla;)
    leftVictor.setInverted(true);
}
public void drive (double leftSpeed, double rightSpeed) {
    leftVictor.set(leftSpeed);
    rightVictor.set(rightSpeed);
}

public void stop() {
    leftVictor.set(0);
    rightVictor.set(0);
}



}
