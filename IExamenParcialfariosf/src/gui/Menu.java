package gui;

import java.util.Scanner;

import bl.ByteData;
import bl.KilobyteData;

public class Menu {

	Scanner scan = new Scanner(System.in);
	
	public void menu() {
		System.out.println("Bienvenido a la aplicacion!\n"+"Selecciona la opcion que deseas ejectuar:\n");
		System.out.println("1. Convertir bytes a Kilobytes");
		System.out.println("2. Convertir kilobytes a Megabytes");
		System.out.println("3. Salir");		
	}
	
	public void showMenu() {
		
		short op = 0;
	
		do {
			System.out.println("");
			menu();
			System.out.println("");
			op= scan.nextShort();

			switch(op) {
			
			case 1:
				ByteData d = new ByteData();
				d.byteInfo();
				break;
				
			case 2:
				KilobyteData f = new KilobyteData();
				f.kiloInfo();
				break;
				
			case 3: System.exit(0);
				break;
				
			}
		}while(op!=3);
	}
	
}
