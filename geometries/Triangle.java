package geometries;

import primitives.Point;


public class Triangle extends Polygon{

	/**
	 * this ctor calls the ctor of the father "Polygon" (with 3 points)
	 * @param vertices
	 */
	public Triangle(Point p1,Point p2,Point p3) {
		super(p1,p2,p3);
		
	}
	

}
