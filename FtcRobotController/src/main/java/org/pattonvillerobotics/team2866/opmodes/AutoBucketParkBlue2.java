package org.pattonvillerobotics.team2866.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.pattonvillerobotics.team2866.robotclasses.ClimbAssist;
import org.pattonvillerobotics.team2866.robotclasses.ClimberDumper;
import org.pattonvillerobotics.team2866.robotclasses.Direction;
import org.pattonvillerobotics.team2866.robotclasses.Drive;
import org.pattonvillerobotics.team2866.robotclasses.OpMode;
import org.pattonvillerobotics.team2866.robotclasses.ZipRelease;

/**
 * Created by skeltonn on 11/20/15.
 *
 * TODO: Measure and write OpMode
 */
@OpMode("Blue Park 2")
public class AutoBucketParkBlue2 extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        Drive drive = new Drive(hardwareMap, this);
        ClimberDumper climberDumper = new ClimberDumper(hardwareMap);
        ClimbAssist climbAssist = new ClimbAssist(hardwareMap);
        ZipRelease zipRelease = new ZipRelease(hardwareMap);

        zipRelease.moveLeft(Direction.DOWN);
        zipRelease.moveRight(Direction.DOWN);
        climberDumper.move(Direction.DOWN);

        waitForStart();

        CommonAutonomous.firstPosition2(drive);
        drive.rotateDegrees(Direction.RIGHT, 45, 1); //Make sure this goes at a 45˚ angle!
        CommonAutonomous.secondPositionTravel(drive);
        drive.rotateDegrees(Direction.RIGHT, 45, 1);
        CommonAutonomous.dumpClimber(drive);
        drive.stop();
    }
}
