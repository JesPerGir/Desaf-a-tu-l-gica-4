package TopGun;

import java.util.Scanner;

public class Gestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre, rango, modelo;
		int horasVuelo, capacidad;
		
		Piloto piloto1 = new Piloto("Pete Maverick", "Capitán", 10000);
		Piloto piloto2 = new Piloto("Natasha Phoenix", "Teniente", 3000);
		Piloto piloto3 = new Piloto("Bradley Rooster", "Teniente", 3500);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el nombre del primer piloto");
		nombre=entrada.nextLine();
		System.out.println("Introduce el rango del primer piloto");
		rango=entrada.nextLine();
		System.out.println("Introduce las horas de vuelo del primer piloto");
		horasVuelo=Integer.parseInt(entrada.nextLine());

		Piloto piloto4 = new Piloto(nombre, rango, horasVuelo);
		
		System.out.println("Introduce el nombre del segundo piloto");
		nombre=entrada.nextLine();
		System.out.println("Introduce el rango del segundo piloto");
		rango=entrada.nextLine();
		System.out.println("Introduce las horas de vuelo del primer piloto");
		horasVuelo=Integer.parseInt(entrada.nextLine());
		
		Piloto piloto5 = new Piloto(nombre, rango, horasVuelo);
		
		piloto1.mostrarPiloto();
		piloto3.mostrarPiloto();
		piloto4.mostrarPiloto();
		piloto5.mostrarPiloto();
		
		Avion avion1 = new Entrenamiento(piloto1);
		Avion avion2 = new Combate(piloto4);
		Avion avion3 = new Combate("McDonnell Douglas EF-18 Hornet", 1, piloto3);
		Avion avion4;
		Avion avion5;
		
		System.out.println("Introduce el modelo del primer avión de entrenamiento");
		modelo=entrada.nextLine();
		System.out.println("Introduce la capacidad del primer avión de entrenamiento");
		capacidad=Integer.parseInt(entrada.nextLine());
		System.out.println("Elige un piloto disponible (Piloto2 o Piloto5)");
		nombre=entrada.nextLine();
		
		if(nombre.equals("Piloto2")) {
			avion4 = new Entrenamiento(modelo, capacidad, piloto2);
			System.out.println("Introduce el modelo del segundo avión de entrenamiento");
			modelo=entrada.nextLine();
			System.out.println("Introduce la capacidad del segundo avión de entrenamiento");
			capacidad=Integer.parseInt(entrada.nextLine());
			System.out.println("Se asignará el piloto 5 de forma predeterminada ya que es el único disponible.");
			avion5 = new Entrenamiento(modelo, capacidad, piloto5);
		}
		else {
			avion4 = new Entrenamiento(modelo, capacidad, piloto5);
			System.out.println("Introduce el modelo del segundo avión de entrenamiento");
			modelo=entrada.nextLine();
			System.out.println("Introduce la capacidad del segundo avión de entrenamiento");
			capacidad=Integer.parseInt(entrada.nextLine());
			System.out.println("Se asignará el piloto 2 de forma predeterminada ya que es el único disponible.");
			avion5 = new Entrenamiento(modelo, capacidad, piloto2);
		}

		entrada.close();
		
		avion1.mostrarAvion();
		avion2.mostrarAvion();
		avion3.mostrarAvion();
		avion4.mostrarAvion();
		avion5.mostrarAvion();
		
	}

}
