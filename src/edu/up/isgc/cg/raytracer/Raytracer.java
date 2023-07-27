/**
 * [1968] - [2023] Centros Culturales de Mexico A.C / Universidad Panamericana
 * All Rights Reserved.
 */
package edu.up.isgc.cg.raytracer;


import edu.up.isgc.cg.raytracer.lights.DirectionalLight;
import edu.up.isgc.cg.raytracer.lights.Light;
import edu.up.isgc.cg.raytracer.lights.PointLight;
import edu.up.isgc.cg.raytracer.lights.SpotLight;
import edu.up.isgc.cg.raytracer.objects.*;
import edu.up.isgc.cg.raytracer.tools.OBJReader;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * The RayTracer class, calls all the elemnts to generate the image, here its where the rays, shadows and collors are casted
 * @author Gabriel Guerra
 * @author Jafet Rodríguez
 */
public class Raytracer {

    public static void main(String[] args) {

  System.out.println(new Date());
        Scene scene03 = new Scene();
//        scene02.setCamera(new Camera(new Vector3D(0, 4, -8), 60, 60, 1920, 1080, 0.6, 50.0, null,null, null));
//        scene02.addLight(new PointLight(new Vector3D(-2f, 4, -6), Color.WHITE, 15, null, null, null));
//        scene02.addLight(new PointLight(new Vector3D(0, 4, 0), new Color(124, 66, 50), 15, null, null, null));
//        scene02.addLight(new PointLight(new Vector3D(2, 2, -3), Color.WHITE, 30, null, null, null));
//        scene02.addLight(new SpotLight(new Vector3D(0f, 8,4 ), new Vector3D(2, -1, 0), Color.DARK_GRAY, 20, Math.toRadians(20), null, null, null));
//        scene02.addLight(new PointLight(new Vector3D(0f, 2, -4), Color.WHITE, 2, null, null, null));
//        scene02.addLight(new SpotLight(new Vector3D(4f, 8,9 ), new Vector3D(2, -1, 0), new Color(166, 150, 150), 20, Math.toRadians(20), null, null, null));
//        scene02.addLight(new SpotLight(new Vector3D(-5f, 8,9 ), new Vector3D(2, -1, 0), new Color(117, 112, 112), 20, Math.toRadians(20), null, null, null));
//        scene02.addLight(new PointLight(new Vector3D(-2f, 2, 0), Color.WHITE, 30, null, null, null));
//        scene02.addLight(new SpotLight(new Vector3D(0, 8,2 ), new Vector3D(2, -1, 0), Color.WHITE, 20, Math.toRadians(20), null, null, null));
//
//        scene02.addLight(new PointLight(new Vector3D(2f, 3, -4), Color.GRAY, 15, null, null, null));
//
//        Materials floorMaterial = new Materials(30.0, 0, 0, 0.1, 0.8);
//        Materials ironMaterial = new Materials(80.0, 0.6, 0.0, 0.2, 0.7);
//        Materials glassMaterial = new Materials(100, 0.8, 3, 0.1, 0.9);
//        Materials dirtMaterial = new Materials(0, 0, 0.0, 0.1, 0.3);
//
//
//        scene02.addObject(OBJReader.getModel3D("C:\\Users\\gabri\\OneDrive\\Documentos\\UNIVERSIDAD\\4-Semestre\\Multimedios\\Period2\\RayTracer\\RayTracerv1.0\\RayTracerv1.0\\scene03\\prism.obj", new Vector3D(1, -7, 10), new Color(116, 33, 159), glassMaterial, null, null));
//        scene02.addObject(OBJReader.getModel3D("C:\\Users\\gabri\\OneDrive\\Documentos\\UNIVERSIDAD\\4-Semestre\\Multimedios\\Period2\\RayTracer\\RayTracerv1.0\\RayTracerv1.0\\scene03\\prism.obj", new Vector3D(5, -7, 11), new Color(116, 33, 159), glassMaterial, null, null));
//        scene02.addObject(OBJReader.getModel3D("C:\\Users\\gabri\\OneDrive\\Documentos\\UNIVERSIDAD\\4-Semestre\\Multimedios\\Period2\\RayTracer\\RayTracerv1.0\\RayTracerv1.0\\scene03\\prism.obj", new Vector3D(-5.8, -7, 3.5), new Color(116, 33, 159), glassMaterial, null, null));
//        scene02.addObject(OBJReader.getModel3D("C:\\Users\\gabri\\OneDrive\\Documentos\\UNIVERSIDAD\\4-Semestre\\Multimedios\\Period2\\RayTracer\\RayTracerv1.0\\RayTracerv1.0\\scene03\\prism.obj", new Vector3D(-7, -7, 10), new Color(116, 33, 159), glassMaterial, null, null));
//        scene02.addObject(OBJReader.getModel3D("C:\\Users\\gabri\\OneDrive\\Documentos\\UNIVERSIDAD\\4-Semestre\\Multimedios\\Period2\\RayTracer\\RayTracerv1.0\\RayTracerv1.0\\scene03\\prism.obj", new Vector3D(2, -7, 6), new Color(116, 33, 159), glassMaterial, null, null));
//        scene02.addObject(OBJReader.getModel3D("C:\\Users\\gabri\\OneDrive\\Documentos\\UNIVERSIDAD\\4-Semestre\\Multimedios\\Period2\\RayTracer\\RayTracerv1.0\\RayTracerv1.0\\scene03\\prism.obj", new Vector3D(6.3, -7, 4.8), new Color(116, 33, 159), glassMaterial, null, null));
//        scene02.addObject(OBJReader.getModel3D("C:\\Users\\gabri\\OneDrive\\Documentos\\UNIVERSIDAD\\4-Semestre\\Multimedios\\Period2\\RayTracer\\RayTracerv1.0\\RayTracerv1.0\\scene03\\prism.obj", new Vector3D(-4, -7, 5), new Color(116, 33, 159), glassMaterial, null, null));
//        scene02.addObject(OBJReader.getModel3D("C:\\Users\\gabri\\OneDrive\\Documentos\\UNIVERSIDAD\\4-Semestre\\Multimedios\\Period2\\RayTracer\\RayTracerv1.0\\RayTracerv1.0\\scene03\\prism.obj", new Vector3D(-10, -7, 5), new Color(116, 33, 159), glassMaterial, null, null));
//        scene02.addObject(OBJReader.getModel3D("C:\\Users\\gabri\\OneDrive\\Documentos\\UNIVERSIDAD\\4-Semestre\\Multimedios\\Period2\\RayTracer\\RayTracerv1.0\\RayTracerv1.0\\scene03\\prism.obj", new Vector3D(0, -7, 1), new Color(116, 33, 159), glassMaterial, null, null));
//        scene02.addObject(OBJReader.getModel3D("C:\\Users\\gabri\\OneDrive\\Documentos\\UNIVERSIDAD\\4-Semestre\\Multimedios\\Period2\\RayTracer\\RayTracerv1.0\\RayTracerv1.0\\scene03\\prism.obj", new Vector3D(-4, -7, 7), new Color(116, 33, 159), glassMaterial, null, null));
//        scene02.addObject(OBJReader.getModel3D("C:\\Users\\gabri\\OneDrive\\Documentos\\UNIVERSIDAD\\4-Semestre\\Multimedios\\Period2\\RayTracer\\RayTracerv1.0\\RayTracerv1.0\\scene03\\prism.obj", new Vector3D(7, -7, 8), new Color(116, 33, 159), glassMaterial, null, null));
//        scene02.addObject(OBJReader.getModel3D("C:\\Users\\gabri\\OneDrive\\Documentos\\UNIVERSIDAD\\4-Semestre\\Multimedios\\Period2\\RayTracer\\RayTracerv1.0\\RayTracerv1.0\\scene03\\prism.obj", new Vector3D(10, -7, 4), new Color(116, 33, 159), glassMaterial, null, null));
//        scene02.addObject(OBJReader.getModel3D("C:\\Users\\gabri\\OneDrive\\Documentos\\UNIVERSIDAD\\4-Semestre\\Multimedios\\Period2\\RayTracer\\RayTracerv1.0\\RayTracerv1.0\\scene03\\prism.obj", new Vector3D(-1, -7, 10), new Color(116, 33, 159), glassMaterial, null, null));
//
//
//
//        scene02.addObject(OBJReader.getModel3D("C:\\Users\\gabri\\OneDrive\\Documentos\\UNIVERSIDAD\\4-Semestre\\Multimedios\\Period2\\RayTracer\\RayTracerv1.0\\RayTracerv1.0\\scene2\\floor.obj", new Vector3D(0, -4, 6), new Color(68, 65, 65), floorMaterial, null, null));
//
//        scene02.addObject(OBJReader.getModel3D("C:\\Users\\gabri\\OneDrive\\Documentos\\UNIVERSIDAD\\4-Semestre\\Multimedios\\Period2\\RayTracer\\RayTracerv1.0\\RayTracerv1.0\\scene03\\astronaut.obj", new Vector3D(-1, -4, 7), new Color(199, 115, 30), ironMaterial,null,null));
//
//        scene02.addObject(OBJReader.getModel3D("C:\\Users\\gabri\\OneDrive\\Documentos\\UNIVERSIDAD\\4-Semestre\\Multimedios\\Period2\\RayTracer\\RayTracerv1.0\\RayTracerv1.0\\scene03\\astronaut2.obj", new Vector3D(-14, -6, 7), new Color(199, 115, 30), ironMaterial,null,null));
//
//        scene02.addObject(OBJReader.getModel3D("C:\\Users\\gabri\\OneDrive\\Documentos\\UNIVERSIDAD\\4-Semestre\\Multimedios\\Period2\\RayTracer\\RayTracerv1.0\\RayTracerv1.0\\scene03\\astronaut3.obj", new Vector3D(-6, -4, 8), new Color(199, 115, 30), ironMaterial,null,null));
//
//
//        scene02.addObject(OBJReader.getModel3D("C:\\Users\\gabri\\OneDrive\\Documentos\\UNIVERSIDAD\\4-Semestre\\Multimedios\\Period2\\RayTracer\\RayTracerv1.0\\RayTracerv1.0\\scene03\\spaceship.obj", new Vector3D(-1, 3, 2), new Color(203, 39, 39), ironMaterial,null,null));
//        scene02.addObject(OBJReader.getModel3D("C:\\Users\\gabri\\OneDrive\\Documentos\\UNIVERSIDAD\\4-Semestre\\Multimedios\\Period2\\RayTracer\\RayTracerv1.0\\RayTracerv1.0\\scene03\\Meteors1.obj", new Vector3D(5, 5, 8), new Color(140, 134, 134), dirtMaterial,null,null));
//        scene02.addObject(OBJReader.getModel3D("C:\\Users\\gabri\\OneDrive\\Documentos\\UNIVERSIDAD\\4-Semestre\\Multimedios\\Period2\\RayTracer\\RayTracerv1.0\\RayTracerv1.0\\scene03\\Meteors1.obj", new Vector3D(-4, 3, 8), new Color(59, 56, 56), dirtMaterial,null,null));
//





        BufferedImage image = raytrace(scene03);
        File outputImage = new File("evidence_9.png");
        try {
            ImageIO.write(image, "png", outputImage);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(new Date());
    }


    /**
     * rayTrace method casts the rays shadows, reflection and intersection rays adding a parallelized method, it only receives our scene as parameter
     */
    public static BufferedImage raytrace(Scene scene) {
        ExecutorService executorService = Executors.newFixedThreadPool(16);
        Camera mainCamera = scene.getCamera();
        BufferedImage image = new BufferedImage(mainCamera.getResolutionWidth(), mainCamera.getResolutionHeight(), BufferedImage.TYPE_INT_RGB);
        List<Object3D> objects = scene.getObjects();
        List<Light> lights = scene.getLights();

        Vector3D[][] positionsToRaytrace = mainCamera.calculatePositionsToRay();
        for (int i = 0; i < positionsToRaytrace.length; i++) {
            for (int j = 0; j < positionsToRaytrace[i].length; j++) {
                Runnable runnable = rayDrawing(image, objects,positionsToRaytrace, mainCamera, lights, i, j);
                executorService.execute(runnable);
            }
        }
        executorService.shutdown();

        try{
            if(!executorService.awaitTermination(4, TimeUnit.HOURS)){
                executorService.shutdown();
            }
        }catch(InterruptedException e){
            throw new RuntimeException(e);
        } finally {
            if(!executorService.isTerminated()){
                System.err.println("Cancel non-finished");
            }
        }
        executorService.shutdownNow();
        return image;
    }

    /**
     * rayDrawing generates all the properties of our ray tracer, for each light does all the process to create the image
     * receives as parameter, the image, our list of objects in the scene, the bidimensional vector of positions, the camera, our lights and the positions in x,y
     * returns a runnable process
     */
    public static Runnable rayDrawing(BufferedImage image, List<Object3D> objects, Vector3D [][] positionsToRaytrace, Camera mainCamera, List<Light> lights ,int i, int j){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                double x = positionsToRaytrace[i][j].getX() + mainCamera.getPosition().getX();
                double y = positionsToRaytrace[i][j].getY() + mainCamera.getPosition().getY();
                double z = positionsToRaytrace[i][j].getZ() + mainCamera.getPosition().getZ();
                double[] nearFarPlanes = mainCamera.getNearFarPlanes();

                double cameraZ = mainCamera.getPosition().getZ();
                Ray ray = new Ray(mainCamera.getPosition(), new Vector3D(x, y, z));
                Intersection closestIntersection = raycast(ray, objects, null, new double[]{cameraZ + nearFarPlanes[0], cameraZ + nearFarPlanes[1]});
                Color pixelColor = Color.BLACK;

                if (closestIntersection != null) {
                    Color objColor = closestIntersection.getObject().getColor();

                    for (Light light : lights) {
                        double nDotL = light.getNDotL(closestIntersection);
                        double intensity = light.getIntensity() * nDotL;

                        //Get the reflection color by the intersection with the objects
                        int reflectionDepth = 2;
                        if(closestIntersection.getObject().getMaterial().getReflection() != 0 ){
                            closestIntersection = reflection(closestIntersection, objects,  null, reflectionDepth, mainCamera);
                            objColor = closestIntersection.getObject().getColor();
                        }

                        //Refraction
                        if (closestIntersection.getObject().getMaterial().getRefraction() != 0) {
                            Intersection refractedIntersection = refraction(closestIntersection, objects, null, mainCamera);
                            if (refractedIntersection != null) {
                                closestIntersection = refractedIntersection;
                            }
                            objColor = closestIntersection.getObject().getColor();
                        }

                        Vector3D shadowRayDirection = Vector3D.normalize(Vector3D.substract(light.getPosition(), closestIntersection.getPosition()));
                        Vector3D shadowRayOrigin = Vector3D.add(closestIntersection.getPosition(), Vector3D.scalarMultiplication(shadowRayDirection, 0.001));
                        Ray shadowRay = new Ray(shadowRayOrigin, shadowRayDirection);
                        Intersection shadow = raycast(shadowRay, objects, closestIntersection.getObject(), new double[]{cameraZ + nearFarPlanes[0], cameraZ + nearFarPlanes[1]});

                        Color lightColor = light.getColor();
                        double[] lightColors = new double[]{lightColor.getRed() / 255.0, lightColor.getGreen() / 255.0, lightColor.getBlue() / 255.0};
                        double[] objColors = new double[]{objColor.getRed() / 255.0, objColor.getGreen() / 255.0, objColor.getBlue() / 255.0};
                        double magnitudeSquared = Math.pow(Vector3D.magnitude(Vector3D.substract(closestIntersection.getPosition(), light.getPosition())), 2);
                        double LightFallOff = intensity /  magnitudeSquared;

                        // Specular
                        double specular = blingPhong(ray, closestIntersection,light);

                        //Ambient
                        double ambient = closestIntersection.getObject().getMaterial().getAmbient();

                        for (int colorIndex = 0; colorIndex < objColors.length; colorIndex++) {
                            objColors[colorIndex] *= (ambient+LightFallOff+specular) * lightColors[colorIndex];
                        }
                        Color diffuse = new Color(clamp(objColors[0], 0, 1), clamp(objColors[1], 0, 1), clamp(objColors[2], 0, 1));
                        if (shadow != null && shadow.getObject() != closestIntersection.getObject()) {
                            diffuse = Color.BLACK;
                        }
                        pixelColor = addColor(pixelColor, diffuse);
                    }
                }
                image.setRGB(i, j, pixelColor.getRGB());
            }
        };
        return runnable;
    }


    /**
     * the method blingPhong creates the material specular for our lighting in the objects
     * receives as parameters our rays, the closest intersection and the lights
     * returns a double value to add it in the color index
     */
    public static double blingPhong(Ray ray, Intersection closestIntersection, Light light) {
        double shininess = 15.0;
        Vector3D lightSource =Vector3D.substract(light.getPosition(), closestIntersection.getPosition());
        Vector3D viewer = ray.getDirection();

        Vector3D VL = Vector3D.add(lightSource,viewer);
        Vector3D halfVector = Vector3D.scalarMultiplication(VL,1/Vector3D.magnitude(VL));

        double specular = Math.pow(Vector3D.dotProduct(closestIntersection.getNormal(), halfVector),shininess);
        return specular;
    }

/**
 * Using the reflection formula from https://blog.demofox.org/2017/01/09/raytracing-reflection-refraction-fresnel-total-internal-reflection-and-beers-law/
 * the method creates the reflection effect in objects with that property to cast those new colors in the scene
 * receives an intersection, a list of objects, the clipping planes, the number of reflection rebounds and the camera
 * returns an recursive intersection
 */
public static Intersection reflection(Intersection initialIntersection, List<Object3D> objects, double[] nearFarPlanes, int depth, Camera camera) {
    Vector3D incidentDirection = Vector3D.substract(initialIntersection.getPosition(), camera.getPosition());
    Vector3D surfaceNormal = initialIntersection.getNormal();

    double dotProduct = Vector3D.dotProduct(incidentDirection, surfaceNormal);
    Vector3D reflectRayDirection = Vector3D.substract(incidentDirection, Vector3D.scalarMultiplication(surfaceNormal, 2.0 * dotProduct));

    if (depth <= 2) {
        Intersection closestReflectIntersection = null;

        for (Object3D object : objects) {
            Vector3D reflectRayLocation = Vector3D.add(initialIntersection.getPosition(), Vector3D.scalarMultiplication(reflectRayDirection, 0.001));
            Ray reflectRay = new Ray(reflectRayLocation, reflectRayDirection);
            Intersection reflectIntersection = raycast(reflectRay, objects, initialIntersection.getObject(), nearFarPlanes);

            if (reflectIntersection != null && reflectIntersection.getObject() != object) {
                if (closestReflectIntersection == null || reflectIntersection.getDistance() < closestReflectIntersection.getDistance()) {
                    closestReflectIntersection = reflectIntersection;
                }
            }
        }

        if (closestReflectIntersection != null) {
            return reflection(closestReflectIntersection, objects, nearFarPlanes, depth + 1, camera);
        }
    }
    return initialIntersection;
}

    /**
     * Using the Cutler and Durand formulas for refraction from:   https://my.eng.utah.edu/~cs5600/slides/Wk%2013%20Ray%20Tracing.pdf
     * the method creates the refraction effect in objects with that property to cast those new colors in the scene
     * receives an intersection, a list of objects, our clipping planes and a camera
     * returns an recursive intersection
     */
public static Intersection refraction(Intersection initialIntersection, List<Object3D> objects, double[] nearFarPlanes, Camera camera) {
    Vector3D incidentDirection = Vector3D.substract(initialIntersection.getPosition(), camera.getPosition());
    Vector3D surfaceNormal = initialIntersection.getNormal();
    double refractiveIndex1 = 1.0;
    double refractiveIndex2 = initialIntersection.getObject().getMaterial().getRefraction();
    double cosTheta1 = Vector3D.dotProduct(incidentDirection, surfaceNormal);
    double eta = refractiveIndex1 / refractiveIndex2;
    double sinTheta2Squared = eta * eta * (1.0 - cosTheta1 * cosTheta1);

    if (sinTheta2Squared > 1.0) {
        return initialIntersection;
    }
    double cosTheta2 = Math.sqrt(1.0 - sinTheta2Squared);

    Vector3D refractRayDirection = Vector3D.add(Vector3D.scale(incidentDirection, eta),
            Vector3D.scale(surfaceNormal, eta * cosTheta1 - cosTheta2));

    if (Vector3D.magnitude(refractRayDirection) < 0.001) {
        return initialIntersection;
    }

    Vector3D refractRayLocation = Vector3D.add(initialIntersection.getPosition(), Vector3D.scale(refractRayDirection, 0.001));
    Ray refractRay = new Ray(refractRayLocation, refractRayDirection);
    Intersection refractIntersection = raycast(refractRay, objects, initialIntersection.getObject(), nearFarPlanes);

    if (refractIntersection != null) {
        return refractIntersection;
    } else {
        return initialIntersection;
    }
}


/**
 * clamp method Limit the values to avoid values out of possible bounds
 * receives the value, and his min and max
 * returns the new value limited
 */
    public static float clamp(double value, double min, double max) {
        if (value < min) {
            return (float) min;
        }
        if (value > max) {
            return (float) max;
        }
        return (float) value;
    }

    /**
     * Adds the posible rgb colors to our objects in the scene
     * receives 2 possible colors
     * returns the rgb code of the color
     */
    public static Color addColor(Color original, Color otherColor) {
        float red = clamp((original.getRed() / 255.0) + (otherColor.getRed() / 255.0), 0, 1);
        float green = clamp((original.getGreen() / 255.0) + (otherColor.getGreen() / 255.0), 0, 1);
        float blue = clamp((original.getBlue() / 255.0) + (otherColor.getBlue() / 255.0), 0, 1);
        return new Color(red, green, blue);
    }

    /**
     * Checks the intersection of all the rays in our scene to our objects inside the clipping planes
     * receives our ray, a list of objects, the object that casts the rays and the clipping planes
     * returns the intersection of the object
     */
    public static Intersection raycast(Ray ray, List<Object3D> objects, Object3D caster, double[] clippingPlanes) {
        Intersection closestIntersection = null;

        for (int k = 0; k < objects.size(); k++) {
            Object3D currentObj = objects.get(k);
            if (caster == null || !currentObj.equals(caster)) {
                Intersection intersection = currentObj.getIntersection(ray);
                if (intersection != null) {
                    double distance = intersection.getDistance();
                    double intersectionZ = intersection.getPosition().getZ();
                    if (distance >= 0 &&
                            (closestIntersection == null || distance < closestIntersection.getDistance()) &&
                            (clippingPlanes == null || (intersectionZ >= clippingPlanes[0] && intersectionZ <= clippingPlanes[1]))) {
                        closestIntersection = intersection;
                    }
                }
            }
        }

        return closestIntersection;
    }

}
