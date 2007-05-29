package net.physx4java.dynamics.actors;

import net.physx4java.Functions;

public class Material {
	int id;
	static int id_counter;
	
	//material.dirOfAnisotropy.set(0,0,1);

	public Material() {
		super();
		id = id_counter++;
		//create 
		Functions.materialCreateMaterial(id);
	}

	

	public float getDynamicFriction() {
		return 0;
	}

	public float getDynamicFrictionV() {
		return 0;
	}

	public int getId() {
		return id;
	}

	public float getRestitution() {
		return 0;
	}

	public float getStaticFriction() {
		return 0; 
	}

	

	

	public void setDynamicFriction(float dynamicFriction) {
		Functions.materialSetDynamicFriction(id, dynamicFriction);
	}

	

	public void setRestitution(float restitution) {
	
	}

	public void setStaticFriction(float staticFriction) {
		Functions.materialSetStaticFriction(id, staticFriction);
	}

	public void setStaticFrictionV(float staticFrictionV) {
		
	}
	
}
