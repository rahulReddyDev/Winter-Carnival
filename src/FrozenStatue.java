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

/*
 * The frozen statue class draws and two frozen statues on the window on the top right of the 
 * screen and the bottom left of the screen. This class contains three protected fields that are 
 * initialized by the constructor.
 */
public class FrozenStatue {

  protected float x;
  protected float y;
  protected boolean isFacingRight;
  protected String imageName;

  /*
   *  This is a constructor initializes the protected members of the class.  It initializes the path 
   *  of the image and the co-oridinates at which it is to be drawn
   *  
   *  @param arr Takes and array containing two floats that denotes positions on the window
   *  
   */
  public FrozenStatue(float[] arr) {
    this.x = arr[0];
    this.y = arr[1];
    this.isFacingRight = true;
    this.imageName = "images/frozenStatue.png";
  }

  /*
   * This method overrides the winter carnival update() method and draws the two statue images
   * on the window using the protected variables
   * 
   * @param engine - Takes a parameter of type simulation Engine(Winter Carnival)
   */
  public void update(SimulationEngine engine) {
    engine.draw(this.imageName, this.x, this.y, this.isFacingRight);
  }

 

}