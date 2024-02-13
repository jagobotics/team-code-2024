package frc.robot;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

import edu.wpi.first.wpilibj2.command.button.Trigger;

import com.revrobotics.CANSparkLowLevel.MotorType;

public class shooter {

    private GenericHID m_driverController;

    private final CANSparkMax leftShoot = new CANSparkMax(6, MotorType.kBrushless);
    public CANSparkMax getLeftShoot() {
        return leftShoot;
    }
    private final CANSparkMax rightShoot = new CANSparkMax(9, MotorType.kBrushless);
    public CANSparkMax getRightShoot() {
        return rightShoot;
    }
    private final JoystickButton shooterON = new JoystickButton(m_driverController, XboxController.Button.kA.value);
    
    public Trigger a(){
        if(shooterON.getAsBoolean()){
            leftShoot.set(0.5);
        }
        return shooterON;
    }
}
