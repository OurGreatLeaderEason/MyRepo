package org.firstinspires.ftc.teamcode.task;

import com.ftc11392.sequoia.task.InstantTask;
import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.subsystem.Drivetrain;

public class GamepadDriveTask extends InstantTask {
	public GamepadDriveTask(Drivetrain drivetrain, final Gamepad gamepad, Telemetry telemetry) {
		super(() -> {drivetrain.dstDrive(gamepad.left_stick_y, gamepad.left_stick_x, gamepad.right_stick_x);});
	}
}
