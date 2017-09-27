import processing.core.PApplet;

public class UsingProcessing extends PApplet{

	int x_center,y_center,i;	
	int x_press, y_press;
	int x_drag, y_drag;
	
	float x_rot, y_rot;
	
	static Molecule mol;
	
    public static void main(String[] args) {
        PApplet.main("UsingProcessing");
        mol = new Molecule("benzene.xyz");
    }

    public void settings(){
    		size(600,600,P3D); 
    }

    public void setup(){
        fill(120,50,240);
        x_center = width/2;
        y_center = height/2;
        translate(x_center,y_center,0);
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
        
        mol = new Molecule();
        mol.addAtom(new Atom("H",100,0,0));
        mol.addAtom(new Atom("H",-100,0,0));
        mol.addAtom(new Atom("H",50,86.6025403784,0));
        mol.addAtom(new Atom("H",50,-86.6025403784,0));
        mol.addAtom(new Atom("H",-50,86.6025403784,0));
        mol.addAtom(new Atom("H",-50,-86.6025403784,0));


    }

    public void draw(){
    	background(100,200,0);
        translate(x_center,y_center,0);
        
        float x_moved = (float)((x_drag-x_press)/200.0);
        float y_moved = (float)((y_press-y_drag)/200.0);
        
        System.out.println(x_drag + " " + x_press);

        
        rotateY(x_moved+x_rot);
        rotateX(y_moved+y_rot);


        sphereDetail(10);

        for(Atom a : mol.atoms){
        	translate((float)a.x,(float)a.y,(float)a.z);
            sphere(40);
        	translate(-(float)a.x,-(float)a.y,-(float)a.z);
        }



        strokeWeight(10);  // Beastly
        line(50,(float)86.6025403784,0, 100, 0, 0);
        line(100, 0, 0,50,(float)-86.6025403784,0);
        line(50,(float)-86.6025403784,0,-50,(float)-86.6025403784,0);
        line(-50,(float)-86.6025403784,0, -100, 0, 0);
        line(-100, 0, 0,-50,(float)86.6025403784,0);
        line(-50,(float)86.6025403784,0,50,(float)86.6025403784,0);


        mol.addAtom(new Atom("H",100,0,0));
        mol.addAtom(new Atom("H",-100,0,0));
        mol.addAtom(new Atom("H",50,86.6025403784,0));
        mol.addAtom(new Atom("H",50,-86.6025403784,0));
        mol.addAtom(new Atom("H",-50,86.6025403784,0));
        mol.addAtom(new Atom("H",-50,-86.6025403784,0));
        ++i;
        strokeWeight(1);  // Beastly


    }

    public void mousePressed(){
    	x_press = mouseX;
    	y_press = mouseY;
    	x_drag = mouseX;
    	y_drag = mouseY;
    }
    
    public void mouseDragged(){
    	x_drag = mouseX;
    	y_drag = mouseY;
    }
    
    public void mouseReleased(){
        x_rot +=(float)((x_drag-x_press)/200.0);
        y_rot += (float)((y_press-y_drag)/200.0);
    	x_press = 0;
    	y_press = 0;
    	x_drag = 0;
    	y_drag = 0;
    }
    
}