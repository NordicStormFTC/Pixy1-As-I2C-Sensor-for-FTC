package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import java.util.ArrayList;

public class OpMode extends LinearOpMode {

    private Pixy1 pixy;

    @Override
    public void runOpMode() throws InterruptedException {

        pixy = hardwareMap.get(Pixy1.class, "deviceName");
        ArrayList<PixyBlock> detectedBlocks;

        waitForStart();
        while(opModeIsActive()){
            detectedBlocks = pixy.read();

            if(detectedBlocks.get(0) != null){
                telemetry.addLine(detectedBlocks.get(0).toString());
            }
            telemetry.update();
        }
    }
}
