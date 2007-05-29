package net.physx4java.dynamics.joints;

import javax.vecmath.Vector3f;

import net.physx4java.Functions;
import net.physx4java.dynamics.actors.Actor;


public abstract class JointDesc {
	Actor actor1,actor2;
	protected int id_counter;
	int id;
	public int getId() {
		return id;
	}
	public JointDesc() {
		super();
		id = id_counter++;
		// TODO Auto-generated constructor stub
	}
	public void setActors(Actor actor1,Actor actor2) {
		this.actor1 = actor1;
		this.actor2 = actor2;
		Functions.jointDescSetActors(getId(), actor1.getId(), actor2.getId());
	}
	public void setLocalNormal(Vector3f normal1,Vector3f normal2) {
		Functions.jointDescSetLocalNormal(id, Functions.toArray(normal1), Functions.toArray(normal2));
	}
	
	public void setLocalAnchor(Vector3f anchor1,Vector3f anchor2) {
		Functions.jointDescSetLocalAnchor(id, Functions.toArray(anchor1), Functions.toArray(anchor2));
		
	}
	public void setGlobalAnchor(Vector3f anchor1,Vector3f anchor2) {
		Functions.jointDescSetGlobalAnchor(id, Functions.toArray(anchor1));
	}
	public void setGlobalAxis(Vector3f axis) {
		Functions.jointDescSetGlobalAxis(id, Functions.toArray(axis));
	}
	
}
