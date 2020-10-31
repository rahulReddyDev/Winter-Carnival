//////////////// FILE HEADER (INCLUDE IN EVERY FILE) //////////////////////////
//
// Title: P05 WinterCarnival
// Files: WinterCarnival.java, FrozenStatue.java, StarshipRobot.java,
// DancingBadger.java
// Course: (CS 300, Spring, and 2020)
//
// Author: Sai Rahul Reddy Kondlapudi
// Email: kondlapudi@wisc.edu
// Lecturer's Name: Gary Dahl
//
//////////// PAIR PROGRAMMING (MAY SKIP WHEN WORKING INDIVIDUALLY) ////////////
//
// Partner Name: Ankit Reddy Seelam
// Partner Email: aseelam@wisc.edu
// Partner Lecturer's Name: Hobbes LeGault
//
// VERIFY THE FOLLOWING BY PLACING AN X NEXT TO EACH TRUE STATEMENT:
// _X_ Write-up states that pair programming is allowed for this assignment.
// _X_ We have both read and understood the course Pair Programming Policy.
// _X_ We have registered our team prior to the team registration deadline.
//
///////////////////////// ALWAYS CREDIT OUTSIDE HELP //////////////////////////
//
// Students who get help from sources other than their partner and the course
// staff must fully acknowledge and credit those sources here. If you did not
// receive any help of any kind from outside sources, explicitly indicate NONE
// next to each of the labels below.
//
// Persons: none
// Online Sources: none
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
public class DancingBadger extends StarshipRobot {

  protected DanceStep[] danceSteps;
  protected int stepIndex;

  /*
   * This is constructor for DancingBagder class that takes in two arrays as parameters
   * 
   * @param startingPos - This is one dimensional array as a parameter for the constructor
   * 
   * @param danceSteps - This is one dimensional array as a parameter for the constructor
   */
  public DancingBadger(float[] startingPos, DanceStep[] danceSteps) {
    super(new float[][] {startingPos, danceSteps[0].getPositionAfter(startingPos)});
    imageName = "images/dancingBadger.png";
    speed = 2;
    this.danceSteps = danceSteps;
    stepIndex = 1;
  }


  /*
   * The DancingBadger class will need to update this destination
   * vector according to the next dance step (the one inside danceSteps, at index stepIndex). After
   * updating this destination vector, increment the stepIndex by one. When the stepIndex
   * gets larger than the largest valid array index, IT resetS to 0 so that it restarts the sequence
   * of steps from the beginning.
   */
  @Override
  protected void updateDestination() {
    if (moveTowardDestination()) {
      if (stepIndex + 1 > danceSteps.length) {
        stepIndex = 0;
      }
      destination = danceSteps[stepIndex].getPositionAfter(destination);
      ++stepIndex;
    }
  }

}