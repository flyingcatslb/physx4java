package net.physx4java.demos.jmonkeyengine;

import net.physx4java.WorldPhysX;
import net.physx4java.dynamics.actors.ActorParameters;
import net.physx4java.dynamics.actors.SphereActor;

import com.jme.scene.shape.Sphere;

public class JmeSphere extends JmeGlue {

	public JmeSphere(WorldPhysX world, ActorParameters parameters,float radius) {
		super(new SphereActor(parameters,world,radius));
		Sphere sphere  = new Sphere(name,10,10,radius);
		attachChild(sphere);
	}

}
