package net.physx4java.dynamics.joints;

import net.physx4java.Functions;

public class RevoluteJointDesc extends JointDesc{

	public RevoluteJointDesc() {
		super();
		Functions.jointRevoluteDescCreate(id);
	}
	public void setLimit(float hardness1, float restitution1, float value1, float hardness2, float restitution2, float value2) {
		Functions.jointRevoluteDescSetLimit(id, hardness1, restitution1, value1, hardness2, restitution2, value2);
	}
	public void setMotor(float velTarget, float maxForce, boolean freeSpin) {
		Functions.jointRevoluteDescSetMotor(id, velTarget, maxForce, freeSpin);
	}
	public void setSpring(float spring, float damper, float targetValue) {
		Functions.jointRevoluteDescSetSpring(id, spring, damper, targetValue);
	}
	public void setFlags(Functions.NxRevoluteJointFlag flag) {
		Functions.jointRevoluteDescSetFlags(id, flag.getValue());
	}
}	
