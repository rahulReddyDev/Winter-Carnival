import java.util.ArrayList;
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
public class WinterCarnival extends SimulationEngine {

  private ArrayList<FrozenStatue> objects = new ArrayList<FrozenStatue>(); // Holds all the Winter
                                                                           //Carnival Objects
/*
 *  This is the constructor for WinterCarnival which is called when the WinterCarnival object is
 *  created.
 *  
 */
  public WinterCarnival() {
    float[] a = {600, 100};
    float[] b = {200, 500};
    float[][]c = { { 0, 0 }, { 600, 100 }};
    float[][]d= { { 800, 300 }, { 200, 500 }};
    float[] badgerPos1 = new float[] {304, 268};
    float[] badgerPos2 = new float[] {368, 268};
    float[] badgerPos3 = new float[] {432, 268};
    float[] badgerPos4 = new float[] {496, 268};
    DanceStep[] danceSteps =
          {DanceStep.Left, DanceStep.Right, DanceStep.Right, DanceStep.Left, DanceStep.Down,
              DanceStep.Left, DanceStep.Right, DanceStep.Right, DanceStep.Left, DanceStep.Up};
    objects.add(new FrozenStatue(a));
    objects.add(new FrozenStatue(b));
    objects.add(new StarshipRobot(c));
    objects.add(new StarshipRobot(d));
    objects.add(new DancingBadger(badgerPos1, danceSteps));
    objects.add(new DancingBadger(badgerPos2, danceSteps));
    objects.add(new DancingBadger(badgerPos3, danceSteps));
    objects.add(new DancingBadger(badgerPos4, danceSteps));
  }
/*
 * This method is meant to be overloaded by any derived class, to describe how this simulation
 *  should change and be updated over time.
 */
  @Override
  public void update() {
    for (int i = 0; i < objects.size(); ++i) {
      objects.get(i).update(this);
    }
  }
/*
 *  This is the method that is used to create a winter carnival object
 *  
 */
  public static void main(String[] args) {
    WinterCarnival winObj = new WinterCarnival();
  }

}
