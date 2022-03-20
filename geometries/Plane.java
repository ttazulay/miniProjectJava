package geometries;

import primitives.Point;
import primitives.Vector;

public class Plane implements Geometry {

	Point p0;
	Vector normal;
	 
	
/**
 *this ctor gets a point and a vector
 * @param p0
 * @param normal
 */
	public Plane(Point p0, Vector normal) {
		super();
		this.p0 = p0;
		this.normal = normal.normalize();
	}
	
	/**
     * A ctor that gets 3 parameters(Point type).
     * @param p1 point p1
     * @param p2 point p2
     * @param p3 point p3
     */
    public Plane(Point p1, Point p2, Point p3){

        if (p1.equals(p2) || p2.equals(p3) || p3.equals(p1))
            throw new IllegalArgumentException("Two of the points are the same point");

        Vector v1 = p2.subtract(p1);
        Vector v2 = p3.subtract(p1);

        try{
            Vector cross = v1.crossProduct(v2);

            p0 = p2;
            normal = cross.normalize();
        }
        catch (Exception e){
            throw new IllegalArgumentException("The points are on the same line");
        }
    }
	
		public Vector getNormal( ) {

			return normal;
		}

		
	@Override
	public Vector getNormal(Point p) {
		// TODO Auto-generated method stub
		return normal;
	}

	@Override
	public String toString() {
		return "Plane [p0=" + p0 + ", normal=" + normal + "]";
	}
	
	
}
