package frc.robot.commands;
import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;




public class Drive extends CommandBase { 
    Drivetrain leilani;
    Joystick leftPhoebe;
    Joystick rightAiden;
    public Drive(Drivetrain a, Joystick b, Joystick c) {
        leilani = a;
        leftPhoebe = b; 
        rightAiden = c;
        super.addRequirements(leilani);
        leilani.setDefaultCommand(this);
    }
    public void execute() {
        leilani.drive(leftPhoebe.getY(), rightAiden.getY();
    }
    public void initialize(){
        leilani.stop();
    }
    public boolean isFinish(){
        return false;
    }
    public void end(boolean stop){
        leilani.stop();
    }
}
