package net.physx4java.demos.jmonkeyengine;

import net.physx4java.WorldPhysX;
import net.physx4java.dynamics.actors.ActorParameters;
import net.physx4java.dynamics.actors.BoxActor;

import com.jme.scene.shape.Box;

public class JmeBox extends JmeGlue {

	public JmeBox(WorldPhysX world, ActorParameters parameters, float size_x,float size_y,float size_z) {
		super(new BoxActor(parameters,world,size_x,size_y,size_z));
		Box box = new Box("",new com.jme.math.Vector3f(),size_x,size_y,size_z);
		super.attachChild(box);
	}
	
	
}
