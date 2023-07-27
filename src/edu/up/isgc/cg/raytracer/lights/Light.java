/**
 * [1968] - [2023] Centros Culturales de Mexico A.C / Universidad Panamericana
 * All Rights Reserved.
 */
package edu.up.isgc.cg.raytracer.lights;

import edu.up.isgc.cg.raytracer.Intersection;
import edu.up.isgc.cg.raytracer.Ray;
import edu.up.isgc.cg.raytracer.Vector3D;
import edu.up.isgc.cg.raytracer.objects.Materials;
import edu.up.isgc.cg.raytracer.objects.Object3D;

import java.awt.*;

/**
 * The light class extends as a property of our object 3d, in the constructor we need the position, color and intensity of the light, this class is used to extend the rest of our light
 * @author Gabriel Guerra
 * @author Jafet Rodríguez
 */

public abstract class Light extends Object3D {

    private double intensity;

    public Light(Vector3D position, Color color, double intensity, Materials material, Vector3D scale, Vector3D rotate) {
        super(position, color, material, scale, rotate );
        setIntensity(intensity);
    }

    public double getIntensity() {
        return intensity;
    }

    public void setIntensity(double intensity) {
        this.intensity = intensity;
    }

    public abstract double getNDotL(Intersection intersection);

    public Intersection getIntersection(Ray ray) {
        return new Intersection(Vector3D.ZERO(), -1, Vector3D.ZERO(), null);
    }
}
