package net.physx4java.demos.jmonkeyengine;

import net.physx4java.dynamics.actors.GroundPlaneActor;

import com.jme.scene.shape.Box;

public class JmeGroundPlane extends JmeGlue {

	public JmeGroundPlane() {
		super(new GroundPlaneActor());
		Box box = new Box("",new com.jme.math.Vector3f(),1000f,0.001f,1000f);
		super.attachChild(box);
	}
	
	
}
