package net.physx4java.dynamics.collision;

import java.util.ArrayList;
import java.util.Collection;

import javax.vecmath.Vector3f;

public class CollisionHandling {
	static Collection <CollisionListener> listeners = new ArrayList<CollisionListener>();
	public static void addListener(CollisionListener listener) {
		listeners.add(listener);
	}
	public static void removeListener(CollisionListener listener) {
		listeners.remove(listener);
	}
	public static void onContactNotify(int actorid1,int actorid2,int flags,float sumFrictionForce_x,float sumFrictionForce_y,float sumFrictionForce_z,float sumNormalForce_x,float sumNormalForce_y,float sumNormalForce_z) {
		//first create and fill contactpair
		ContactPair contactPair = new ContactPair();
		contactPair.setActorid1(actorid1);
		contactPair.setActorid2(actorid2);
		contactPair.setSumFrictionForce(new Vector3f(sumFrictionForce_x,sumFrictionForce_y,sumFrictionForce_z));
		contactPair.setSumNormalforce(new Vector3f(sumNormalForce_x,sumNormalForce_y,sumNormalForce_z));
		contactPair.setFlags(flags);
		//call listeners
		for (CollisionListener listener : listeners) {
			listener.onContactNotify(contactPair);
		}
	}
	
}
