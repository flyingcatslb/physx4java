package net.physx4java.dynamics.joints;

import net.physx4java.dynamics.actors.Actor;
/**
 * Abstract base class for the different types of joints. 
All joints are used to connect two dynamic actors, or an actor and the environment.

A NULL actor represents the environment. Whenever the below comments mention two actors, one of them may always be the environment (NULL).


 * @author MikL
 *
 */
public abstract class Joint {
	Actor actor1,actor2;
	public Actor getActor1() {
		return actor1;
	}
	public Actor getActor2() {
		return actor2;
	}
	public abstract JointDesc getJointDesc();
	public Joint() {
		super();
	
	}
	
	public int getId() {
		return getJointDesc().getId();
	}
}
