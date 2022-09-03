package bl;

import java.util.Scanner;

import ol.Kilobyte;

public class KilobyteData {

	Scanner scan = new Scanner(System.in);
	
	public void kiloInfo() {
		Kilobyte kb = new Kilobyte();
		System.out.println("Ingrese el valor en Kilobytes");
		kb.setKilobyte(scan.nextDouble());		
		kb.kilobyteCalc();
	}
	
}
