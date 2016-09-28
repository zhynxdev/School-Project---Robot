/**
 * COSC 210-001		Assignment 3
 * Prog3.java
 *
 * This program will ask a user to input the the name of a robot
 * the request the input from the user which moves the robot on
 * both the x and y axis and will return how far it has traveled
 * as well as it's location.
 *
 * @author Zackery Bednar
 */
import java.util.Scanner;
public class Prog3 
{
	 
  public static void main(String[] args)
    {
	  Scanner scanner = new Scanner(System.in);
	  String name = null;
	  
	  //Scanner for robot name
	  System.out.println("Enter the robot's name: ");
	  name = scanner.nextLine();
	  Robot r = new Robot(name);
	  
	  //Infinite loop to continue getting travel information
	  while(true)
	    {
		  System.out.println("Direction of move (x/y/q): ");
		  char choice = scanner.next().charAt(0);
		  if(choice=='x')
		    {
			  System.out.println("Distance to travel on X-Axis: ");
			  int distanceX = scanner.nextInt();
			  r.moveX(distanceX);
		    }
		  
		  if(choice=='y')
		    {
			  System.out.println("Distance to travel on Y-Axis: ");
			  int distanceY = scanner.nextInt();
			  r.moveY(distanceY);
		    }
		  
		  if(choice=='q')
		    {
			  break;
		    }
		  
	    }
	  
	  //Return report
	  System.out.println(r.getName() + " is now at position "
	   + "( " + r.getX() + ", " + r.getY() + " ) and traveled "
	   + "an total of " + r.getTotalDistance() + " units.");

	  scanner.close();
    }
  
}
