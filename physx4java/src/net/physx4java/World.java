package net.physx4java;

public class World {
	public World() {
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
	public float getGravityY() {
		return Functions.worldGetGravityY();
	}
	public float getGravityZ() {
		return Functions.worldGetGravityZ();
	}
	
	
	
	
	
	
}
