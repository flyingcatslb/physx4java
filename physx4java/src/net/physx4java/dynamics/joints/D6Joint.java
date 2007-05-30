package net.physx4java.dynamics.joints;

import net.physx4java.Functions;

public class D6Joint extends Joint{
	JointD6Desc jointDesc;
	public D6Joint(JointD6Desc desc) {
		super();
		this.jointDesc = desc;
		Functions.jointD6Create(desc.getId());
		
	}
	public JointD6Desc getJointD6Desc() {
		return jointDesc;
	} 
	

	@Override
	public JointDesc getJointDesc() {
		// TODO Auto-generated method stub
		return jointDesc;
	}
	
	
}
