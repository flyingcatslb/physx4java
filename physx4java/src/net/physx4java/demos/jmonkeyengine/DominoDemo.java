package net.physx4java.demos.jmonkeyengine;

import net.physx4java.Functions;
import net.physx4java.World;
import net.physx4java.dynamics.actors.Actor;
import net.physx4java.dynamics.actors.ActorParameters;
import net.physx4java.dynamics.collision.CollisionHandling;
import net.physx4java.dynamics.collision.CollisionListener;
import net.physx4java.dynamics.collision.ContactPair;

public class DominoDemo extends JmeDemo implements CollisionListener{
	public void onContactNotify(ContactPair pair) {
		try {
			//Thread.sleep(10);
			Actor actor1 =  World.getActor(pair.getActorid1());
			Actor actor2 = World.getActor(pair.getActorid2());
			System.out.println(actor1.getName()+"->"+actor2.getName()+" "+pair.getFlags());
			//System.exit(0);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void initPhysics() {
		// TODO Auto-generated 	method stub
		
		
		
		super.initPhysics();
		//world.enableContiniousCollisonDetectionD();
		world.enableContactUserReport();
		CollisionHandling.addListener(this);
		//System.exit(0);
		setStepSize(1f);
		int bricks = 200;
		float widht = 0.2f;
		float height = 2f;
		float depth = 0.5f;
		ActorParameters actorParameters = new ActorParameters();
		actorParameters.setDynamic(true);
		actorParameters.setDensity(100);
		getDefaultMaterial().setDynamicFriction(10);
		Actor ball = addSphere(actorParameters, 1f, -widht*200, 0, 0, 1f).getActor();
		for(int i=0;i<bricks;i++) {
			
			 Actor a =  addBox(actorParameters, 1, i*widht*8, height, 0, widht, height, depth).getActor();
			 a.setName("Box("+i+")");
			 int id = a.getId();
			 world.setContactPairFlags(ball, a, Functions.NxContactPairFlag.NX_NOTIFY_ON_TOUCH.getValue());
		}
		
		
		int id = ball.getId();
		ball.addForce(288.99f, 0, 0);
		ball.setName("Ball");
	}
	public static void main(String[] args) {
		new DominoDemo().start();
	}
	@Override
	public int getDialogBehavior() {
		// TODO Auto-generated method stub
		return ALWAYS_SHOW_PROPS_DIALOG;
	}
}
