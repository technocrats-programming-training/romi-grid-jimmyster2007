package frc.robot;

import static lib.Romi.driveDistance;
import static lib.Romi.turnDegrees;

public class Position {
    
    int verticalPosition;
    int horizontalPosition;
    int currentAngle;

    public void driveUp() throws InterruptedException {
      if (currentAngle == 0) {
        driveDistance(10);  
        verticalPosition += 10;
      }
      else {
        turnDegrees(0 - currentAngle);
        driveDistance(10);
        verticalPosition += 10;
      }
    }

    public void driveDown() throws InterruptedException {
      if (currentAngle == 180) {
        driveDistance(10);  
        verticalPosition -= 10;
      }
      else{ 
        turnDegrees(180 - currentAngle);
        driveDistance(10);
        verticalPosition -= 10;
      }
    }

    public void driveRight() throws InterruptedException {
      if (currentAngle == 90) {
        driveDistance(10);  
        horizontalPosition += 10;
      }
      else{
        turnDegrees(90 - currentAngle);
        driveDistance(10);
        horizontalPosition += 10;
      }
    }

    public void driveLeft() throws InterruptedException {
      if (currentAngle == -90) {
        driveDistance(10); 
        horizontalPosition -= 10;
      }
      else{
        turnDegrees(-90 - currentAngle);
        driveDistance(10);
        horizontalPosition -= 10;
      }
    }

    public void returnToHome() {
      
    }

    public String toString() {
        return "(" + horizontalPosition + ", " + verticalPosition + ")";
    }
}
