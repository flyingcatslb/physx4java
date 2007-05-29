package net.physx4java.demos.jmonkeyengine;

import javax.vecmath.Vector3f;

import net.physx4java.dynamics.actors.Actor;


import com.jme.scene.Node;

public abstract class JmeGlue extends Node{
	Actor actor;
	
	public Actor getActor() {
		return actor;
	}
	public void setPosition(float x,float y,float z) {
		actor.setPosition(x,y,z);
	}
	
	
	
	public JmeGlue(Actor actor) {
		this.actor = actor;
	}
	public void update() {
		//update rotation and position
		Vector3f pos = actor.getPosition();
		setLocalTranslation(pos.x, pos.y, pos.z);
		setLocalRotation(JMEUtils.matrixToJmeMatrix(actor.getRotation()));
	}
}
