package net.physx4java.demos.jmonkeyengine;

import net.physx4java.dynamics.actors.ActorParameters;


public class BoxDemo1 extends JmeDemo{
public void initPhysics() {
		super.initPhysics();
		setStepSize(0.05f);
		//getDefaultMaterial().setRestitution(1f);
		//world.setTiming(0);
		for(int x=0;x<8;x++) 
		for(int y=0;y<15;y++) {
			float size_box = 1f;
			ActorParameters parameters = new ActorParameters();
			parameters.setDensity(10f);
			parameters.setDynamic(true);
			JmeGlue node =  addBox(parameters,1f, x*size_box*4f+(float)(Math.random()/2d), (float)(y*size_box*2.5), 0, size_box, size_box, size_box);
			getDefaultMaterial().setDynamicFriction(0.1f);
			node.getActor().setMaterial(getDefaultMaterial());
		}
	}
	public static void main(String[] args) {
		new BoxDemo1().start();
	}
}
