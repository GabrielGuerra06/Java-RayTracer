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
 * This class extends from our Light class to receive in the constructor, the position, color, intensity and generate a new instantiated PointLight
 * @author Gabriel Guerra
 * @author Jafet Rodríguez
 */


public class PointLight extends Light {
    private Vector3D position;
    public PointLight(Vector3D position, Color color, double intensity, Materials material, Vector3D scale, Vector3D rotate) {
        super(position, color, intensity, material, scale, rotate);
        setPosition(position);
    }

    public Vector3D getPosition() {
        return position;
    }

    public void setPosition(Vector3D position) {
        this.position = position;
    }


    @Override
    public double getNDotL(Intersection intersection) {
        return Math.max(Vector3D.dotProduct(intersection.getNormal(),
                Vector3D.normalize(Vector3D.substract(getPosition(), intersection.getPosition()))), 0.0);
    }
}