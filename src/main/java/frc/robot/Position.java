package frc.robot;

import static lib.Romi.driveDistance;
import static lib.Romi.turnDegrees;

public class Position {
    
    int verticalPosition;
    int horizontalPosition;
    int currentAngle;

    public void driveUp() throws InterruptedException {
      // if currentAngle = 0 then driveDistance(10) then verticalPosition += 10 else turnDegrees(90) and currentAngle + 90  if currentAngle = 0 then driveDistance(10) then verticalPosition += 10 else turnDegrees(90) and currentAngle + 90 if currentAngle = 0 then driveDistance(10) then verticalPosition += 10 else turnDegrees(90) and currentAngle + 90;
        verticalPosition += 10;
    }

    public void driveDown() throws InterruptedException {
      
      verticalPosition -= 10;
    }

    public void driveRight() throws InterruptedException {
      
      horizontalPosition += 10;
    }

    public void driveLeft() throws InterruptedException {
      turnDegrees(-90);
      horizontalPosition -= 10;
    }

    public void returnToHome() {
      
    }

    public String toString() {
        return "(" + horizontalPosition + ", " + verticalPosition + ")";
    }
}
