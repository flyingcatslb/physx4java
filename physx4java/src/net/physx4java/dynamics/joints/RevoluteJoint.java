package net.physx4java.dynamics.joints;

import net.physx4java.Functions;

public class RevoluteJoint extends Joint{
	RevoluteJointDesc desc;
	public RevoluteJoint(RevoluteJointDesc desc) {
		super(desc);
		Functions.jointCreate(desc.getId());
		
		// TODO Auto-generated constructor stub
	}
	
	public RevoluteJointDesc getJointDesc() {
		// TODO Auto-generated method stub
		return (RevoluteJointDesc)super.getJointDesc();
	}

}
