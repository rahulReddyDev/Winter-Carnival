import java.lang.Math;
//////////////// FILE HEADER (INCLUDE IN EVERY FILE) //////////////////////////
//
// Title:   P05 WinterCarnival
// Files:   WinterCarnival.java, FrozenStatue.java, StarshipRobot.java,
//          DancingBadger.java
// Course:  (CS 300, Spring, and 2020)
//
// Author:  Sai Rahul Reddy Kondlapudi
// Email:   kondlapudi@wisc.edu
// Lecturer's Name: Gary Dahl
//
//////////// PAIR PROGRAMMING (MAY SKIP WHEN WORKING INDIVIDUALLY) ////////////
//
// Partner Name:    Ankit Reddy Seelam
// Partner Email:   aseelam@wisc.edu
// Partner Lecturer's Name: Hobbes LeGault
// 
// VERIFY THE FOLLOWING BY PLACING AN X NEXT TO EACH TRUE STATEMENT:
//   _X_ Write-up states that pair programming is allowed for this assignment.
//   _X_ We have both read and understood the course Pair Programming Policy.
//   _X_ We have registered our team prior to the team registration deadline.
//
///////////////////////// ALWAYS CREDIT OUTSIDE HELP //////////////////////////
//
// Students who get help from sources other than their partner and the course 
// staff must fully acknowledge and credit those sources here.  If you did not
// receive any help of any kind from outside sources, explicitly indicate NONE
// next to each of the labels below.
//
// Persons:         none
// Online Sources:  none  
//
///////////////////////////////////////////////////////////////////////////////

/**
 * @author SaiRahulReddyKondlapudi
 * 
 * @author AnkitReddySeelam
 * 
 * @description - This is the WinterCarnival class
 *
 */
public class StarshipRobot extends FrozenStatue {

  protected float[][] beginAndEnd;
  protected float[] destination;
  protected float speed;

/*
 * This is the Constructor for the Starship class which takes in and two dimensional array as a 
 * param.
 * 
 * @param arr- It takes in a two dimensional array as the parameter.
 */
  public StarshipRobot(float[][] arr) {
    super(arr[0]);
    beginAndEnd = arr;
    destination = beginAndEnd[1];
    speed = 6;
    imageName = "images/starshipRobot.png";
  }
/*
 * The moveTowardDestination method should update the position of the object that it is called on
 *  by moving it speed units closer to its destination.Additionally, this method should set this 
 *  object’s isFacingRight field to true, when its destination x-position is larger than its own 
 *  x-position. Otherwise the isFacingRight field should be set to false. Finally, this method 
 *  should return true when the initial distance (before moving) between this object and its 
 *  destination is less than 2x its speed, otherwise it should return false.
 */
  protected boolean moveTowardDestination() {
    double distance = Math
            .sqrt(Math.pow((destination[0] - this.x), 2) + Math.pow(destination[1] - this.y, 2));
    this.x = (float) (this.x + ((speed * (destination[0] - this.x)) / distance));
    this.y = (float) (this.y + ((speed * (destination[1] - this.y)) / distance));

    if (destination[0] > this.x) {
      isFacingRight = false;
    } else {
      isFacingRight = true;
    }
    if (distance < (2 * speed)) {
      return true;
    }
    return false;
  }
  
/*
 * The updateDestination() method should be called from update() to make this change. And the 
 * result is that the starship should move back and forth between the specified start and
 *  stop positions.
 */
  protected void updateDestination() {
    if (moveTowardDestination()) {
      // update destination
      if (destination.equals(beginAndEnd[0])) {
        destination = beginAndEnd[1];
      } else {
        destination = beginAndEnd[0];
      }
    }
  }
/*
 *  Calls the update method that is defined within the FrozenStatue class, to draw itself to the screen
 *  at its new position
 */
  @Override
  public void update(SimulationEngine engine) {
    updateDestination();
    super.update(engine);

  }


}