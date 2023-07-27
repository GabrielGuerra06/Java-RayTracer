/**
 * [1968] - [2023] Centros Culturales de Mexico A.C / Universidad Panamericana
 * All Rights Reserved.
 */

package edu.up.isgc.cg.raytracer.objects;


/**
 * Materials receive the properties to generate different type of textures,as parameters needs, shininess, reflection, refraction, ambient and diffuse coefficients
 * @author Gabriel Guerra
 * @author Jafet Rodríguez
 */
public class Materials {
    private double shininess;
    private double reflection;
    private double refraction;
    private double ambient;
    private double diffuse;

    public Materials( double shininess,  double reflection, double refraction, double ambient, double diffuse) {
       setShininess(shininess);
       setReflection(reflection);
       setRefraction(refraction);
       setAmbient(ambient);
       setDiffuse(diffuse);

    }

    public double getShininess() {
        return shininess;
    }

    public void setShininess(double shininess) {
        this.shininess = shininess;
    }

    public double getReflection() {
        return reflection;
    }

    public void setReflection(double reflection) {
        this.reflection = reflection;
    }

    public double getRefraction() {
        return refraction;
    }

    public void setRefraction(double refraction) {
        this.refraction = refraction;
    }

    public double getAmbient() {
        return ambient;
    }

    public void setAmbient(double ambient) {
        this.ambient = ambient;
    }

    public double getDiffuse() {
        return diffuse;
    }

    public void setDiffuse(double diffuse) {
        this.diffuse = diffuse;
    }

}
