/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 */

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import java.util.Scanner;

/**
 * This class runs a world that contains a bug and a rock, added at random
 * locations. Click on empty locations to add additional actors. Click on
 * populated locations to invoke methods on their occupants. <br />
 * To build your own worlds, define your own actors and a runner class. See the
 * BoxBugRunner (in the boxBug folder) for an example. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class BugRunner3
{
    public static void main(String[] args)
    {
      
        Scanner keyboard = new Scanner(System.in);
    
        //Sets location of Bug 1.
        System.out.print("Enter row (0-9) for Bug 1.");
        int LocationXBug1 = keyboard.nextInt();
        System.out.print("Enter column (0-9) for Bug 1.");
        int LocationYBug1 = keyboard.nextInt();
       
        //Sets location of Bug 2.
        System.out.print("Enter row (0-9) for Bug 2.");
        int LocationXBug2 = keyboard.nextInt();
        System.out.print("Enter column (0-9) for Bug 2.");
        int LocationYBug2 = keyboard.nextInt();
        
        //Sets location of Rock 1.
        System.out.print("Enter row (0-9) for Rock 1.");
        int LocationXRock1 = keyboard.nextInt();
        System.out.print("Enter column (0-9) for Rock 1.");
        int LocationYRock1 = keyboard.nextInt();
        
        //Sets location of Rock 2.
        System.out.print("Enter row (0-9) for Rock 2.");
        int LocationXRock2 = keyboard.nextInt();
        System.out.print("Enter column (0-9) for Rock 2.");
        int LocationYRock2 = keyboard.nextInt();
        
        
        ActorWorld world = new ActorWorld();
        world.add(new Location(LocationXBug1, LocationYBug1), new Bug());
        world.add(new Location(LocationXBug2, LocationYBug2), new Bug());
        world.add(new Location(LocationXRock1, LocationYRock1), new Rock());
        world.add(new Location(LocationXRock2, LocationYRock2), new Rock());
        world.show();
        

    }
}
