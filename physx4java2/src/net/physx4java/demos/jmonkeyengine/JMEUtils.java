package net.physx4java.demos.jmonkeyengine;
import com.jme.math.Matrix3f;
import com.jme.math.Vector3f;

public class JMEUtils {
	public static Matrix3f matrixToJmeMatrix(javax.vecmath.Matrix3f m) {
		Matrix3f m3 = new Matrix3f();
		m3.m00 = m.m00;
		m3.m01 = m.m01;
		m3.m02 = m.m02;
		
		m3.m10 = m.m10;
		m3.m11 = m.m11;
		m3.m12 = m.m12;
		
		m3.m20 = m.m20;
		m3.m21 = m.m21;
		m3.m22 = m.m22;
		return m3;
		
	}
	public static javax.vecmath.Matrix3f  JMEMatrixToMatrix(Matrix3f m) {
		javax.vecmath.Matrix3f m3 = new javax.vecmath.Matrix3f();
		m3.m00 = m.m00;
		m3.m01 = m.m01;
		m3.m02 = m.m02;
		
		m3.m10 = m.m10;
		m3.m11 = m.m11;
		m3.m12 = m.m12;
		
		m3.m20 = m.m20;
		m3.m21 = m.m21;
		m3.m22 = m.m22;
		return m3;
		
	}
	public static Vector3f vectorToJmeVector(javax.vecmath.Vector3f v)  {
		return new Vector3f(v.x,v.y,v.z); 
	}
	public static javax.vecmath.Vector3f JmeVectorToVector(Vector3f v)  {
		return new javax.vecmath.Vector3f(v.x,v.y,v.z); 
	}
	
}

