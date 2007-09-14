package net.physx4java;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import net.physx4java.dynamics.actors.Actor;
import net.physx4java.dynamics.collision.CollisionHandling;
import net.physx4java.dynamics.collision.CollisionListener;

public class WorldPhysX {
	static HashMap<Integer, Actor> actorsById = new HashMap<Integer, Actor>();
	static HashMap<String, Actor> actorsByName = new HashMap<String, Actor>();
	public static Collection<Actor> getAllActors() {
		return actorsById.values();
	}
	public Collection<CollisionListener> getListeners()  {
		return CollisionHandling.getListeners();
	}
	public void  setListeners(Collection<CollisionListener> listeners)  {
		CollisionHandling.setListeners(listeners);
	}
	public static void addActor(Actor actor) {
		actorsById.put(actor.getId(), actor);
		actorsByName.put(actor.getName(), actor);
	}
	public void setGravityY(float gravityY) {
		Functions.worldSetGravity(0, gravityY, 0);
	} 
	public static Actor getActor(int id) {
		return actorsById.get(id);
	}
	public static Actor getActor(String name) {
		return actorsByName.get(name);
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
	public void step(float step) {
		Functions.worldStep(step);
	}
	public float getGravityX() {
		return Functions.worldGetGravityX();
	}
	public void setEnableContactUserReport(boolean enable) {
		Functions.worldEnableUserContactReport();;
	}
	public void enableContactUserReport() {
		Functions.worldEnableUserContactReport();;
	}
	public static void setContactPairFlags(Actor  a1,Actor a2,int flags) {
		Functions.worldSetContactPairFlags(a1.getId(), a2.getId(), flags);
	}
	public float getGravityY() {
		return Functions.worldGetGravityY();
	}
	public float getGravityZ() {
		return Functions.worldGetGravityZ();
	}
	
	
	
	
	
	
}
