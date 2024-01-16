package TopGun;

public class Entrenamiento extends Avion {
	
	private boolean tieneDobleMando=false;
	
	Entrenamiento(Piloto piloto){
		super("Cessna Citation V", 11, piloto);
		tieneDobleMando=true;
	}
	
	Entrenamiento(String modAvion, int capAvion, Piloto piloto){
		super(modAvion, capAvion, piloto);
		tieneDobleMando=true;
	}
	
	public boolean getTieneDobleMando(){
		return tieneDobleMando;
	}

}
