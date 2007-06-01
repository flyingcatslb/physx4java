package net.physx4java.demos.jmonkeyengine;

import net.physx4java.Functions;
import net.physx4java.dynamics.actors.Actor;
import net.physx4java.dynamics.actors.ActorParameters;
import net.physx4java.dynamics.joints.D6Joint;
import net.physx4java.dynamics.joints.D6JointDesc;
import net.physx4java.dynamics.joints.JointDesc;
import net.physx4java.dynamics.joints.TestJoint;


public class JmeD6JointDemo1 extends JmeDemo{
	Actor actor1;
	Actor actor2;
	public void initPhysics() {
		Functions.testRunner();
		super.initPhysics();
		setStepSize(0.001f);
		//create actors
		ActorParameters params = new ActorParameters();
		params.setDensity(10);
		actor1 =  addBox(params, 1f, -2f, 2f, 0, 0.5f, 0.5f, 0.5f).getActor();
		actor2 =  addBox(params, 1f, 2f, 2f, 0,0.5f,0.5f,0.5f).getActor();
		int a = actor1.getId();
		
		
		//getDefaultMaterial().setRestitution(1f);
		//world.setTiming(0);
		D6JointDesc jd = new D6JointDesc();
		jd.setActors(actor1, actor2);
		jd.setGlobalAnchor(0,2,0);
		jd.setGlobalAxis(0,0,1f);
		jd.setAngularDegreesOfFreedom(Functions.NxD6JointMotion.NX_D6JOINT_MOTION_FREE,Functions.NxD6JointMotion.NX_D6JOINT_MOTION_LOCKED,Functions.NxD6JointMotion.NX_D6JOINT_MOTION_LOCKED);
		jd.setLinearDegreesOfFreedom(Functions.NxD6JointMotion.NX_D6JOINT_MOTION_LOCKED,Functions.NxD6JointMotion.NX_D6JOINT_MOTION_LOCKED,Functions.NxD6JointMotion.NX_D6JOINT_MOTION_LOCKED);
		//jd.setProjectionMode(Functions.NxD6JointDriveType.NX_D6JOINT_DRIVE_POSITION, Functions.NxJointProjectionMode.u);
		new D6Joint(jd);
		//jd.set
		//set actors of jointdesc
		//TestJoint joint = new TestJoint(actor1.getId(),actor2.getId());
		
		
	}
	public static void main(String[] args) {
		new JmeD6JointDemo1().start();
	}
	int count  = 500;
	
	@Override
	protected void simpleUpdate() {
		// TODO Auto-generated method stub
		super.simpleUpdate();
		count--;
		if(count<=0) {
			count = 1000;
			//System.out.println("FORCE");
			actor1.addForce(0, 500, 0);
			
		}
		
		
	}
}
