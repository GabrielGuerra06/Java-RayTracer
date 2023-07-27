/**
 * [1968] - [2023] Centros Culturales de Mexico A.C / Universidad Panamericana
 * All Rights Reserved.
 */
package edu.up.isgc.cg.raytracer.lights;

import edu.up.isgc.cg.raytracer.Intersection;
import edu.up.isgc.cg.raytracer.Vector3D;
import edu.up.isgc.cg.raytracer.objects.Materials;

import java.awt.*;

/**
 * This class extends from our Light class to receive in the constructor, the direction, color, intensity and generate a new instantiated DirectionalLight
 * @author Gabriel Guerra
 * @author Jafet Rodríguez
 */


public class DirectionalLight extends Light{
    private Vector3D direction;

    public DirectionalLight(Vector3D direction, Color color, double intensity, Materials material, Vector3D scale, Vector3D rotate) {
        super(Vector3D.ZERO(), color, intensity, material, scale, rotate);
        setDirection(Vector3D.normalize(direction));
    }

    public Vector3D getDirection() {
        return direction;
    }

    public void setDirection(Vector3D direction) {
        this.direction = direction;
    }

    @Override
    public double getNDotL(Intersection intersection) {
        return Math.max(Vector3D.dotProduct(intersection.getNormal(), Vector3D.scalarMultiplication(getDirection(), -1.0)), 0.0);
    }
}


