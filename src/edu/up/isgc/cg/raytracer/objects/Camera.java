/**
 * [1968] - [2023] Centros Culturales de Mexico A.C / Universidad Panamericana
 * All Rights Reserved.
 */
package edu.up.isgc.cg.raytracer.objects;

import edu.up.isgc.cg.raytracer.Intersection;
import edu.up.isgc.cg.raytracer.Ray;
import edu.up.isgc.cg.raytracer.Vector3D;
import java.awt.*;

/**
 * The class camera extends from our Object3D as a property of it, in our constructor need to receive, the camera position, both fields of view (Horizontal and vertical), the resolution that we want inn our image
 * And our clipping planes
 * @author Gabriel Guerra
 * @author Jafet Rodríguez
 */

public class Camera extends Object3D {
    //FOV[0] = Horizontal | FOV[1] = Vertical
    private double[] fieldOfView = new double[2];
    private double defaultZ = 15.0;
    //0 is width
    //1 is height
    private int[] resolution;
    private double[] nearFarPlanes = new double[2];

    public Camera(Vector3D position, double fieldOfViewHorizontal, double fieldOfViewVertical,
                  int widthResolution, int heightResolution, double nearPlane, double farPlane, Materials material, Vector3D scale, Vector3D rotate) {
        super(position, Color.BLACK, material, scale, rotate);
        setFieldOfViewHorizontal(fieldOfViewHorizontal);
        setFieldOfViewVertical(fieldOfViewVertical);
        setResolution(new int[]{widthResolution, heightResolution});
        setNearFarPlanes(new double[]{nearPlane, farPlane});
    }

    public double[] getNearFarPlanes() {
        return nearFarPlanes;
    }

    private void setNearFarPlanes(double[] nearFarPlanes) {
        this.nearFarPlanes = nearFarPlanes;
    }

    public double[] getFieldOfView() {
        return fieldOfView;
    }

    private void setFieldOfView(double[] fieldOfView) {
        this.fieldOfView = fieldOfView;
    }

    public double getFieldOfViewHorizontal() {
        return fieldOfView[0];
    }

    public void setFieldOfViewHorizontal(double fieldOfViewHorizontal) {
        fieldOfView[0] = fieldOfViewHorizontal;
    }

    public double getFieldOfViewVertical() {
        return fieldOfView[1];
    }

    public void setFieldOfViewVertical(double fieldOfViewVertical) {
        fieldOfView[1] = fieldOfViewVertical;
    }

    public double getDefaultZ() {
        return defaultZ;
    }

    public void setDefaultZ(double defaultZ) {
        this.defaultZ = defaultZ;
    }

    public int[] getResolution() {
        return resolution;
    }

    public int getResolutionWidth() {
        return resolution[0];
    }

    public int getResolutionHeight() {
        return resolution[1];
    }

    private void setResolution(int[] resolution) {
        this.resolution = resolution;
    }


    /**
     * calculatePositionToRay
     * Helps us to identify all the positions where we need to throw our rays depending on the resolution of our image
     */
    public Vector3D[][] calculatePositionsToRay() {
        double angleMaxX = getFieldOfViewHorizontal() / 2.0;
        double radiusMaxX = getDefaultZ() / (double) Math.cos(Math.toRadians(angleMaxX));

        double maxX = (double) Math.sin(Math.toRadians(angleMaxX)) * radiusMaxX;
        double minX = -maxX;

        double angleMaxY = getFieldOfViewVertical() / 2.0;
        double radiusMaxY = getDefaultZ() / (double) Math.cos(Math.toRadians(angleMaxY));

        double maxY = (double) Math.sin(Math.toRadians(angleMaxY)) * radiusMaxY;
        double minY = -maxY;

        Vector3D[][] positions = new Vector3D[getResolutionWidth()][getResolutionHeight()];
        double posZ = getDefaultZ();

        for (int x = 0; x < positions.length; x++) {
            for (int y = 0; y < positions[x].length; y++) {
                double posX = minX + (((maxX - minX) / (double) getResolutionWidth()) * x);
                double posY = maxY - (((maxY - minY) / (double) getResolutionHeight()) * y);
                positions[x][y] = new Vector3D(posX, posY, posZ);
            }
        }

        return positions;
    }

    @Override
    public Intersection getIntersection(Ray ray) {
        return new Intersection(Vector3D.ZERO(), -1, Vector3D.ZERO(), null);
    }
}
