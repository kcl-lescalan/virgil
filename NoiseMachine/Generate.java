/*
* SOURCE: X:\NetBeansProjects\Virgil\src\NoiseMachine\Generate.java
*   Created by Luis Escalante: 2014
*/

package NoiseMachine;

import java.util.Random;

public class Generate{
    
    private static PerlinNoise pn;
    
    private static double[] nArray;
    
    private static double generateNoise(double s1){
        return PerlinNoise.noise(s1);
    }

    public static double[] NoiseArray(int arraySize, int seed, double scale){
        //initializing
        Random r1 = new Random();
        nArray = new double[arraySize];
        
        //setting seed
        if(seed > 0){
            pn = new PerlinNoise(seed);
            //System.out.println("Array start: seed set to " + PerlinNoise.getSeed());
        }else{ 
            pn = new PerlinNoise(r1.nextInt(100000));
            //System.out.println("Array start: seed default to " + PerlinNoise.getSeed());
        }
        
        //generating and assigning noise values to nArray[]
        double initPoint = r1.nextDouble();
        System.out.println("initial point set to: " + initPoint);
        nArray[0] = generateNoise(initPoint);
        for(int i = 1; i < nArray.length; i++){
            initPoint += scale;
            nArray[i] = generateNoise(initPoint);
        }
        return nArray;
        
    }
}