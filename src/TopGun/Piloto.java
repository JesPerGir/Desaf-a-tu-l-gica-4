package TopGun;

public class Piloto {
	private int idPiloto, horasVueloPiloto;
	private static int contadorId=0;
	private String nomPiloto, rangoPiloto;
	
	public Piloto(String nomPiloto, String rangoPiloto, int horasVueloPiloto){
		
		contadorId++;
		this.nomPiloto=nomPiloto;
		this.rangoPiloto=rangoPiloto;
		this.horasVueloPiloto=horasVueloPiloto;
		idPiloto=contadorId;
	}
	
	public void mostrarPiloto() {
		System.out.println("El piloto es " +  nomPiloto + " su ID es " + idPiloto + " con rango " + rangoPiloto + " y " + horasVueloPiloto + " horas de vuelo.");
	}
	
	public int getidPiloto() {
		return idPiloto;
	}
	
	public void setNomPiloto(String nomPiloto) {
		this.nomPiloto=nomPiloto;
	}
	
	public String getNomPiloto() {
		return nomPiloto;
	}
	
	public void setRangoPiloto(String rangoPiloto) {
		this.rangoPiloto=rangoPiloto;
	}
	
	public String getRangoPiloto() {
		return rangoPiloto;
	}
	
	public void setHorasVueloPiloto(int horasVueloPiloto) {
		this.horasVueloPiloto=horasVueloPiloto;
	}
	
	public float getHorasVueloPiloto() {
		return horasVueloPiloto;
	}
	
	
	
	
	
}
