package paquete;

import java.util.Scanner;

public class Persona {
	private String nombre;
	private String apellido;
	private String edad;
	private String hobbie;
	private String editor;
	private String sistema;
	
	public Persona () {
		Scanner scan1=new Scanner(System.in);
		System.out.println("Ingrese su nombre: ");
		nombre=scan1.nextLine();
		
		Scanner scan2=new Scanner(System.in);
		System.out.println("Ingrese su apellido: ");
		apellido=scan2.nextLine();
		
		Scanner scan3=new Scanner(System.in);
		System.out.println("Ingrese su edad: ");
		edad=scan3.nextLine();
		
		Scanner scan4=new Scanner(System.in);
		System.out.println("Ingrese su hobbie: ");
		hobbie=scan4.nextLine();
	
		Scanner scan5=new Scanner(System.in);
		System.out.println("Ingrese su editor favorito: ");
		editor=scan5.nextLine();

		Scanner scan6=new Scanner(System.in);
		System.out.println("Ingrese su sistema operativo favorito: ");
		sistema=scan6.nextLine();
		
		System.out.println("Su nombre es: "+ nombre+'\n'+"Su apellido es: " + apellido + '\n'+ "Su edad es: "+ edad+'\n'+"Su hobbie es: "+hobbie+'\n'+"Su editor favorito es: "+editor+'\n'+"Su sistema operativo favorito es: "+ sistema);
		
	}
	
	public static void main (String []args) {
		
		Persona p1=new Persona();
	}
	
	
	

}
