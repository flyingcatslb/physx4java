package net.physx4java.dynamics.actors;

import net.physx4java.Functions;

public class BoxActor extends Actor {

	public BoxActor(ActorParameters parameters,float x,float y,float z) {
		super();
		Functions.actorCreateAsBoxShape(id,parameters.isDynamic(),parameters.isUseCCD(), x, y, z);
	}

}
