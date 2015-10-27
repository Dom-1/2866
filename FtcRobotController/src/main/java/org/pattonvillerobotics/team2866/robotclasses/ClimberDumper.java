package org.pattonvillerobotics.team2866.robotclasses;

import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by Nathan Skelton on 10/25/15.
 * <p/>
 *
 * TODO: Determine servo values for up and down
 */
public class ClimberDumper {

    private static final double UP = 0;
    private static final double DOWN = 0;
    private HardwareMap hardwareMap;
    private Servo servo;

    public ClimberDumper(HardwareMap hardwareMap) {
        this.hardwareMap = hardwareMap;
        this.servo = this.hardwareMap.servo.get("servo");

    }

    public void move(DirectionEnum direction)

}