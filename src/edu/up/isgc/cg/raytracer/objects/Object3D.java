/**
 * [1968] - [2023] Centros Culturales de Mexico A.C / Universidad Panamericana
 * All Rights Reserved.
 */
package edu.up.isgc.cg.raytracer.objects;

import edu.up.isgc.cg.raytracer.Vector3D;
import java.awt.*;

/**
 * Object3D helps us to identify all my objects and the properties that affect them, its fundamental to generate all the objects of our scene, it receives as parameters, the position, color, material
 * and scale/ rotate properties
 * @author Gabriel Guerra
 * @author Jafet Rodríguez
 */
public abstract class Object3D implements IIntersectable{
    private Color color;
    private Vector3D position;
    private Materials material;
    private Vector3D scale;
    private Vector3D rotate;

    public Object3D(Vector3D position, Color color, Materials material, Vector3D scale, Vector3D rotate) {
        setPosition(position);
        setColor(color);
        setMaterial(material);
        setScale(scale);
        setRotate(rotate);

    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Vector3D getPosition() {
        return position;
    }

    public void setPosition(Vector3D position) {
        this.position = position;
    }

    public Materials getMaterial() {
        return material;
    }

    public void setMaterial(Materials material) {
        this.material = material;
    }

    public Vector3D getScale() {
        return scale;
    }

    public void setScale(Vector3D scale) {
        this.scale = scale;

    }


    public Vector3D getRotate() {
        return rotate;
    }

    public void setRotate(Vector3D rotate) {
        this.rotate = rotate;
    }


        public void scaleObject(double scaleValue) {
            // Scale the position
            position = Vector3D.scalarMultiplication(position, scaleValue);

            // Scale the size
            scale = Vector3D.scalarMultiplication(scale, scaleValue);
        }




}
