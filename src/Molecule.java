import java.util.ArrayList;

public class Molecule {
	
	private ArrayList<Atom> atoms;
	
	Molecule(){
		atoms = new ArrayList<Atom>();
	}
	
	public void addAtom(Atom a){
		atoms.add(a);
		resetCOM();
	}
	
	private void resetCOM(){
		
		double x_marg = 0.0;
		double y_marg = 0.0;
		double z_marg = 0.0;
		
		for(Atom a : atoms){
			x_marg += a.x;
			y_marg += a.y;
			z_marg += a.z;
		}
		
		x_marg /= atoms.size();
		y_marg /= atoms.size();
		z_marg /= atoms.size();
		
		for(Atom a : atoms){
			a.x -= x_marg;
			a.y -= y_marg;
			a.z -= z_marg;
		}
	}
		
}
