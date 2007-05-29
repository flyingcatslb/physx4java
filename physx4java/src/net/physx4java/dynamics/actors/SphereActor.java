package net.physx4java.dynamics.actors;

import net.physx4java.Functions;

public class SphereActor extends Actor{

	public SphereActor(ActorParameters parameters,float radius) {
		super();
		Functions.actorCreateAsSphereShape(id,parameters.isDynamic(), radius);
	}
	
}
