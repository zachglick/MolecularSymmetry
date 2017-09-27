import processing.core.PApplet;

public class UsingProcessing extends PApplet{

	int x,y,i;
    public static void main(String[] args) {
        PApplet.main("UsingProcessing");
    }

    public void settings(){
    		size(1000,1000,P3D); 
    }

    public void setup(){
        fill(120,50,240);
        x = width/2;
        y = height/2;
        translate(x,y,0);
        sphereDetail(30);
        sphere(40);
        translate(100,100,100);
        sphere(40);
        translate(100,100,100);
        sphere(40);
        translate(-300,-300,-300);
        sphere(40);
        translate(-100,-100,-100);
        sphere(40);
        strokeWeight(10);  // Beastly

        line(0, 0, 0, 500, 500, 500);
        i = 0;





    }

    public void draw(){
    	background(100,200,0);
        fill(120,50,240);
        x = i%width;
        y = i%width;
        translate(x,y,0);
        sphereDetail(10);
        sphere(40);
        translate(100,100,100);
        sphere(40);
        translate(100,100,100);
        sphere(40);
        translate(-300,-300,-300);
        sphere(40);
        translate(-100,-100,-100);
        sphere(40);
        translate(-100,-100,-100);
        strokeWeight(10);  // Beastly
        line(0, 0, 0, 600, 600, 600);
        ++i;
        strokeWeight(1);  // Beastly

    }

}