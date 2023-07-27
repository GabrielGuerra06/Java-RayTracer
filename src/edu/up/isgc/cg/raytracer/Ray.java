/**
 * [1968] - [2023] Centros Culturales de Mexico A.C / Universidad Panamericana
 * All Rights Reserved.
 */
package edu.up.isgc.cg.raytracer;

/**
 * The ray class its called to throw all the rays to our scene, it only needs as parameters the origin and direction of the ray
 * @author Gabriel Guerra
 * @author Jafet Rodríguez
 */
public class Ray {
    private Vector3D origin;
    private Vector3D direction;

    public Ray(Vector3D origin, Vector3D direction) {
        setOrigin(origin);
        setDirection(direction);
    }

    public Vector3D getOrigin() {
        return origin;
    }

    public void setOrigin(Vector3D origin) {
        this.origin = origin;
    }

    public Vector3D getDirection() {
        return Vector3D.normalize(direction);
    }

    public void setDirection(Vector3D direction) {
        this.direction = direction;
    }
}
