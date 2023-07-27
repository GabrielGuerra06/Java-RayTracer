/**
 * [1968] - [2023] Centros Culturales de Mexico A.C / Universidad Panamericana
 * All Rights Reserved.
 */

package edu.up.isgc.cg.raytracer.lights;

import edu.up.isgc.cg.raytracer.Intersection;
import edu.up.isgc.cg.raytracer.Vector3D;
import edu.up.isgc.cg.raytracer.objects.Materials;

import java.awt.*;

public class SpotLight extends Light {
    private Vector3D position;
    private double cutoffAngle;
    private Vector3D direction;

    /**
     * This class extends from our Light class to receive in the constructor, the direction, color, intensity, and the angle that we want
     *      in our display of the light. Generates a new instantiated SpotLight
     * @author Gabriel Guerra
     * @author Jafet Rodríguez
     */




    public SpotLight(Vector3D position, Vector3D direction, Color color, double intensity, double cutoffAngle, Materials material, Vector3D scale, Vector3D rotate) {
        super(position, color, intensity, material, scale, rotate);
        setPosition(position);
        setDirection(Vector3D.normalize(direction));
        setCutoffAngle(cutoffAngle);
    }

    public Vector3D getPosition() {
        return position;
    }

    public Vector3D getDirection() {
        return direction;
    }

    public void setDirection(Vector3D direction) {
        this.direction = direction;
    }



    public double getCutoffAngle() {
        return cutoffAngle;
    }

    public void setCutoffAngle(double cutoffAngle) {
        this.cutoffAngle = cutoffAngle;
    }

    public void setPosition(Vector3D position) {
        this.position = position;
    }


    /**
     * Depending on the position its the opening of our angle, the cutOffAngle its the rotation where the light its gonna point
     */
    @Override
    public double getNDotL(Intersection intersection) {
        Vector3D lightVector = Vector3D.substract(intersection.getPosition(), position);
        double distance = Vector3D.magnitude(lightVector);
        Vector3D normalizedLightVector = Vector3D.normalize(lightVector);

        double angle = Math.acos(Vector3D.dotProduct(normalizedLightVector, getDirection()));
        if (angle > cutoffAngle) {
            return 0.0;
        }

        double constantAttenuation = 1.0;
        double linearAttenuation = 0.5;
        double quadraticAttenuation = 0.1;

        double attenuation = 1.0 / (constantAttenuation + linearAttenuation * distance +
                quadraticAttenuation * distance * distance);

        return Math.max(Vector3D.dotProduct(intersection.getNormal(), normalizedLightVector), 0.0) * attenuation;
    }
}
