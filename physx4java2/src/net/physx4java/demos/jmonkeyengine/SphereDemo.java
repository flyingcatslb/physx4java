package net.physx4java.demos.jmonkeyengine;

import net.physx4java.dynamics.actors.ActorParameters;

public class SphereDemo extends JmeDemo{

	@Override
	public void initPhysics() {
		// TODO Auto-generated method stub
		super.initPhysics();
		setStepSize(1);
		
		for(int x=0;x<4;x++) 
			for(int y=0;y<15;y++) {
				float radius = 1f;
				JmeGlue node =  addSphere(new ActorParameters(),10f, x*radius*4+(float)(Math.random()/2d), (float)(y*radius*4), 0,radius);
				node.getActor().setMaterial(getDefaultMaterial());
				
			}
	}
	public static void main(String[] args) {
		new SphereDemo().start();
	}
}
