package net.physx4java.dynamics.joints;

import net.physx4java.Functions;

public class RevoluteJoint extends Joint{
	
	public RevoluteJoint(RevoluteJointDesc desc) {
		super(desc);
		Functions.jointCreate(desc.getId());
		
		// TODO Auto-generated constructor stub
	}
	public float getAngle() {
		return Functions.jointRevoluteGetAngle(jointDesc.id);
	}
	public float getVelocity() {
		return Functions.jointRevoluteGetVelocity(jointDesc.id);
	}
	public RevoluteJointDesc getRevoluteJointDesc() {
		// TODO Auto-generated method stub
		return (RevoluteJointDesc)super.getJointDesc();
	}
	

}
