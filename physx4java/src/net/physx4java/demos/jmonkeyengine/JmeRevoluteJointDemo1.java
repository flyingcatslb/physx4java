package net.physx4java.demos.jmonkeyengine;

import net.physx4java.Functions;
import net.physx4java.dynamics.actors.Actor;
import net.physx4java.dynamics.actors.ActorParameters;
import net.physx4java.dynamics.joints.D6Joint;
import net.physx4java.dynamics.joints.D6JointDesc;
import net.physx4java.dynamics.joints.RevoluteJoint;
import net.physx4java.dynamics.joints.RevoluteJointDesc;


public class JmeRevoluteJointDemo1 extends JmeDemo{
	Actor actor1;
	Actor actor2;
	public void initPhysics() {
		Functions.testRunner();
		super.initPhysics();
		
		//create actors
		ActorParameters params = new ActorParameters();
		params.setDensity(10);
			
		actor1 =  addBox(params, 1f, -2f, 2f, 0, 0.5f, 0.5f, 0.5f).getActor();
		actor2 =  addBox(params, 1f, 2f, 2f, 0,0.5f,0.5f,0.5f).getActor();
		setStepSize(0.001f);
		
		//getDefaultMaterial().setRestitution(1f);
		//world.setTiming(0);
		RevoluteJointDesc jd = new RevoluteJointDesc();
		jd.setActors(actor1, actor2);
		jd.setGlobalAnchor(0,0,0);
		jd.setGlobalAxis(0,1,0f);
		//jd.set
		//set actors of jointdesc
		RevoluteJoint joint = new RevoluteJoint(jd);
		
		
	}
	public static void main(String[] args) {
		new JmeRevoluteJointDemo1().start();
	}
	int count  = 500;
	
	@Override
	protected void simpleUpdate() {
		// TODO Auto-generated method stub
		super.simpleUpdate();
		count--;
		if(count<=0) {
			count = 1000;
			System.out.println("FORCE");
			actor1.addForce(0, 500, 0);
			
		}
		
		
	}
}
