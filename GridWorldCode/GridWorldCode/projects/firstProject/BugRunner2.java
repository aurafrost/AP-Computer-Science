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
import info.gridworld.actor.Flower;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;


/**
 * This class runs a world that contains a bug and a rock, added at random
 * locations. Click on empty locations to add additional actors. Click on
 * populated locations to invoke methods on their occupants. <br />
 * To build your own worlds, define your own actors and a runner class. See the
 * BoxBugRunner (in the boxBug folder) for an example. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class BugRunner2
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        //Flower
        world.add(new Location(0,4),new Flower());
        world.add(new Location(0,5),new Flower());
        world.add(new Location(1,3),new Flower());
        world.add(new Location(1,6),new Flower());
        world.add(new Location(2,2),new Flower());
        world.add(new Location(2,4),new Flower());
        world.add(new Location(2,5),new Flower());
        world.add(new Location(2,7),new Flower());
        world.add(new Location(3,1),new Flower());
        world.add(new Location(3,3),new Flower());
        world.add(new Location(3,6),new Flower());
        world.add(new Location(3,8),new Flower());
        world.add(new Location(4,2),new Flower());
        world.add(new Location(4,4),new Flower());
        world.add(new Location(4,5),new Flower());
        world.add(new Location(4,7),new Flower());
        world.add(new Location(5,3),new Flower());
        world.add(new Location(5,6),new Flower());
        world.add(new Location(6,4),new Flower());
        world.add(new Location(6,5),new Flower());
        world.add(new Location(7,4),new Flower());
        world.add(new Location(7,5),new Flower());
        world.add(new Location(8,3),new Flower());
        world.add(new Location(8,4),new Flower());
        world.add(new Location(8,5),new Flower());
        world.add(new Location(8,6),new Flower());
        world.add(new Location(9,2),new Flower());
        world.add(new Location(9,3),new Flower());
        world.add(new Location(9,4),new Flower());
        world.add(new Location(9,5),new Flower());
        world.add(new Location(9,6),new Flower());
        world.add(new Location(9,7),new Flower());
         
        //Rock
        world.add(new Location(1,4),new Rock());
        world.add(new Location(1,5),new Rock());
        world.add(new Location(2,3),new Rock());
        world.add(new Location(2,6),new Rock());
        world.add(new Location(3,2),new Rock());
        world.add(new Location(3,7),new Rock());
        world.add(new Location(4,3),new Rock());
        world.add(new Location(4,6),new Rock());
        world.add(new Location(5,4),new Rock());
        world.add(new Location(5,5),new Rock());

        //Actor
        world.add(new Location(3,4),new Actor());
        world.add(new Location(3,5),new Actor());
        
        //J
        world.add(new Location(5,2),new Actor());
        world.add(new Location(6,2),new Actor());
        world.add(new Location(7,2),new Actor());
        world.add(new Location(7,1),new Actor());
        world.add(new Location(7,0),new Actor());
        world.add(new Location(6,0),new Actor());
        
        //T
        world.add(new Location(5,7),new Actor());
        world.add(new Location(5,8),new Actor());
        world.add(new Location(5,9),new Actor());
        world.add(new Location(6,8),new Actor());
        world.add(new Location(7,8),new Actor());
        
        //Bug
        world.add(new Location(9,9),new Bug());
        
        world.show();
    }
}
