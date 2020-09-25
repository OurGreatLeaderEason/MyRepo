package org.firstinspires.ftc.teamcode;

import com.ftc11392.sequoia.SequoiaOpMode;

import org.firstinspires.ftc.teamcode.subsystem.Drivetrain;
import org.firstinspires.ftc.teamcode.task.GamepadDriveTask;

public class DriveOpMode extends SequoiaOpMode {
	Drivetrain drivetrain = new Drivetrain();

	@Override
	public void initTriggers() { }

	@Override
	public void runTriggers() {
		gamepad1H.sticksButton(0.05).whilePressed(new GamepadDriveTask(drivetrain, gamepad1, telemetry));
	}
}