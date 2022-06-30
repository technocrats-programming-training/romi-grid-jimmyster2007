package frc.robot;

import static lib.Romi.driveDistance;
import static lib.Romi.turnDegrees;

public class Position {
    
    int verticalPosition;
    int horizontalPosition;
    int currentAngle;

    public void driveUp() throws InterruptedException {
      if currentAngle = 0 then driveDistance(10) then verticalPosition += 10 else turnDegrees(0 + currentAngle) currentAngle = 0;
        
    }

    public void driveDown() throws InterruptedException {
      if currentAngle = 180 then driveDistance(10) then verticalPosition -= 10 else turnDegrees(0 + currentAngle) currentAngle = 180;
      
    }

    public void driveRight() throws InterruptedException {
      if currentAngle = 90 then driveDistance(10) then horizontalPosition += 10 else turnDegrees(0 + currentAngle) currentAngle = 90;
      
    }

    public void driveLeft() throws InterruptedException {
      if currentAngle = -90 then driveDistance(10) then horizontalPosition -= 10 else turnDegrees(0 + currentAngle) currentAngle = -90;
    }

    public void returnToHome() {
      
    }

    public String toString() {
        return "(" + horizontalPosition + ", " + verticalPosition + ")";
    }
}
