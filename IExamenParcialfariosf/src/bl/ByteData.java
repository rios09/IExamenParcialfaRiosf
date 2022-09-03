package bl;

import java.util.Scanner;

import ol.ByteClass;

public class ByteData {
	
	Scanner scan = new Scanner(System.in);

	public void byteInfo() {
		
		ByteClass bc = new ByteClass();
		System.out.println("Ingrese el valor en Bytes");
		bc.setByteNum(scan.nextDouble());
		bc.byteCalc();
	}
}
