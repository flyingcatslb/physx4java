package net.physx4java.dynamics.joints;

import net.physx4java.Functions;

public class JointD6Desc extends JointDesc {

	public JointD6Desc() {
		super();
		Functions.jointDescD6Create(id);
		//Functions.jointD6DescsetLinearDegreesOfFreedom(id,1,1,1);
	}

}
