import java.util.ArrayList;

public class Molecule {
	
	ArrayList<Atom> atoms;
	double x_com, y_com, z_com;

	Molecule(){
		atoms = new ArrayList<Atom>();
		x_com = 0;
		y_com = 0;
		z_com = 0;
	}
	
	Molecule(String fname){
		
	}
	
	public void addAtom(Atom a){
		x_com = (x_com*atoms.size() + a.x)/(atoms.size()+1);
		y_com = (y_com*atoms.size() + a.y)/(atoms.size()+1);
		z_com = (z_com*atoms.size() + a.z)/(atoms.size()+1);
		atoms.add(a);
		ArrayList<Atom> centeredAtoms = new ArrayList<Atom>();
	}
	
		
}
