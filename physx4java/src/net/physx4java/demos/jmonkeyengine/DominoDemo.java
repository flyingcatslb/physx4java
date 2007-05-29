package net.physx4java.demos.jmonkeyengine;

import net.physx4java.Functions;
import net.physx4java.dynamics.actors.Actor;
import net.physx4java.dynamics.actors.ActorParameters;
import net.physx4java.dynamics.actors.Material;

public class DominoDemo extends JmeDemo{

	@Override
	public void initPhysics() {
		// TODO Auto-generated 	method stub
		
		
		
		super.initPhysics();
		world.enableContiniousCollisonDetectionD();
		setStepSize(0.1f);
		
		
		int bricks = 60;
		float widht = 0.2f;
		float height = 2f;
		float depth = 0.5f;
		ActorParameters actorParameters = new ActorParameters();
		actorParameters.setDynamic(true);
		actorParameters.setDensity(100);
		getDefaultMaterial().setDynamicFriction(10);
		
		for(int i=0;i<bricks;i++) {
			
			addBox(actorParameters, 1, i*widht*8, height, 0, widht, height, depth);
			
		}
		
		Actor ball = addSphere(actorParameters, 1f, -widht*200, 0, 0, 1f).getActor();
		
		ball.addForce(288.99f, 0, 0);
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
