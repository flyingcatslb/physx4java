package net.physx4java;

import java.util.HashMap;

import net.physx4java.dynamics.actors.Actor;

public class WorldPhysX {
	static HashMap<Integer, Actor> actors = new HashMap<Integer, Actor>();
	public static void addActor(Actor actor) {
		actors.put(actor.getId(), actor);
	}
	public static Actor getActor(int id) {
		return actors.get(id);
	}
	public WorldPhysX() {
		super();
		Functions.worldCreate();
	}
	
	public  void setGravity(float x,float y,float z) {
		Functions.worldSetGravity(x, y, z);
	}
	public  void enableContiniousCollisonDetectionD() {
		Functions.worldUseCCD();
	}
	public void setTiming(float f) {
		
		Functions.worldSetStepTiming(f);
	}
	public void update(float step) {
		Functions.worldStep(step);
	}
	public float getGravityX() {
		return Functions.worldGetGravityX();
	}
	public void enableContactUserReport() {
		Functions.worldEnableUserContactReport();;
	}
	public void setContactPairFlags(Actor  a1,Actor a2,int flags) {
		Functions.worldSetContactPairFlags(a1.getId(), a2.getId(), flags);
	}
	public float getGravityY() {
		return Functions.worldGetGravityY();
	}
	public float getGravityZ() {
		return Functions.worldGetGravityZ();
	}
	
	
	
	
	
	
}
