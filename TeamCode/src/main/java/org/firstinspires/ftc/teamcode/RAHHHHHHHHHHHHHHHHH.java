package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name = "name it something")
public class RAHHHHHHHHHHHHHHHHH extends OpMode {

    DcMotor fl;
    DcMotor fr;
    DcMotor bl;
    DcMotor br;

    @Override
    public void init() {
        fl = (DcMotor) hardwareMap.get("fl");
        fr = (DcMotor) hardwareMap.get("fr");
        br = (DcMotor) hardwareMap.get("br");
        bl = (DcMotor) hardwareMap.get("bl");

        fl.setDirection(DcMotorSimple.Direction.REVERSE);
        fr.setDirection(DcMotorSimple.Direction.FORWARD);
        bl.setDirection(DcMotorSimple.Direction.REVERSE);
        br.setDirection(DcMotorSimple.Direction.FORWARD);
    }
//the reason why this is here is just to set up //
    @Override
    public void loop() {
        if(gamepad1.left_stick_y > 0) {
            fl.setPower(0.5);
            fr.setPower(0.5);
            bl.setPower(0.5);
            br.setPower(0.5);
        }

        else if(gamepad1.right_stick_x > 0) {
            fl.setPower(-0.5);
            fr.setPower(-0.5);
            bl.setPower(-0.5);
            br.setPower(-0.5);

        }
             else if(gamepad1.a){
            fl.setPower(0.5);
            fr.setPower(0);
            bl.setPower(0.5);
            br.setPower(0);


             }

             else if(gamepad1.b){

            fl.setPower(0.5);
            fr.setPower(-0.5);
            bl.setPower(0.5);
            br.setPower(-0.5);

        }

             else {
            fl.setPower(0);
            fr.setPower(0);
            bl.setPower(0);
            br.setPower(0);
        }
        }


    }

