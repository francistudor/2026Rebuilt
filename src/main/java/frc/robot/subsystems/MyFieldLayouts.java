package frc.robot.subsystems;

import java.util.List;
import edu.wpi.first.apriltag.AprilTag;
import edu.wpi.first.apriltag.AprilTagFieldLayout;
import edu.wpi.first.math.geometry.Pose3d;
import edu.wpi.first.math.geometry.Rotation3d;

public class MyFieldLayouts {

    public static AprilTagFieldLayout createRebuilt2026Layout() {
        List<AprilTag> tags = List.of(
            new AprilTag(1,  new Pose3d(467.08*0.0254, 291.79*0.0254, 35.00*0.0254, new Rotation3d(0,0,Math.toRadians(180)))),
            new AprilTag(2,  new Pose3d(468.56*0.0254, 182.08*0.0254, 44.25*0.0254, new Rotation3d(0,0,Math.toRadians(90)))),
            new AprilTag(3,  new Pose3d(444.80*0.0254, 172.32*0.0254, 44.25*0.0254, new Rotation3d(0,0,Math.toRadians(180)))),
            new AprilTag(4,  new Pose3d(444.80*0.0254, 158.32*0.0254, 44.25*0.0254, new Rotation3d(0,0,Math.toRadians(180)))),
            new AprilTag(5,  new Pose3d(468.56*0.0254, 134.56*0.0254, 44.25*0.0254, new Rotation3d(0,0,Math.toRadians(270)))),
            new AprilTag(6,  new Pose3d(467.08*0.0254, 24.85*0.0254, 35.00*0.0254, new Rotation3d(0,0,Math.toRadians(180)))),
            new AprilTag(7,  new Pose3d(470.03*0.0254, 24.85*0.0254, 35.00*0.0254, new Rotation3d(0,0,Math.toRadians(0)))),
            new AprilTag(8,  new Pose3d(482.56*0.0254, 134.56*0.0254, 44.25*0.0254, new Rotation3d(0,0,Math.toRadians(270)))),
            new AprilTag(9,  new Pose3d(492.33*0.0254, 144.32*0.0254, 44.25*0.0254, new Rotation3d(0,0,Math.toRadians(0)))),
            new AprilTag(10, new Pose3d(492.33*0.0254, 158.32*0.0254, 44.25*0.0254, new Rotation3d(0,0,Math.toRadians(0)))),
            new AprilTag(11, new Pose3d(482.56*0.0254, 182.08*0.0254, 44.25*0.0254, new Rotation3d(0,0,Math.toRadians(90)))),
            new AprilTag(12, new Pose3d(470.03*0.0254, 291.79*0.0254, 35.00*0.0254, new Rotation3d(0,0,Math.toRadians(0)))),
            new AprilTag(13, new Pose3d(649.58*0.0254, 291.02*0.0254, 21.75*0.0254, new Rotation3d(0,0,Math.toRadians(180)))),
            new AprilTag(14, new Pose3d(649.58*0.0254, 274.02*0.0254, 21.75*0.0254, new Rotation3d(0,0,Math.toRadians(180)))),
            new AprilTag(15, new Pose3d(649.57*0.0254, 169.78*0.0254, 21.75*0.0254, new Rotation3d(0,0,Math.toRadians(180)))),
            new AprilTag(16, new Pose3d(649.57*0.0254, 152.78*0.0254, 21.75*0.0254, new Rotation3d(0,0,Math.toRadians(180)))),
            new AprilTag(17, new Pose3d(183.03*0.0254, 24.85*0.0254, 35.00*0.0254, new Rotation3d(0,0,Math.toRadians(0)))),
            new AprilTag(18, new Pose3d(181.56*0.0254, 134.56*0.0254, 44.25*0.0254, new Rotation3d(0,0,Math.toRadians(270)))),
            new AprilTag(19, new Pose3d(205.32*0.0254, 144.32*0.0254, 44.25*0.0254, new Rotation3d(0,0,Math.toRadians(0)))),
            new AprilTag(20, new Pose3d(205.32*0.0254, 158.32*0.0254, 44.25*0.0254, new Rotation3d(0,0,Math.toRadians(0)))),
            new AprilTag(21, new Pose3d(181.56*0.0254, 182.08*0.0254, 44.25*0.0254, new Rotation3d(0,0,Math.toRadians(90)))),
            new AprilTag(22, new Pose3d(183.03*0.0254, 291.79*0.0254, 35.00*0.0254, new Rotation3d(0,0,Math.toRadians(0)))),
            new AprilTag(23, new Pose3d(180.08*0.0254, 291.79*0.0254, 35.00*0.0254, new Rotation3d(0,0,Math.toRadians(180)))),
            new AprilTag(24, new Pose3d(167.56*0.0254, 182.08*0.0254, 44.25*0.0254, new Rotation3d(0,0,Math.toRadians(90)))),
            new AprilTag(25, new Pose3d(157.79*0.0254, 172.32*0.0254, 44.25*0.0254, new Rotation3d(0,0,Math.toRadians(180)))),
            new AprilTag(26, new Pose3d(157.79*0.0254, 158.32*0.0254, 44.25*0.0254, new Rotation3d(0,0,Math.toRadians(180)))),
            new AprilTag(27, new Pose3d(167.56*0.0254, 134.56*0.0254, 44.25*0.0254, new Rotation3d(0,0,Math.toRadians(270)))),
            new AprilTag(28, new Pose3d(180.08*0.0254, 24.85*0.0254, 35.00*0.0254, new Rotation3d(0,0,Math.toRadians(180)))),
            new AprilTag(29, new Pose3d(0.54*0.0254, 25.62*0.0254, 21.75*0.0254, new Rotation3d(0,0,Math.toRadians(0)))),
            new AprilTag(30, new Pose3d(0.54*0.0254, 42.62*0.0254, 21.75*0.0254, new Rotation3d(0,0,Math.toRadians(0)))),
            new AprilTag(31, new Pose3d(0.55*0.0254, 146.86*0.0254, 21.75*0.0254, new Rotation3d(0,0,Math.toRadians(0)))),
            new AprilTag(32, new Pose3d(0.55*0.0254, 163.86*0.0254, 21.75*0.0254, new Rotation3d(0,0,Math.toRadians(0))))
        );

        double fieldLength = 16.54; // w metrach
        double fieldWidth = 8.02;

        return new AprilTagFieldLayout(tags, fieldLength, fieldWidth);
    }
}
