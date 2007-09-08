package net.physx4java.dynamics.joints;

import net.physx4java.Functions;
import net.physx4java.dynamics.actors.Actor;

public class FixedJoint extends Joint{

	public FixedJoint(FixedJointDesc desc) {
		super(desc);
		
		Functions.jointFixedCreate(getId(), getId(getJointDesc().actor1), getId(getJointDesc().actor2));
		
	}
	public int getId(Actor actor) {
		if(actor==null) return -1;
		return actor.getId();
	}
}
