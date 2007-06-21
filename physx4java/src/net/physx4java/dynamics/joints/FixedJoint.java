package net.physx4java.dynamics.joints;

import net.physx4java.Functions;

public class FixedJoint extends Joint{

	public FixedJoint(JointDesc desc) {
		super(desc);
		Functions.jointFixedCreate(getId(), getJointDesc().actor1.getId(), getJointDesc().actor2.getId());
		
	}
}
