import java.util.Scanner;

public class ComprobarFecha {
	static Integer entrada;
	static String fecha = ""; 
	
	static void leer(String aux) {
		System.out.println("Introduzca " + aux + " :");
		Scanner escaner = new Scanner (System.in);
		entrada = Integer.valueOf(escaner.nextLine());
		/*if ((aux=="mes") || (aux=="a�o")) {
			fecha = fecha +"/"+ entrada.toString();
		} else {
			fecha = entrada.toString();
		}*/
		fecha += "/"+ entrada.toString();
	}
	
	
	static boolean comprobar(String aux) {
		boolean bool = false;
		
		if (aux == "d�a") {
			if ((entrada >= 1) && (entrada<=31)) {
				bool = true;
			} else {
				bool = false;
			}
		} else if (aux == "mes") { //Aqu� me qued�
			if ((entrada >= 1) && (entrada<=12)) {
				bool = true;
			} else {
				bool = false;
			}
		} else if (aux == "a�o") {
			if ((entrada >= 0) && (entrada<=2050)) {
				bool = true;
			} else {
				bool = false;
			}
		}
			
		return bool;
	}
	static void empezar() {
		boolean aux = false;
		
		leer("d�a") ;
		aux = comprobar("d�a");
		
		leer("mes"); 
		aux &= comprobar("mes");
		
		leer("a�o");
		aux &= comprobar("a�o"); 
		
		if (aux) {
			System.out.println("La fecha " + fecha.substring(1) + " es v�lida.");
		} else {
			System.out.println("La fecha " + fecha.substring(1) + " no es v�lida.");
		}
		
		
		
		
	}
	public static void main(String[] args) {
		
		empezar(); 
		System.out.println("Adi�s");

	}

}
