package net.physx4java.dynamics.collision;

import javax.vecmath.Vector3f;

public class ContactPair {
	private int actorid1;
	private int actorid2;
	private int flags;
	private Vector3f sumNormalforce;
	private Vector3f sumFrictionForce;
	public int getActorid1() {
		return actorid1;
	}
	public int getActorid2() {
		return actorid2;
	}
	public int getFlags() {
		return flags;
	}
	public Vector3f getSumFrictionForce() {
		return sumFrictionForce;
	}
	public Vector3f getSumNormalforce() {
		return sumNormalforce;
	}
	public void setActorid1(int actorid1) {
		this.actorid1 = actorid1;
	}
	public void setActorid2(int actorid2) {
		this.actorid2 = actorid2;
	}
	public void setFlags(int flags) {
		this.flags = flags;
	}
	public void setSumFrictionForce(Vector3f sumFrictionForce) {
		this.sumFrictionForce = sumFrictionForce;
	}
	public void setSumNormalforce(Vector3f sumNormalforce) {
		this.sumNormalforce = sumNormalforce;
	}
	
}
