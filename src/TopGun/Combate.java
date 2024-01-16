package TopGun;

public class Combate extends Avion {

	private boolean esFurtivo=false;
	
	Combate(Piloto piloto){
		super("Eurofighter Typhoon", 1, piloto);
		esFurtivo=true;
	}
	
	Combate(String modAvion, int capAvion, Piloto piloto){
		super(modAvion, capAvion, piloto);
		esFurtivo=true;
	}
	
	public boolean getEsFurtivo(){
		return esFurtivo;
	}

		
}
