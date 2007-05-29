package net.physx4java.dynamics.actors;

import net.physx4java.Functions;

public class GroundPlaneActor extends Actor{

	public GroundPlaneActor() {
		super();
		Functions.actorCreateAsGroundPlane(id);
	}
	
}
