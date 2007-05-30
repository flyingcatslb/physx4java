package net.physx4java.dynamics.joints;

import net.physx4java.Functions;

public class D6Joint extends Joint{
	
	public D6Joint(D6JointDesc desc) {
		super(desc);
		Functions.jointCreate(desc.getId());
		
	}
	public D6JointDesc getJointD6Desc() {
		return (D6JointDesc) jointDesc;
	} 
	

	@Override
	public JointDesc getJointDesc() {
		// TODO Auto-generated method stub
		return jointDesc;
	}
	
	
}
