package net.physx4java.demos.jmonkeyengine;

import java.util.ArrayList;
import java.util.Collection;

import javax.vecmath.Vector3f;

import net.physx4java.WorldPhysX;
import net.physx4java.dynamics.actors.Actor;
import net.physx4java.dynamics.actors.ActorParameters;
import net.physx4java.dynamics.actors.BoxActor;
import net.physx4java.dynamics.actors.GroundPlaneActor;
import net.physx4java.dynamics.actors.Material;

import sun.reflect.ReflectionFactory.GetReflectionFactoryAction;

import com.jme.app.SimpleGame;
import com.jme.scene.Node;
import com.jme.scene.shape.Box;

public abstract class JmeDemo extends SimpleGame {
	WorldPhysX world;
	Material defaultMaterial;
	float stepSize = 0.01f;
	Collection<JmeGlue> physicsNodes = new ArrayList<JmeGlue>();
	public JmeGlue addBox(ActorParameters parameters,float mass,float x,float y,float z,float size_x,float size_y,float size_z) {
		JmeBox box = new JmeBox(parameters,size_x,size_y,size_z);
		box.getActor().setPosition(x, y, z);
		box.getActor().setMass(mass);
		addPhysicsNode(box);
		return box;
	}
	public JmeGlue addSphere(ActorParameters parameters,float mass,float x,float y,float z,float radius) {
		JmeSphere sphere = new JmeSphere(parameters,radius);
		sphere.getActor().setPosition(x, y, z);
		sphere.getActor().setMass(mass);
		addPhysicsNode(sphere);
		return sphere;
	}
	public void addPhysicsNode(JmeGlue node) {
		physicsNodes.add(node);
		rootNode.attachChild(node);
	}
	@Override
	protected void simpleInitGame() {
		initLights();
		initPhysics();
	}
	public void updatePhysicsNodes() {
		for (JmeGlue physNode : physicsNodes) {
			physNode.update();
		}
	}
	public void createGroundPlane() {
		JmeGroundPlane plane = new JmeGroundPlane();
		plane.getActor().setMaterial(defaultMaterial);
		rootNode.attachChild(plane);
		plane.update();
	}
	public void initPhysics() {
		world  = new WorldPhysX();
		world.setGravity(0, -9, 0);
		defaultMaterial = new Material();
		defaultMaterial.setDynamicFriction(0.5f);
		createGroundPlane();
}
	public void initLights() {}
	
	public JmeDemo() {
		super();
		setDialogBehaviour(getDialogBehavior());
		
	}
	public int getDialogBehavior() {
		return ALWAYS_SHOW_PROPS_DIALOG;
	}
	@Override
	protected void simpleUpdate() {
		// TODO Auto-generated method stub
		super.simpleUpdate();
		world.step(getStepSize());
		updatePhysicsNodes();
		
	}
	
	public Material getDefaultMaterial() {
		return defaultMaterial;
	}
	public void setDefaultMaterial(Material defaultMaterial) {
		this.defaultMaterial = defaultMaterial;
	}
	public float getStepSize() {
		return stepSize;
	}
	public void setStepSize(float stepSize) {
		this.stepSize = stepSize;
	}
}
