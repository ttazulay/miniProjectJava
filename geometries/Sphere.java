package geometries;

import primitives.Point;
import primitives.Vector;

public class Sphere implements Geometry {
 Point center;
 double radius;

 @Override
public Vector getNormal(Point p) {
	
		return (p.subtract(center)).normalize();
}

public Sphere(Point center, double radius) {
	super();
	this.center = center;
	this.radius = radius;
}
 
}
