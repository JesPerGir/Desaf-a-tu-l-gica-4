package TopGun;

public class Avion {
	
	private static int contadorId = 0;
	private int idAvion, capAvion;
	private String modAvion;
	private Piloto piloto;

	
	public Avion(String modAvion, int capAvion, Piloto piloto) {
		
		contadorId++;
		idAvion=contadorId;
		this.modAvion=modAvion;
		this.capAvion=capAvion;
		this.piloto=piloto;
		
	}
	
	public int getId() {
		return idAvion;
	}
	
	public void setCapAvion(int capAvion) {
		this.capAvion=capAvion;
	}
	
	public int getCapAvion() {
		return capAvion;
	}
	
	public void setModAvion(String modAvion) {
		this.modAvion=modAvion;
	}
	
	public String getModAvion() {
		return modAvion;
	}
	
	public void setPiloto(Piloto piloto) {
		this.piloto=piloto;
	}
	
	public Object getPiloto() {
		return piloto;
	}
	
	
	public void mostrarAvion(){
		System.out.print("El avión es el modelo " + modAvion + " con ID " + idAvion + ", capacidad para " + capAvion + " personas y ");
		piloto.mostrarPiloto();
	}
}
