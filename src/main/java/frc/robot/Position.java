package frc.robot;

import static lib.Romi.driveDistance;
import static lib.Romi.turnDegrees;

public class Position {
    
    int verticalPosition;
    int horizontalPosition;
    int beeschurger;

    public void driveUp() throws InterruptedException {
      if (beeschurger == 0) {
        driveDistance(10);  
        verticalPosition += 10;
      }
      else {
        turnDegrees(0 - beeschurger);
      }
    }

    public void driveDown() throws InterruptedException {
      if (beeschurger == 180) {
        driveDistance(10);  
        verticalPosition -= 10;
      }
      else{ 
        turnDegrees(180 - beeschurger);
      }
    }

    public void driveRight() throws InterruptedException {
      if (beeschurger == 90) {
        driveDistance(10);  
        horizontalPosition += 10;
      }
      else{
        turnDegrees(90 - beeschurger);
      }
    }

    public void driveLeft() throws InterruptedException {
      if (beeschurger == -90) {
        driveDistance(10); 
        horizontalPosition -= 10;
      }
      else{
        turnDegrees(-90 - beeschurger);
      }
    }

    public void returnToHome() {
      
    }

    public String toString() {
        return "(" + horizontalPosition + ", " + verticalPosition + ")";
    }
}
