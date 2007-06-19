package net.physx4java.dynamics.actors;

import net.physx4java.Functions;

public class SphereActor extends Actor{
	float radius;
	public SphereActor(ActorParameters parameters,float radius) {
		super();
		Functions.actorCreateAsSphereShape(id,parameters.isDynamic(), radius);
		setRadius(radius);
	}
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
}
