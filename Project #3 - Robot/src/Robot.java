/**
 * COSC 210-001		Assignment 3
 * Robot.java
 *
 * This program will ask a user to input the the name of a robot
 * the request the input from the user which moves the robot on
 * both the x and y axis and will return how far it has traveled
 * as well as it's location.
 *
 * @author Zackery Bednar
 */

public class Robot 
  {
    private int  distanceX, distanceY, totalDistance, x, y;
    private String name = "None";

    public Robot(String name) 
      {
    	super();
        this.distanceX = x;
        this.distanceY = y;
        this.name = name;
      }
	
	public void setName(String name) 
	  {
		this.name = name;
	  }

    public String getName() 
      {
        return name;
      }

    public int getX() 
      {
        return distanceX;
      }

    public void moveX(int distanceX) 
      {
        this.distanceX += distanceX;
        totalDistance += Math.abs(distanceX);
      }

    public int getY() 
      {
        return distanceY;
      }

    public void moveY(int distanceY)
      {
        this.distanceY += distanceY;
        totalDistance += Math.abs(distanceY);
      }

    public int getTotalDistance() 
      {
        return totalDistance;
      }
}