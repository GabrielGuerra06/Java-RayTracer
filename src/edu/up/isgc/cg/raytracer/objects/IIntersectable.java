/**
 * [1968] - [2023] Centros Culturales de Mexico A.C / Universidad Panamericana
 * All Rights Reserved.
 */
package edu.up.isgc.cg.raytracer.objects;

import edu.up.isgc.cg.raytracer.Intersection;
import edu.up.isgc.cg.raytracer.Ray;

/**
 * With this class we are going to call it to ask every object if it got intersected by our rays
 * @author Gabriel Guerra
 * @author Jafet Rodríguez
 */


public interface IIntersectable {
    Intersection getIntersection(Ray ray);
}
