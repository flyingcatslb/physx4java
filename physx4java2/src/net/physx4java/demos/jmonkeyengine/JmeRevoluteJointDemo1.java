package net.physx4java.demos.jmonkeyengine;

import net.physx4java.Functions;
import net.physx4java.dynamics.actors.Actor;
import net.physx4java.dynamics.actors.ActorParameters;
import net.physx4java.dynamics.joints.D6Joint;
import net.physx4java.dynamics.joints.D6JointDesc;
import net.physx4java.dynamics.joints.RevoluteJoint;
import net.physx4java.dynamics.joints.RevoluteJointDesc;


public class JmeRevoluteJointDemo1 extends JmeDemo{
	Actor actor;
	
	RevoluteJoint joint;
	public void initPhysics() {
		//Functions.testRunner();
		super.initPhysics();
		//world.setGravity(0, 0, 0);
		//create actors
		ActorParameters params = new ActorParameters();
		params.setDensity(10);
		actor = null;
		for(int i=0;i<30;i++) {
			
		Actor prevActor = actor;
			
		actor =  addBox(params, 2f, -2f*(float)i*2, 2f, 0, 1f, 1f, 1f).getActor();
		//
		setStepSize(0.01f);
		
		//getDefaultMaterial().setRestitution(1f);
		//world.setTiming(0);
		
		if(prevActor!=null) {
			RevoluteJointDesc jd = new RevoluteJointDesc();
			jd.setActors(prevActor, actor);
			jd.setGlobalAnchor(3,3,3);
			jd.setGlobalAxis(0,1,0f);
			joint = new RevoluteJoint(jd,world);
			joint.setLimit(0, 0, (float)-0.3,0, 0, (float)0.3);
			
			//joint.setFlags(Functions.NxRevoluteJointFlag.NX_RJF_LIMIT_ENABLED.getValue()|Functions.NxRevoluteJointFlag.NX_RJF_MOTOR_ENABLED.getValue());
		}
		
		
		
		//jd.setMotor((float)Math.PI, 10000, false);
		//enable motors
		
		}
		
		
		
	}
	public static void main(String[] args) {
		new JmeRevoluteJointDemo1().start();
	}
	int count  = 500;
	float vel = -1f;
	@Override
	protected void simpleUpdate() {
		// TODO Auto-generated method stub
		super.simpleUpdate();
		count--;
		float angle = joint.getAngle();
		if(angle!=0.0)
		System.out.println("GET ANGLE = "+angle);
		if(count<=0) {
			count = 10000;
			
			
			if(angle<=-1.9||angle>=1.9) {
				//joint.setSpring(1000, 2, vel);
				vel = -vel;
				//joint.setMotor(vel, 20, false);
				
			}
			//System.out.println();
			//actor.addForce(0, 2000, 0);
			
			
			//
			//System.out.println(joint.getVelocity());
			
		}
		
		
	}
}
