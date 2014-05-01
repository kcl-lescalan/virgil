=====README=====
Project VIRGIL:

When student loans and minimum wage post-grad jobs come together in an attempt 
    to exploit a fun hobby in efforts to make ends meet, thus begins my decent
    into the blah blah blah-- insert cryptic/cliche phoenix rising metaphor.

===== 3-25-2014:: 10:31PM
Intended to be an extension of a lunar lander game to port to the Android market.

===== 4-30-2014:: 11:20PM
Noise Machine subdirectory added. 
Within lies PerlinNoise.java -- Ken Perlin's very own java port of his famous 
noise generation algorithm. I've added a constructor that allows for an initial
seed to be set since an static arbitrary seed would be selected without said 
constructor, thus generating the same sequence of noise upon each instance.

Generate.java takes a 1D noise point generated from PerlinNoise.java and plots it
across an array to allow for a 2D noise plot. Perfect for generating noisy terrain
as to be seen in the coming Lunar Lander app.

NoiseTest.java mirrors Generate.java, except it utilizes println statements to 
analyze the output of the generated array.
    
I'll look back at this and laugh one day, for whichever reason.