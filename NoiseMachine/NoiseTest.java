/*
* SOURCE: X:\NetBeansProjects\Virgil\src\NoiseMachine\NoiseTest.java
*   Created by Luis Escalante: 2014
*/

package NoiseMachine;

import java.util.Random;

public class NoiseTest{
    
    private static PerlinNoise pn;
    
    private static double[] noiseArray;
    private static int seed = 0;
    
    private static double generateNoise(double s1){
        return PerlinNoise.noise(s1);
    }
    
    public static void main(String[] args){
        //initializing
        Random r1 = new Random();
        noiseArray = new double[50];
        
        //setting seed;
        if(seed > 0){
            pn = new PerlinNoise(seed);
            System.out.println("Array start: seed set to " + PerlinNoise.getSeed());
        }else{ 
            pn = new PerlinNoise(r1.nextInt(100000));
            System.out.println("Array start: seed default to " + PerlinNoise.getSeed());
        }
        
        double initPoint = r1.nextDouble();
        noiseArray[0] = generateNoise(initPoint);
        
        for(int i = 1; i < noiseArray.length; i++){
            initPoint += 0.05;
            noiseArray[i] = generateNoise(initPoint);
            System.out.println(noiseArray[i]);
        }        
    }
}