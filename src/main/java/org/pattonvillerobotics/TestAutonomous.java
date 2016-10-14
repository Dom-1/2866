package org.pattonvillerobotics;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.pattonvillerobotics.commoncode.enums.Direction;
import org.pattonvillerobotics.commoncode.robotclasses.drive.AbstractComplexDrive;
import org.pattonvillerobotics.commoncode.robotclasses.drive.GyroEncoderDrive;
import org.pattonvillerobotics.opmodes.CustomizedRobotParameters;

@Autonomous(name = "Testing Autonomous", group = "Generic OpModes")
public class TestAutonomous extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        AbstractComplexDrive drive = new GyroEncoderDrive(hardwareMap, this, CustomizedRobotParameters.ROBOT_PARAMETERS);

        waitForStart();

        //drive.moveInches(Direction.FORWARD, 100, 0.5);
        drive.rotateDegrees(Direction.RIGHT, 360, .5);
    }
}