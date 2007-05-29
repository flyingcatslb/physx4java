package net.physx4java.dynamics.joints;

import net.physx4java.Functions;
import net.physx4java.dynamics.actors.Actor;

public abstract class Joint {
	Actor actor1,actor2;
	public abstract JointDesc getJointDesc();
	public Joint() {
		super();
	
	}
	
	public int getId() {
		return getJointDesc().getId();
	}
}
